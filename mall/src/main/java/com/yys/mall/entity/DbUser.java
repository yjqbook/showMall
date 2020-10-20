package com.yys.mall.entity;

import java.util.Date;

public class DbUser {

    private static final long serialVersionUID = 1L;

	private Integer id;

    /**
     * 姓名
     */
	private String name;
    /**
     * 生日
     */
	private Date birthday;
    /**
     * 手机
     */
	private String phone;
    /**
     * 邮件
     */
	private String email;

    /**
     * 状态 : 0 正常, 1 删除
     * @return
     */
    private Integer status;
    /**
     * 创建时间
     */
    private Date createTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
