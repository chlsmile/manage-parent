package com.chlsmile.manage.auth.service;


import com.chlsmile.manage.auth.domain.Role;

/**
 * Created with: IntelliJ IDEA.
 * Function: 角色业务接口
 * User: chl_smile
 * Date: 2016-06-28 16:10:00
 */
public interface RoleService {

    /**
     * addRole 创建角色
     *
     * @param role 角色详情
     */
    void addRole(Role role);

    /**
     * deleteRoleById 根据id删除角色
     *
     * @param id 角色id
     */
    void deleteRoleById(Long id);

    /**
     * updateRoleById 根据角色id更新角色信息(角色id不能为空)
     *
     * @param role 角色详情
     */
    void updateRoleById(Role role);

}
