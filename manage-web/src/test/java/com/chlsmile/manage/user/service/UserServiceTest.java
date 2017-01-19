package com.chlsmile.manage.user.service;

import com.chlsmile.manage.common.BaseTest;
import com.chlsmile.manage.framework.domain.User;
import com.chlsmile.manage.framework.service.UserService;
import com.chlsmile.manage.util.DateTimeUtil;
import com.chlsmile.manage.util.EncryptUtil;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * Function:
 * User: chl_smile@163.com
 */
public class UserServiceTest extends BaseTest{

    @Autowired
    private UserService userService;


    @Test
    public void addUserTest(){

        User user=new User();
        user.setPassword(EncryptUtil.sha1Hex("123456"));
        user.setCreateTime(DateTimeUtil.getNow());
        user.setUpdateTime(DateTimeUtil.getNow());
        user.setUserName("admin2");
        user.setRoleId(1L);
        userService.addUser(user);
    }
}
