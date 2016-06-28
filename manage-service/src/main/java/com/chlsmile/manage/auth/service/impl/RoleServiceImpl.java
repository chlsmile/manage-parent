package com.chlsmile.manage.auth.service.impl;

import com.chlsmile.manage.auth.dao.RoleDao;
import com.chlsmile.manage.auth.domain.Role;
import com.chlsmile.manage.auth.service.RoleService;

import javax.annotation.Resource;

/**
 * Created with: IntelliJ IDEA.
 * Function: 角色业务接口实现
 * User: chl_smile
 * Date: 2016-06-28 16:11:00
 */
public class RoleServiceImpl implements RoleService {

    @Resource
    private RoleDao roleDao;

    @Override
    public void addRole(Role role) {

    }

    @Override
    public void deleteRoleById(Long id) {

    }

    @Override
    public void updateRoleById(Role role) {

    }
}
