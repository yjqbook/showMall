package com.yys.mall.mapper;

import com.yys.mall.entity.DbUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface DbUserMapper {
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



    /**
     * 查询列表
     * @param map
     * @return
     */
    List<Map>  getUserList(Map map);
    Integer  getUserListCount(Map map);

}