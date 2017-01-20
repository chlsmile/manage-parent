package com.chlsmile.manage.framework.service.impl;

import com.chlsmile.manage.exception.DeleteDbException;
import com.chlsmile.manage.exception.InsertDbException;
import com.chlsmile.manage.exception.ParameterException;
import com.chlsmile.manage.exception.UpdateDbException;
import com.chlsmile.manage.framework.dao.UserDao;
import com.chlsmile.manage.framework.domain.User;
import com.chlsmile.manage.framework.service.UserService;
import com.chlsmile.manage.util.DateTimeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Function:
 * User: chl_smile@163.com
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    @Override
    public void addUser(User user) {
        if(user==null){
            throw new ParameterException("addUser exception user is null");
        }
        if(user.getCreateTime()==null){
            user.setCreateTime(DateTimeUtil.getNow());
        }
        if(user.getUpdateTime()==null){
            user.setUpdateTime(DateTimeUtil.getNow());
        }
        userDao.addUser(user);
    }

    @Override
    @Transactional
    public void updateUserById(User user) {
        if(user==null){
            throw new ParameterException("updateUserById exception user is null");
        }
        if(user.getId()==null){
            throw new ParameterException("updateUserById exception user id is null");
        }
        if(user.getUpdateTime()==null){
            user.setUpdateTime(DateTimeUtil.getNow());
        }
        int updateResult=userDao.updateUserById(user);
        if(updateResult!=1){
            throw new UpdateDbException("updateUserById exception updateResult is "+updateResult+", user:"+user);
        }
    }

    @Override
    @Transactional
    public void deleteUserById(Long id) {
        int deleteResult=userDao.deleteUserById(id);
        if(deleteResult!=1){
            throw new DeleteDbException("deleteUserById exception deleteResult is "+deleteResult+", id is "+id);
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
