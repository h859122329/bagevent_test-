package com.example.bagevent_test.controller;

import com.example.bagevent_test.entity.User;
import com.example.bagevent_test.entity.UserLoginLog;
import com.example.bagevent_test.service.UserLoginLogService;
import com.example.bagevent_test.service.UserService;
import com.example.bagevent_test.util.CusAccessObjectUtil;
import com.example.bagevent_test.vo.UserForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class Indexcontroller {

    @Autowired
    private UserService userService;
    @Autowired
    private UserLoginLogService userLogService;

    @RequestMapping("/index")
    public String index(){

        return "index";
    }

    @RequestMapping("/regist")
    public String regist(UserForm  user){
        userService.addOneUser(user.getNumber(),String.valueOf(user.getPwd().hashCode()));
        return "login";
    }

    @RequestMapping("/logins")
    public String login(HttpServletRequest request,UserForm  userForm){
        String ip=CusAccessObjectUtil.getIpAddress(request);
        User user = userService.checkUser(userForm.getNumber(),String.valueOf(userForm.getPwd().hashCode()));
        if(user!=null){
            UserLoginLog userlog = new UserLoginLog();
            userlog.setUserid(user.getUserId());
            userlog.setLoginip(ip);
            userLogService.isnertOneUserLog(userlog);
            request.getSession().setAttribute("userLog",userLogService.selectOneUserLoginLog());
            return "home";
        } else{
            request.setAttribute("msg","用户密码输入错误,请重新输入");
            return "login";
        }
    }


}
