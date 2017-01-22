package com.chlsmile.manage.user.service;

import com.alibaba.druid.support.json.JSONUtils;
import com.chlsmile.manage.common.BaseTest;
import com.chlsmile.manage.framework.domain.User;
import com.chlsmile.manage.framework.service.UserService;
import com.chlsmile.manage.util.DateTimeUtil;
import com.chlsmile.manage.util.EncryptUtil;
import com.chlsmile.manage.util.GsonUtil;
import com.google.gson.Gson;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


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
        user.setUserName("admin211111111111111111111122222222222222222222222222089999999999999998989808180208912801092198020810218020819280910892180928012080820812089108921809208192081082");
        user.setRoleId(1L);
        userService.addUser(user);
    }

    @Test
    public void updateUserByIdTest(){
        User user=new User();
        user.setId(2L);
        user.setUserName("admin39");
        user.setRoleId(2L);
        user.setPassword(EncryptUtil.sha1Hex("123456789"));
        userService.updateUserById(user);
    }

    @Test
    public void deleteUserByIdTest(){
        userService.deleteUserById(100L);
    }

    @Test
    public void findUserByIdTest(){
        User user=userService.findUserById(6L);
        System.out.println(GsonUtil.toJsonString(user));
    }

    @Test
    public void queryUserTest(){
        User user=new User();
        user.setUserName("admin39111");
        List<User> userList=userService.queryUser(user);
        System.out.println(GsonUtil.toJsonString(userList));
    }





}
