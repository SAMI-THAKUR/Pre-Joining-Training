package com.example;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class AppListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {

        System.out.println("Application Started");

        sce.getServletContext().setAttribute("data", "this data was set by Event Listner");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("Application Stopped");
    }
}

/* LISTENERS IN SERVLETS A Listener is a special component that waits for events in a web application and 
automatically executes code when those events occur.

Event -> Listener -> Action

Listeners are used for:
- Application startup/shutdown logic
- Session tracking
- Request tracking
- Monitoring attribute changes
- Logging and auditing
- Resource initialization and cleanup

1. ServletContextListener (Application Listener) Listens to application lifecycle events.
Methods:
- contextInitialized()
- contextDestroyed()

Called:
- When application starts
- When application stops

Use Cases:
- Load configuration
- Create DB connection pool
- Initialize cache
- Set global ServletContext attributes

Scope:
Application Scope

2. HttpSessionListener (Session Listener) Listens to session creation and destruction.
Methods:
- sessionCreated()
- sessionDestroyed()

Called:
- request.getSession() creates a session
- Session expires or is invalidated

Use Cases:
- Count active users
- Track logins/logouts
- Session analytics

Scope:
Session Scope

3. HttpSessionAttributeListener Listens for changes to session attributes.
Methods:
- attributeAdded()
- attributeRemoved()
- attributeReplaced()

Example:
session.setAttribute("email", "abc@gmail.com");

Use Cases:
- Audit user data changes
- Logging

Scope:
Session Scope

4. ServletRequestListener

Listens to request lifecycle.

Methods:
- requestInitialized()
- requestDestroyed()

Called:
- Request enters application
- Request finishes

Use Cases:
- Request logging
- Performance monitoring
- Analytics

Scope:
Request Scope

*/