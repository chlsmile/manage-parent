package com.chlsmile.manage.framework.service.impl;

import com.chlsmile.manage.exception.InsertDbException;
import com.chlsmile.manage.exception.UpdateDbException;
import com.chlsmile.manage.framework.dao.RoleDao;
import com.chlsmile.manage.framework.domain.Role;
import com.chlsmile.manage.framework.service.RoleService;
import com.chlsmile.manage.util.DateTimeUtil;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * Function:
 * User: chl_smile@163.com
 */
@Service
public class RoleServiceImpl implements RoleService {

    private static final Logger logger=LoggerFactory.getLogger(RoleServiceImpl.class);

    @Autowired
    private RoleDao roleDao;

    @Override
    public void addRole(Role role) {
        if(role==null){
            throw new InsertDbException("addRole exception role is null");
        }
        if(StringUtils.isEmpty(role.getRoleName())){
            throw new InsertDbException("addRole exception roleName is empty");
        }

        Date nowTime= DateTimeUtil.getNow();
        if(role.getCreateTime()==null){
            role.setCreateTime(nowTime);
        }
        if(role.getUpdateTime()==null){
            role.setUpdateTime(nowTime);
        }
        roleDao.addRole(role);
    }

    @Override
    @Transactional
    public void updateRoleById(Role role) {
        if(role==null){
            throw new UpdateDbException("updateRoleById exception role is null");
        }
        if(role.getId()==null){
            throw new RuntimeException("updateRoleById exception id is null");
        }
        if(role.getUpdateTime()==null){
            role.setUpdateTime(new Date());
        }
        int updateRoleByIdResult=roleDao.updateRoleById(role);
        if(updateRoleByIdResult!=1){
            logger.error("updateRoleById exception updateRoleByIdResult:{}, role:{}", updateRoleByIdResult,role);
            throw new RuntimeException("updateRoleById exception updateRoleByIdResult="+updateRoleByIdResult);
        }

    }

    @Override
    @Transactional
    public void deleteRoleById(Long id) {
        if(id==null){
            throw new RuntimeException("deleteRoleById exception id is null");
        }
        int deleteRoleByIdResult=roleDao.deleteRoleById(id);
        if(deleteRoleByIdResult!=1){
            logger.error("deleteRoleById exception deleteRoleByIdResult:{}, id:{}",deleteRoleByIdResult,id);
            throw new RuntimeException("deleteRoleById exception deleteRoleByIdResult="+deleteRoleByIdResult);
        }
    }

    @Override
    public Role findRoleById(Long id) {
        return roleDao.findRoleById(id);
    }

    @Override
    public List<Role> queryRole(Role role) {
        return roleDao.queryRole(role);
    }
}
