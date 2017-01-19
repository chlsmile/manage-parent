package com.chlsmile.manage.framework.dao;

import com.chlsmile.manage.framework.domain.Menu;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Function:
 * User: chl_smile@163.com
 */
@Repository
public interface MenuDao {

    /**
     * addMenu 新增一菜单
     *
     * @param menu 菜单信息
     */
    void addMenu(Menu menu);

    /**
     * updateMenuById 根据菜单id更新菜单信息
     *
     * @param menu 菜单
     *
     * @return 影响行数
     */
    int updateMenuById(Menu menu);

    /**
     * deleteMenuById 根据菜单id删除菜单
     *
     * @param id 菜单id
     *
     * @return 影响行数
     */
    int deleteMenuById(Long id);

    /**
     * findMenuById 根据菜单id查询菜单信息
     *
     * @param id 菜单id
     *
     * @return 菜单信息
     */
    Menu findMenuById(Long id);

    /**
     * queryMenu 根据菜单查询菜单列表
     *
     * @param menu 菜单
     *
     * @return 菜单列表
     */
    List<Menu> queryMenu(Menu menu);
}
