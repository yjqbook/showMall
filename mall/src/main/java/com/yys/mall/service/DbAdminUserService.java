package com.yys.mall.service;


import com.yys.mall.entity.DbAdminUser;


public interface DbAdminUserService {
    /**
     * 登陆查询
     *
     * @param
     * @return
     */
    public DbAdminUser login(String admin, String password);

    /**
     * 修改密码
     *
     * @param adminUser
     * @return
     */

    public int updateAdminUserPassword(DbAdminUser adminUser);
}
