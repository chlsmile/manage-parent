package com.chlsmile.manage.framework.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * Function:
 * User: chl_smile@163.com
 */
public class Role implements Serializable {


    private static final long serialVersionUID = -7625090563589162031L;

    private Long id;              //主键
    private String roleName;      //角色名称
    private Date createTime;      //创建时间
    private Date updateTime;      //更新时间

    public Role() {
    }

    public Role(Long id, String roleName, Date createTime, Date updateTime) {
        this.id = id;
        this.roleName = roleName;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
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
        final StringBuilder sb = new StringBuilder("Role{");
        sb.append("id=").append(id);
        sb.append(", roleName='").append(roleName).append('\'');
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append('}');
        return sb.toString();
    }
}
