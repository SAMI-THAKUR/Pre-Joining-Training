package com.example.controller;

import java.io.IOException;

import com.example.dao.UserDAO;
import com.example.model.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet(
    urlPatterns="/login"
)
public class LoginUser extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        try{
            String email = request.getParameter("email");
            String password = request.getParameter("password");

            UserDAO dao = new UserDAO();
            User user = dao.login(email,password);
            if (user != null) {
                HttpSession session = request.getSession();
                session.setAttribute("user", user);
                response.sendRedirect("welcome.jsp");
            } else {
                request.setAttribute(
                    "error",
                    "Invalid email or password"
                );
                request.getRequestDispatcher("login.jsp").forward(request, response);
            }
        }catch (Exception e) {
            e.printStackTrace();

            response.setContentType("text/plain");
            response.getWriter().println("Error occurred:");
            response.getWriter().println(e.getMessage());
        // Alternative:
        // response.sendError(
        //     HttpServletResponse.SC_INTERNAL_SERVER_ERROR,
        //     e.getMessage()
        // );
        }

    }
    
}
