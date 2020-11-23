# 练习HttpServletResponse、HttpServletRequest的使用

### 一、实验目的

1. 练习HttpServletResponse、HttpServletRequest的使用。

### 二、实验环境

IntelliJ IDEA 2020.1.3 + jdk-15.0 + apache-tomcat-9.0.39

### 三、实验内容

编写一个网站，实现会员注册与登录功能，页面关系如下。

[![DYgGxx.png](https://s3.ax1x.com/2020/11/23/DYgGxx.png)](https://imgchr.com/i/DYgGxx)

给出每个页面的代码和截图，下面给出Login.jsp页面和register.jsp页面示例，请补充其它页面。

1. Login.jsp页面代码

   ```html
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
   ```

   效果如下：

   [![登陆页面效果](https://s3.ax1x.com/2020/11/23/DYRVBT.md.png)](https://imgchr.com/i/DYRVBT)

   2. register.jap页面代码

      <center>代码省略</center>

      效果如下：

      [![DYRkj0.md.png](https://s3.ax1x.com/2020/11/23/DYRkj0.md.png)](https://imgchr.com/i/DYRkj0)

      

   3. error.jsp页面代码

      <center>代码省略</center>

      效果如下：

      [![DYREuV.png](https://s3.ax1x.com/2020/11/23/DYREuV.png)](https://imgchr.com/i/DYREuV)

   4. member.jsp页面代码

      <center>代码省略</center>

      效果如下：

      [![DYRFcq.png](https://s3.ax1x.com/2020/11/23/DYRFcq.png)](https://imgchr.com/i/DYRFcq)

   5. success.jsp页面代码

      <center>代码省略</center>

      效果如下：

      [![DYRi3n.png](https://s3.ax1x.com/2020/11/23/DYRi3n.png)](https://imgchr.com/i/DYRi3n)

### 四、实验心得体会

​		在实验过程中遇到了一些问题，注册时点注册会显示密码错误，在经过老师指导后，经过一步一步输出获取的密码。确定到servlet中获取的密码显示为null，即没有获取到，经过排查发现是获取密码时，名称写错。这次实验是自己了解到了一些网页内部的一些内容，更加了解了网页前后端，收获很大。