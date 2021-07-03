package com.maryanto.dimas.udemy.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "index", urlPatterns = "/servlet")
public class IndexController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("<html>\n" +
                "<head><title>Belajar Java Web</title></head>\n" +
                "<body><h3>Testing servlet works!</h3></body>\n" +
                "</html>");
    }
}
