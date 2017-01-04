package com.chlsmile.manage.menu.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * Function:
 * User: chl_smile@163.com
 */
public class Menu implements Serializable {

    private static final long serialVersionUID = 374052402290758934L;

    private Long id;               //主键
    private String urlValue;       //菜单url
    private String urlName;        //菜单名称
    private Date createTime;       //创建时间
}
