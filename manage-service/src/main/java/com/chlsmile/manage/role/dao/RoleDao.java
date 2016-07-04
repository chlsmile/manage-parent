package com.chlsmile.manage.role.dao;

import com.chlsmile.manage.role.domain.Role;

/**
 * Created with: IntelliJ IDEA.
 * Function: 角色db操作接口
 * User: chl_smile
 * Date: 2016-06-28 16:09:00
 */
public interface RoleDao {


    /**
     * addRole 创建角色
     *
     * @param role 角色详情
     *
     * @return 影响行数
     */
    int addRole(Role role);

    /**
     * deleteRoleById 根据id删除角色
     *
     * @param id 角色id
     *
     * @return 影响行数
     */
    int deleteRoleById(Long id);

    /**
     * updateRoleById 根据角色id更新角色信息(角色id不能为空)
     *
     * @param role 角色详情
     *
     * @return 影响行数
     */
    int updateRoleById(Role role);
}
