package com.codegym.convertcurrency;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/convert", name = "converCurrency")
public class ConvertCurrency extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Method doGet");
        float rate = Float.parseFloat(req.getParameter("rate"));
        float usd = Float.parseFloat(req.getParameter("usd"));
        float vnd = rate * usd;
//        PrintWriter printWriter = resp.getWriter();
//        printWriter.println("<html>");
//        printWriter.println("<h1>Rate: "+rate+"</h1>");
//        printWriter.println("<h1>USD: "+usd+"</h1");
//        printWriter.println("<h1>VND: "+vnd+"</h1>");
//        printWriter.println("</html>");
        req.setAttribute("rRate",rate);
        req.setAttribute("rUsd",usd);
        req.setAttribute("rVND",vnd);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/result.jsp");
        requestDispatcher.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Method doPost");
        float rate = Float.parseFloat(req.getParameter("rate"));
        float usd = Float.parseFloat(req.getParameter("usd"));
        float vnd = rate * usd;
        PrintWriter printWriter = resp.getWriter();
        printWriter.println("<html>");
        printWriter.println("<h1>Rate: "+rate+"</h1>");
        printWriter.println("<h1>USD: "+usd+"</h1");
        printWriter.println("<h1>VND: "+vnd+"</h1>");
        printWriter.println("</html>");
    }
}
