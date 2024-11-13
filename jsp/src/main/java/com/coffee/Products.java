package com.coffee;

import pojo.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/pros")
public class Products extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Product> list = new ArrayList<Product>();

        Product pro1 = new Product(1,"手机",6999);
        Product pro2 = new Product(2,"平板",7999);
        Product pro3 = new Product(3,"电脑",8999);
        list.add(pro1);
        list.add(pro2);
        list.add(pro3);
        req.setAttribute("pros", list);
        req.getRequestDispatcher("products.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
