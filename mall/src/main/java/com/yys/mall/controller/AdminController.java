package com.yys.mall.controller;

import com.yys.mall.entity.DbAdminUser;
import com.yys.mall.service.DbAdminUserService;
import com.yys.mall.utils.MD5;
import com.yys.mall.utils.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("sys/admin")
public class AdminController {
    private static final Logger logger = LoggerFactory.getLogger(AdminController.class);

    @Autowired
    private DbAdminUserService adminService;

    /**
     * 登录
     * @param request
     * @param admin
     * @param password
     * @return
     */
    @RequestMapping("/login")
    @ResponseBody
    public ResultUtil login(HttpServletRequest request, String admin,String password) {
        System.out.println(admin+password);
       DbAdminUser adminUser= adminService.login(admin, password);

        if(adminUser==null){
            return ResultUtil.error("登录失败,用户名或者密码错误!");
        }else{
            request.getSession().setAttribute("adminUser",adminUser);
            return ResultUtil.success("登录成功!");
        }

    }

    @RequestMapping("/updatePassword")
    @ResponseBody
    public ResultUtil updatePassword(HttpServletRequest request,String newPwd,String oldPwd) {

        DbAdminUser adminUser=(DbAdminUser)request.getSession().getAttribute("adminUser");
        oldPwd= MD5.MD5Pwd(adminUser.getAdmin(),oldPwd);
        if(!adminUser.getPassword().equals(oldPwd)){
            return ResultUtil.error("密码修改失败, 登录密码输入错误!");
        }
        adminUser.setPassword(newPwd);
        adminService.updateAdminUserPassword(adminUser);
        return ResultUtil.success("修改密码成功!");
    }


    /**
     * 登录
     * @param request
     * @return
     */
    @RequestMapping("/loginOut")
    @ResponseBody
    public ResultUtil loginOut(HttpServletRequest request) {
        request.getSession().removeAttribute("adminUser");
        return ResultUtil.success("退出成功!");
    }


}
