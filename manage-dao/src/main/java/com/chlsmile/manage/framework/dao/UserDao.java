package com.chlsmile.manage.framework.dao;

import com.chlsmile.manage.annotation.Mapper;
import com.chlsmile.manage.framework.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Function:
 * User: chl_smile@163.com
 */
@Repository
public interface UserDao {

    /**
     * addUser 新增一条用户记录
     *
     * @param user 用户信息
     */
    void addUser(User user);

    /**
     * updateUserById 根据用户id更新一条用户记录
     *
     * @param user 用户
     *
     * @return 影响行数
     */
    int updateUserById(User user);

    /**
     * deleteUserById 根据用户id删除一条用户记录
     *
     * @param id 用户id
     *
     * @return 影响行数
     */
    int deleteUserById(Long id);

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
