package com.geo.include;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * @author zhang
 */
@WebServlet(name = "errorServlet",urlPatterns = {"/error.htm"})
public class ErrorServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected  void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out =  response.getWriter();
        out.println("<!DOCTYPE HTML PUBLIC\"-//W3C//DTD HTML4.01 Transitional//EN\">");
        out.println("<HTML>");
        out.println("   <HEAD><TITLE>新增会员失败</TITLE></HEAD>");
        out.println("   <BODY>");
        out.print("<h2>新增会员失败<h2/>");
        //遍历错误信息
        List<String> list = (List<String>)request.getAttribute("errors");
        for (String str:list){
            out.print(str+"<br>");
        }
        out.print("<a href=\""+request.getContextPath()+"/register.jsp\"></a>");
        out.println("   </BODY>");
        out.println("</HTML>");
        out.flush();
        out.close();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        doPost(request,response);
    }
}
