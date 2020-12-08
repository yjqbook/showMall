package com.yys.mall.controller;

import com.yys.mall.entity.DbUser;
import com.yys.mall.service.DbUserService;
import com.yys.mall.utils.ResultUtil;
import com.yys.mall.utils.Sms;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@RequestMapping("sys/user")
public class UserController {
    @Autowired
    private DbUserService userService;

    /**
     * 添加user
     *
     * @param request
     * @return
     */
    @RequestMapping("/addUser")
    @ResponseBody
    public ResultUtil addUser(String name, String birthday, String phone, String email, String code, HttpServletRequest request) throws Exception {
        String codeMy=String.valueOf(request.getSession().getAttribute("code"));
        if(codeMy!=null && !codeMy.equals(code)){
            return ResultUtil.error("验证码不正确!");
        }

        DbUser user = new DbUser();
        user.setName(name);
        user.setPhone(phone);
        user.setEmail(email);
        user.setBirthday(new SimpleDateFormat("yyyy-MM-dd").parse(birthday));
        user.setCreateTime(new Date());
        int num = userService.addUser(user);
        if (num > 0) {
            request.getSession().setAttribute("code", 0);
            return ResultUtil.success("添加成功!");
        } else {
            return ResultUtil.error("添加失败!");
        }
    }

    /**
     * 发送验证码
     *
     * @param request
     * @return
     */
    @RequestMapping("/sendCode")
    @ResponseBody
    public ResultUtil sendCode(String phone, HttpServletRequest request) throws Exception {
        int code = (int) ((Math.random() * 9 + 1) * 100000);
        request.getSession().setAttribute("code", code);
        String sendReturn = Sms.send(phone, String.valueOf(code));
        if (sendReturn != null) {
            return ResultUtil.success("发送成功!");
        } else {
            return ResultUtil.error("发送失败!");
        }
    }


    /**
     * 删除user
     *
     * @param id
     * @param request
     * @return
     */
    @RequestMapping("/deleteUser")
    @ResponseBody
    public ResultUtil deleteUser(Integer id, HttpServletRequest request) {
        int num = userService.deleteUser(id);
        if (num > 0) {
            return ResultUtil.success("删除成功!");
        } else {
            return ResultUtil.error("删除失败!");
        }
    }


    /**
     * 查询user 列表
     *
     * @param page
     * @param limit
     * @param request
     * @return
     */
    @RequestMapping(value = "getUserList", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public ResultUtil getUserList(Integer page, Integer limit, HttpServletRequest request) {

        return userService.getUserList(page, limit);
    }


}
