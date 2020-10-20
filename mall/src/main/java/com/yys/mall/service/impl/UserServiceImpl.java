package com.yys.mall.service.impl;

import com.yys.mall.entity.DbUser;
import com.yys.mall.mapper.DbUserMapper;
import com.yys.mall.service.DbUserService;
import com.yys.mall.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class UserServiceImpl implements DbUserService {

    @Autowired
	private DbUserMapper userMapper;

    @Override
    public int addUser(DbUser user) {
        return userMapper.addUser(user);
    }

    @Override
    public ResultUtil getUserList(Integer page, Integer limit) {
        Map map=new HashMap();
        map.put("page", (page-1)*limit);
        map.put("limit",limit);
        List<Map> dbUser = userMapper.getUserList(map);
        Integer count = userMapper.getUserListCount(map);
        ResultUtil resultUtil = new ResultUtil();
        resultUtil.setCode(0);
        resultUtil.setCount(count);
        resultUtil.setData(dbUser);
        return resultUtil;
    }

    @Override
    public int deleteUser(Integer id) {
        return userMapper.deleteUser(id);
    }

}
