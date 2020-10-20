package com.yys.mall.service;


import com.yys.mall.entity.DbUser;
import com.yys.mall.utils.ResultUtil;

public interface DbUserService {

    /**
     * 得到用户列表
     * @param page
     * @param limit
     * @return
     */
    ResultUtil getUserList(Integer page, Integer limit);

    /**
     * 添加用户
     * @param user
     * @return
     */
    int addUser(DbUser user);

    /**
     * 删除用户
     * @param id
     * @return
     */
    int deleteUser(Integer id);





}
