package com.coffee;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/userservlet")
public class UserServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        resp.setCharacterEncoding("UTF-8");
        req.setCharacterEncoding("UTF-8");
        String username = req.getParameter("username");
        String pwd = req.getParameter("pwd");
        String gender = req.getParameter("gender");
        String[] hobbies = req.getParameterValues("hobbies");
        PrintWriter out = resp.getWriter();
        out.println("用户名:" + username + "</br>");
        out.println("密码:" + pwd + "</br>");
        out.println("性别:" + gender + "</br>");
        out.println("爱好:");
        for(String hobby : hobbies) {
            out.println(hobby);
        }
        out.flush();
        out.close();
    }
}
