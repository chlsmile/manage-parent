package com.chlsmile.manage.framework.menu.domain;

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
    private Date updateTime;       //更新时间

    public Menu() {
    }

    public Menu(Long id, String urlValue, String urlName, Date createTime, Date updateTime) {
        this.id = id;
        this.urlValue = urlValue;
        this.urlName = urlName;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrlValue() {
        return urlValue;
    }

    public void setUrlValue(String urlValue) {
        this.urlValue = urlValue;
    }

    public String getUrlName() {
        return urlName;
    }

    public void setUrlName(String urlName) {
        this.urlName = urlName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Menu{");
        sb.append("id=").append(id);
        sb.append(", urlValue='").append(urlValue).append('\'');
        sb.append(", urlName='").append(urlName).append('\'');
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append('}');
        return sb.toString();
    }
}
