package com.example.controller;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;;

@WebListener
public class AppListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext context = sce.getServletContext();
        context.setAttribute("college", "VESIT Mumbai");
        context.setAttribute("appVersion", "1.0");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce){
        System.out.print("Application Closed");
    }
}
