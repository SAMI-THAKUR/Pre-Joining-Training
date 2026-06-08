package com.example.controller;

import java.io.IOException;

import com.example.dao.UserDAO;
import com.example.model.Department;
import com.example.model.Gender;
import com.example.model.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet(
    urlPatterns="/register"
)
public class RegisterUser extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        try {
            String name = request.getParameter("name");
            String email = request.getParameter("email");
            String password = request.getParameter("password");

            Gender gender = Gender.valueOf(request.getParameter("gender"));
            Department department = Department.valueOf(request.getParameter("department"));

            User user = new User(name,email,password,gender,department);
            UserDAO dao = new UserDAO();
            boolean success = dao.registerUser(user);
            if (success) {
                response.sendRedirect("login.jsp");
            } else {
                response.sendError(
                    HttpServletResponse.SC_BAD_REQUEST,
                    "Registration failed"
                );
            }
        } catch (Exception e) {
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
