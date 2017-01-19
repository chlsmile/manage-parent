package com.chlsmile.manage.framework.service.impl;

import com.chlsmile.manage.framework.dao.UserDao;
import com.chlsmile.manage.framework.domain.User;
import com.chlsmile.manage.framework.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Function:
 * User: chl_smile@163.com
 */
@Service("userService")
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Override
    @Transactional
    public void updateUserById(Long id) {
        int updateResult=userDao.updateUserById(id);
        if(updateResult!=1){
            throw new RuntimeException("updateUserById exception");
        }
    }

    @Override
    @Transactional
    public void deleteUserById(Long id) {
        int deleteResult=userDao.deleteUserById(id);
        if(deleteResult!=1){
            throw new RuntimeException("deleteUserById exception");
        }
    }

    @Override
    public User findUserById(Long id) {
        return userDao.findUserById(id);
    }

    @Override
    public List<User> queryUser(User user) {
        return userDao.queryUser(user);
    }
}
