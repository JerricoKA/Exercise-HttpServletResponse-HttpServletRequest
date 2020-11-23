package com.geo.include;

import com.geo.user.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

/**
 * @author zhang
 */
@WebServlet(name = "LoginServlet",urlPatterns = "/login.htm")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName = request.getParameter("username");
        String password = request.getParameter("password");

       if (checkLogin(userName,password)){
            request.getRequestDispatcher("/member.htm").forward(request,response);
        }else {
            response.sendRedirect("login.jsp");
        }
    }

    public boolean checkLogin(String username, String password) {
        User user = User.getInstance();
        Map<String,String> map = user.getUserMap();
       if (username != null && !"".equals(username) && !"".equals(password)){
            String[] arr = map.get(username).split("##");
            return arr[0].equals(password);
        }else {
            return false;
        }
    }

        @Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response) {
    }
}
