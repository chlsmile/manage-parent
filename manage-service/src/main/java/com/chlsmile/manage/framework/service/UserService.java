package com.chlsmile.manage.framework.service;

import com.chlsmile.manage.framework.domain.User;

import java.util.List;

/**
 * Function:
 * User: chl_smile@163.com
 */
public interface UserService {


    /**
     * addUser 新增一条用户记录
     *
     * @param user 用户信息
     */
    void addUser(User user);

    /**
     * updateUserById 根据用户id更新一条用户记录
     *
     * @param id 用户id
     *
     */
    void updateUserById(Long id);

    /**
     * deleteUserById 根据用户id删除一条用户记录
     *
     * @param id 用户id
     *
     */
    void deleteUserById(Long id);

    /**
     * findUserById 根据用户id查询用户
     *
     * @param id 用户id
     *
     * @return 用户信息
     */
    User findUserById(Long id);

    /**
     * queryUser 根据用户信息查询用户列表
     *
     * @param user 用户信息
     *
     * @return 用户列表
     */
    List<User> queryUser(User user);
}
