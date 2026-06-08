package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



@WebServlet(
    urlPatterns="/admin",
    initParams={
        @WebInitParam(name="role" , value="admin")
    }
)
public class AdminServlet extends HttpServlet {
    private String role;
    @Override
    public void init() throws ServletException {
        super.init();
        ServletConfig config = getServletConfig();
        role = config.getInitParameter("role");   
    }

    @Override
    protected  void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        ServletContext context = getServletContext();
        // Configuration for ENTIRE application Shared by all servlets.
        context.setAttribute("company", "ISS STOXX (set by AdminServlet)");

        PrintWriter out = response.getWriter();
        out.println("Role "+ role);
    }
}
