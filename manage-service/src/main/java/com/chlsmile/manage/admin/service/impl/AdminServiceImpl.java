package com.chlsmile.manage.admin.service.impl;

import com.chlsmile.manage.admin.dao.AdminDao;
import com.chlsmile.manage.admin.service.AdminService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created with: IntelliJ IDEA.
 * Function: 后台管理用户业务接口实现
 * User: chl_smile
 * Date: 2016-06-28 16:38:00
 */
@Service
public class AdminServiceImpl implements AdminService {

    @Resource
    private AdminDao adminDao;
}
