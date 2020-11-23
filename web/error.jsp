<%@ page import="java.util.List" %>
<%--
  Created by IntelliJ IDEA.
  User: zhang
  Date: 20.11.15 015
  Time: 11:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>新增会员失败</title>
</head>
<body>
    <h2>新增会员失败</h2>
    <%
        //遍历错误信息
        List<String> list = (List<String>)request.getAttribute("errors");
        for(String str:list){
            out.println(str+"<br>");
        }
    %>
    <a href="register.jsp">返回注册首页</a>
</body>
</html>
