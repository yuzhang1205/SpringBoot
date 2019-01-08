package com.demo.entity;

import java.util.Date;

public class pr_t_Operator {
    private String operatorid;

    private String operatorname;

    private String deptid;

    private String deptname;

    private String duty;

    private Date jointime;

    private Boolean isstop;

    private String password;

    private String email;

    private String mobile;

    private String phone;

    private String fullname;

    private Date lastchangepwddate;

    private Date createtime;

    private String createoperator;

    private Date lastupdatetime;

    private String lastupdateoperator;

    private Boolean isoperator;

    public String getOperatorid() {
        return operatorid;
    }

    public void setOperatorid(String operatorid) {
        this.operatorid = operatorid == null ? null : operatorid.trim();
    }

    public String getOperatorname() {
        return operatorname;
    }

    public void setOperatorname(String operatorname) {
        this.operatorname = operatorname == null ? null : operatorname.trim();
    }

    public String getDeptid() {
        return deptid;
    }

    public void setDeptid(String deptid) {
        this.deptid = deptid == null ? null : deptid.trim();
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname == null ? null : deptname.trim();
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty == null ? null : duty.trim();
    }

    public Date getJointime() {
        return jointime;
    }

    public void setJointime(Date jointime) {
        this.jointime = jointime;
    }

    public Boolean getIsstop() {
        return isstop;
    }

    public void setIsstop(Boolean isstop) {
        this.isstop = isstop;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname == null ? null : fullname.trim();
    }

    public Date getLastchangepwddate() {
        return lastchangepwddate;
    }

    public void setLastchangepwddate(Date lastchangepwddate) {
        this.lastchangepwddate = lastchangepwddate;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getCreateoperator() {
        return createoperator;
    }

    public void setCreateoperator(String createoperator) {
        this.createoperator = createoperator == null ? null : createoperator.trim();
    }

    public Date getLastupdatetime() {
        return lastupdatetime;
    }

    public void setLastupdatetime(Date lastupdatetime) {
        this.lastupdatetime = lastupdatetime;
    }

    public String getLastupdateoperator() {
        return lastupdateoperator;
    }

    public void setLastupdateoperator(String lastupdateoperator) {
        this.lastupdateoperator = lastupdateoperator == null ? null : lastupdateoperator.trim();
    }

    public Boolean getIsoperator() {
        return isoperator;
    }

    public void setIsoperator(Boolean isoperator) {
        this.isoperator = isoperator;
    }
}