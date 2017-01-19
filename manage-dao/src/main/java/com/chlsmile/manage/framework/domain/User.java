package com.chlsmile.manage.framework.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * Function:
 * User: chl_smile@163.com
 */
public class User implements Serializable{


    private static final long serialVersionUID = -4279545872593148176L;

    private Long id;             //主键
    private String userName;     //用户名
    private String password;     //密码
    private Date createTime;     //创建时间
    private Date updateTime;     //更新时间
    private Long roleId;         //角色id

    public User() {
    }

    public User(Long id, String userName, String password, Date createTime, Date updateTime, Long roleId) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.roleId = roleId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("id=").append(id);
        sb.append(", userName='").append(userName).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", roleId=").append(roleId);
        sb.append('}');
        return sb.toString();
    }
}
