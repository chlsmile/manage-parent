package com.chlsmile.manage.framework.service.impl;

import com.chlsmile.manage.framework.dao.MenuDao;
import com.chlsmile.manage.framework.domain.Menu;
import com.chlsmile.manage.framework.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Function:
 * User: chl_smile@163.com
 */
@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuDao menuDao;

    @Override
    public void addMenu(Menu menu) {
        menuDao.addMenu(menu);
    }
}
