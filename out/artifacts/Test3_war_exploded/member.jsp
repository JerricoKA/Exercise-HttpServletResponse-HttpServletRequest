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
    <meta content="text/html;charset=UTF-8">
    <title>会员登录成功</title>
</head>

<body>
    <h2>会员<%=request.getParameter("username")%>您好！</h2>
    <a href="login.jsp">返回首页登录 👉</a>
</body>
</html>
