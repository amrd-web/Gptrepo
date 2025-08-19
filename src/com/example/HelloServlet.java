package com.example;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class HelloServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        
        response.setContentType("text/html");
        response.getWriter().println("<h1>Hello from Servlet in Jenkins + Ant + Tomcat CI/CD!</h1>");
    }
}
