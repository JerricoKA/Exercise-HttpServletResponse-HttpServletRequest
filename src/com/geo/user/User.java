package com.geo.user;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zhang
 */
@WebServlet(name = "User")
public class User extends HttpServlet {
    private final Map<String,String> userMap = new HashMap<>();
    private static  User user = null;
    private User(){
        userMap.put("zhangsan","111111##zhangsan@sian.com");
        userMap.put("lisi","222222##lisi@sian.com");
        userMap.put("wangwu","333333##wangwu@sina.com");
        userMap.put("zhouliu","444444##zhouliu@sina.com");
    }
    public static User getInstance() {
       if (user==null){
           user = new User();
       }
       return user;
    }
    public Map<String,String> getUserMap(){
        return userMap;
    }


}
