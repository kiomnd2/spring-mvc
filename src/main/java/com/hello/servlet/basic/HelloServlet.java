package com.hello.servlet.basic;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "helloServlet", urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        System.out.println("hello servlet");

        String username = req.getParameter("username");
        System.out.println("username = " + username);

        res.setCharacterEncoding("UTF-8");
        res.setContentType("text/plain");
        res.getWriter().println("hello");


    }
}
