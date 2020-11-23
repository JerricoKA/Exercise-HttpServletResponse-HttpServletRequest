<%--
  Created by IntelliJ IDEA.
  User: zhang
  Date: 20.11.15 015
  Time: 11:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>会员登录页面</title>
    <link href="login.css" rel="stylesheet" type="text/css"/>
</head>
<body>
<div id="left">
    <div>
        <h4>会员登录</h4><br/>
    </div>
        <c:if test="${not empty requestScope.error}">
            ${requestScope.error }
        </c:if>
        <form action="login.htm" method="post" >
            <div id="left_dex">
                <div class="form_group">
                    <label class="searchname">登录名:</label><br/>
                    <label>
                        <input id="username" name="username" class="search"/><br/>
                    </label>
                </div>
                <div class="form_group">
                    <label class="searchname">密码：</label><br/>
                    <label>
                        <input id="passwprd" name="password" type="password" class="search"/><br/>
                    </label>
                    <div id="left_button">
                </div>
                        <button id="button" type="submit">登录</button>
                    </div>
                <div id="login_form">
                    还没有账号？
                    <a href="register.jsp">马上注册 👉</a>
                </div>
            </div>
        </form>
</div>
</body>
</html>
