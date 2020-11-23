<%--
  Created by IntelliJ IDEA.
  User: zhang
  Date: 20.11.15 015
  Time: 11:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
  <head>
    <title >会员注册页面</title>
      <link href="register.css" rel="stylesheet" type="text/css"/>
  </head>
  <body>
  <div>
    <div id="all">
        <div id="top">
            <h4 >注册会员信息</h4><br/>
        </div>
        <div id="card">
            <form id="form" action="register.htm" method="post" >
                <div class="row">
                    <div class="inrow">
                        <label>登录名：</label><br/>
                        <label>
                            <input class="search" name="username" type="text">
                        </label>
                    </div>
                    <div id="emile" class="inrow">
                        <label>邮箱地址：</label><br/>
                        <label>
                            <input class="search" name="emile" type="text">
                        </label>
                    </div>
                </div>
                <div class="row">
                    <div class="inrow">
                        <label >密码：</label><br/>
                        <label>
                            <input class="search" name="password" type="password"/>
                        </label>
                    </div>
                    <div id="confidPassword" class="inrow">
                        <label>密码确认：</label><br/>
                        <label>
                            <input class="search" name="confirdPassword" type="password"/>
                        </label>
                    </div>
                </div>
                <div id="btn">
                    <p style="color: dimgray; font-size: 12px">注册即代表同意注册条款</p>
                    <button id="login" type="submit" >注册</button>
                </div>
            </form>
        </div>
        <div style="text-align: center;color: darkblue;font-size: 12px;padding-top: 10px;padding-bottom: 30px;text-decoration: none">
            <a href="login.jsp">如已有账号，点此登录👉</a>
        </div>
    </div>
  </div>
  </body>
</html>
