package com.geo.include;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author zhang
 */
@WebServlet(name = "SuccessServlet",urlPatterns = {"/success.htm"})
public class SuccessServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE HTML PUBLIC\"-//W3C//DTD HTML4.01 Transitional//EN\">");
        out.println("<HTML>");
        out.println("   <HEAD><TITLE>新增会员成功</TITLE></HEAD>");
        out.println("   <BODY>");
        out.print("<h2>会员"+request.getParameter("username")+"注册成功<h2/>");
        out.print("<a href=\""+request.getContextPath()+"/login.jsp\">返回首页登录</a>");
        out.println("   </BODY>");
        out.println("</HTML>");
        out.flush();
        out.close();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //调用doPost方法
        doPost(request,response);
    }
}
