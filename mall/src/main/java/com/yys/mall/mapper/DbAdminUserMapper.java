package com.yys.mall.mapper;

import com.yys.mall.entity.DbAdminUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface DbAdminUserMapper {


    /**
     * 登陆查询
     *
     * @param map
     * @return
     */
    List<DbAdminUser> findAdminUserByUsernamePassword(Map map);

    /**
     * 修改密码
     *
     * @param adminUser
     * @return
     */

    int updateAdminUserPassword(DbAdminUser adminUser);
}