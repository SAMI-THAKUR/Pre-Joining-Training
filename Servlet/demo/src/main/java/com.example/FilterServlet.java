package com.example;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// @WebFilter("/*") // all the endpoints
// @WebFilter("/home") // one specific endpoints
@WebFilter({ // list of endpoints
    "/home", "/admin"
})
public class FilterServlet implements Filter{
    private boolean pass = true;
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException{
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;
        // if the req is unauth or not valid
        if(pass){
            res.getWriter().print("Unauth Access");
            return;
        }

        
        // if everything is good then pass to actual endpoint
        chain.doFilter(req, res);


    }
    
}
