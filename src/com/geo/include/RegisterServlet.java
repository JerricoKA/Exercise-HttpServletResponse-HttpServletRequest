package com.geo.include;

import com.geo.user.User;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author zhang
 */
@WebServlet(name = "RegisterServlet",urlPatterns = {"/register.htm"})
public class RegisterServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) {
                //获取参数username的值
                 String userName = request.getParameter("username");
             //获取参数password的值
             String password = request.getParameter("password");
            //获取参数的confirdPassword的值
            String confirdPassword = request.getParameter("confirdPassword");
            //获取参数emile的值
            String email = request.getParameter("emile");
            //装载错误信息
            List<String> errors = new ArrayList<>();
                 //验证邮箱
            if (!isValidEmail(email)){
                errors.add("无效的邮箱号码！");
            }
            //验证用户名
            if (isValidUsername(userName)){
                errors.add("用户名为空或者已经存在!");
            }
                 //验证密码
            if (isValidPassword(password,confirdPassword)){
                errors.add("密码为空或者密码不一致!");
            }
            //如果List不为空，则跳转到错误页面
            if (!errors.isEmpty()){
                request.setAttribute("errors",errors);
                try {
                    //跳转到错误的页面
                    request.getRequestDispatcher("/error.htm").forward(request,response);
                } catch (javax.servlet.ServletException | java.io.IOException e) {
                    e.printStackTrace();
                }
            } else {                                                        //验证通过，获取User中的Map集合，添加用户
                User user =User.getInstance();
                Map<String,String> map =user.getUserMap();
                map.put(userName,password+"##"+email);
                try {
                    request.getRequestDispatcher("/success.htm").
                            //跳转到成功的页面
                    forward(request,response);
                } catch (javax.servlet.ServletException | java.io.IOException e) {
                    e.printStackTrace();
                }
            }

    }
    /**
     *使用正则表达式验证邮箱
     */
    public boolean isValidEmail(String email) {
        boolean flag = false;
        if (email!=null&&!"".equals(email)) {
            flag = email.matches("^[\\w-]+(\\.[w-]+)*@[\\w-]+(\\.[\\w-]+)+$");
        }
        return flag;
    }
    /**
     *  验证用户是否存在，获取从User类中的Map集合
     * 根据key判断Map中是否存在用户
     */

    public boolean isValidUsername(String userName){
        User user = User.getInstance();
        Map<String,String> map = user.getUserMap();
        if (userName!=null&&!"".equals(userName)){
            return map.get(userName) != null && !"".equals(map.get(userName));
        }
        return true;
        //存在用户
    }

    /**
     * 验证密码，如果密码为空、长度小于6，并且与确认密码不统一
     * 返回true
     */
    public boolean isValidPassword(String password,String confirdPassword) {
        return password == null || confirdPassword == null
                || password.length() < 6 || confirdPassword.length() < 6
                || !password.equals(confirdPassword);
    }
}
