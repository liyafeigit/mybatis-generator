package com.generator.bean;

import java.util.Date;

public class SysUser {
    private String userId;

    private String userName;

    private String accountName;

    private String password;

    private Double userType;

    private Date createTime;

    private Double islock;

    private Integer fkCityId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName == null ? null : accountName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Double getUserType() {
        return userType;
    }

    public void setUserType(Double userType) {
        this.userType = userType;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Double getIslock() {
        return islock;
    }

    public void setIslock(Double islock) {
        this.islock = islock;
    }

    public Integer getFkCityId() {
        return fkCityId;
    }

    public void setFkCityId(Integer fkCityId) {
        this.fkCityId = fkCityId;
    }
}