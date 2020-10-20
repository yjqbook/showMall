package com.yys.mall.service.impl;

import com.yys.mall.entity.DbAdminUser;
import com.yys.mall.mapper.DbAdminUserMapper;
import com.yys.mall.service.DbAdminUserService;
import com.yys.mall.utils.MD5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class AdminUserServiceImpl implements DbAdminUserService {
	@Autowired
	private DbAdminUserMapper adminUserMapper;

    /**
	 * 管理员登陆
	 */
	@Override
	public DbAdminUser login(String admin, String password) {
		//对密码加密
		password= MD5.MD5Pwd(admin,password);
		Map map=new HashMap();
		map.put("admin",admin);
		map.put("password",password);
		List<DbAdminUser> adminUser = adminUserMapper.findAdminUserByUsernamePassword(map);
		if (adminUser != null && adminUser.size() > 0) {
			return adminUser.get(0);
		}
		return null;
	}

    @Override
    public int updateAdminUserPassword(DbAdminUser adminUser) {
        adminUser.setPassword(MD5.MD5Pwd(adminUser.getAdmin(),adminUser.getPassword()));
        return adminUserMapper.updateAdminUserPassword(adminUser);
    }
}
