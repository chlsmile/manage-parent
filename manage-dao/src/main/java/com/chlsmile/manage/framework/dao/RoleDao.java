package com.chlsmile.manage.framework.dao;

import com.chlsmile.manage.framework.domain.Role;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Function:
 * User: chl_smile@163.com
 */
@Repository
public interface RoleDao {

    /**
     * addRole 新增一个角色
     *
     * @param role 角色信息
     */
    void addRole(Role role);

    /**
     * updateRoleById 根据角色id更新角色信息
     *
     * @param role 角色信息
     *
     * @return 影响行数
     */
    int updateRoleById(Role role);

    /**
     * deleteRoleById 根据角色id删除角色
     *
     * @param id 角色id
     *
     * @return 影响行数
     */
    int deleteRoleById(Long id);

    /**
     * findRoleById 根据角色id查询角色信息
     *
     * @param id 角色id
     *
     * @return 角色信息
     */
    Role findRoleById(Long id);

    /**
     * queryRole 根据角色信息查询角色列表
     *
     * @param role 角色信息
     *
     * @return 角色列表
     */
    List<Role> queryRole(Role role);
}
