package org.mackristof.test;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by christophe mourette on 05/12/14 for Geomatys.
 */
public class HTMLHello extends HttpServlet {
    private InitialFeature initialFeature;

    public void init() throws ServletException {
        initialFeature = new InitialFeature();
    }

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws ServletException, IOException
    {
        // Set response content type
        response.setContentType("text/html");

        // Actual logic goes here.
        PrintWriter out = response.getWriter();
        out.println("<h1>" + initialFeature.sayHello(request.getParameter("msg")) + "</h1>");
    }

    public void destroy()
    {
        // do nothing.
    }

}
