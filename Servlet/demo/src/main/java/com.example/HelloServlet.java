package com.example;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet(
    urlPatterns = "/hello",
    initParams={
        @WebInitParam(name="endpoint", value="/hello"),
        @WebInitParam(name="version", value="1.0")
    }
) // URL Mapping and parameters initialize

public class HelloServlet extends HttpServlet { // Without extending HttpServlet, Tomcat won't treat it as a servlet
    private String endpoint;
    private String version;
    private String company;
    private String data;
    @Override
    public void init() throws ServletException {
        super.init();
        ServletConfig config = getServletConfig();
        endpoint = config.getInitParameter("endpoint");
        version = config.getInitParameter("version");

        // Read in init() if it's application configuration
        // Read in doGet()/doPost() if it's shared data that may change
        ServletContext context = getServletContext();
        company = (String) context.getAttribute("company");
        data = (String) context.getAttribute("data");
    }

    @Override // Runs whenever a GET request comes.
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*
            HttpServletRequest request: Contains data coming from the client
            HttpServletResponse response: Used to send data back
        */
        response.setContentType("text/plain"); // 
        
        // not the ideal way to read config usually read in the init() function of the Servlet
        // ServletConfig config = getServletConfig();
        // String version = config.getInitParameter("version");
        // String endpoint = config.getInitParameter("endpoint");

        PrintWriter out = response.getWriter(); // This gives us a "pen" to write into the response

        out.println("Hello World " + endpoint);
        out.println("Endpoint: " + endpoint);
        out.println("Version: " + version);
        out.println("Company " + company);
        out.print("Data " + data);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // response.setContentType("text/plain");
        // Life time of request is just one request
        String name = request.getParameter("name"); // read the value of the "name" parameter from the request
        String email = request.getParameter("email");
        // parameters: Browser -> Servlet

        

        if (name == null || name.trim().isEmpty()) {
            name = "GUEST";
        }
        if (email==null || email.trim().isEmpty()){
            email = "guest@gmail.com";
        }

        //attributes: Servlet -> Browser
        // request.setAttribute("userName", name);
        // request.setAttribute("userEmail", email);

        Cookie nameCookie = new Cookie("userName", URLEncoder.encode(name, StandardCharsets.UTF_8));
        nameCookie.setMaxAge(4 * 24 * 60 * 60);
        nameCookie.setPath("/");
        // but cookie can be modified via browser

        // create or get session 
        /*
            Instead of storing data in browser:
            Store data on server.
            Browser only gets a session ID.
            Life Time is one user Session
        */
        HttpSession session = request.getSession();
        session.setAttribute("email", email);

        // Add cookies to response
        response.addCookie(nameCookie);

        // JSP stands for JAVA SERVER PAGE (HTML + JAVA)
        // RequestDispatcher rd = request.getRequestDispatcher("/welcome.jsp"); // servlet can forward a request to another resource
        // rd.forward(request, response);
        // in rd only one request //
        // Browser -> Server -> welcome.jsp -> Browser


        response.sendRedirect("welcome.jsp");
        // when we  call this multiple request 
        // Browser -> Server -> Browser -> welcome.jsp -> Browser

        // PrintWriter out = response.getWriter();
        // out.write("Hello " + name);
    }
}
