package com.chlsmile.manage.controller.login;

import com.chlsmile.manage.framework.user.service.UserService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 * Function:
 * User: hualun
 * Date: 16/6/24 下午4:34
 */
@Controller
public class LoginController {

    @Resource
    private UserService userService;


    /**
     * login 登录
     *
     * @param userName 用户名
     * @param password 密码
     *
     * @return
     */
    public String login(String userName, String password){
        return "";
    }

    /**
     * logout 退出
     *
     * @return
     */
    public String logout(){
        return "";
    }

}
