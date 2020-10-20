package com.yys.mall.entity;

/**
 * <p>
 * 管理用户信息表
 * </p>
 *
 * @author yys
 * @since 2020-02-02
 */

public class DbAdminUser{

    private static final long serialVersionUID = 1L;

	private Integer id;

    /**
     * 管理员名称
     */
	private String admin;
    /**
     * 密码
     */
	private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
