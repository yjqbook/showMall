package com.yys.mall.controller;

import com.yys.mall.entity.DbBanner;
import com.yys.mall.service.DbBannerService;
import com.yys.mall.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("sys/index")
public class IndexBannerController {
    @Autowired
    private DbBannerService bannerService;

    /**
     * 添加banner
     * @param banner
     * @param request
     * @return
     */
    @RequestMapping("/addBanner")
    @ResponseBody
    public ResultUtil addBanner(DbBanner banner , HttpServletRequest request) {
        int num = bannerService.addBanner(banner);
        if(num > 0){
            return ResultUtil.success("添加成功!");
        }else{
            return ResultUtil.error("添加失败!");
        }
    }

    /**
     * 删除banner
     * @param id
     * @param request
     * @return
     */
    @RequestMapping("/deleteBanner")
    @ResponseBody
    public ResultUtil deleteBanner(Integer id , HttpServletRequest request) {
        int num = bannerService.deleteBanner(id);
        if(num > 0){
            return ResultUtil.success("删除成功!");
        }else{
            return ResultUtil.error("删除失败!");
        }
    }

    /**
     * 删除banner
     * @param id
     * @param request
     * @return
     */
    @RequestMapping("/updateTypeBanner")
    @ResponseBody
    public ResultUtil updateTypeBanner(Integer id ,Integer type, HttpServletRequest request) {
        Map map=new HashMap();
        map.put("id",id);
        map.put("type",type);

        int num = bannerService.updateTypeBanner(map);
        if(num > 0){
            return ResultUtil.success("更新成功!");
        }else{
            return ResultUtil.error("更新失败!");
        }
    }


    /**
     * 查询banner 列表
     * @param page
     * @param limit
     * @param request
     * @return
     */
    @RequestMapping(value = "getBannerList",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public ResultUtil getBannerList(Integer page, Integer limit,HttpServletRequest request){

        return bannerService.getBannerList(page,limit);
    }


    /**
     * 首页查询banner 列表
     * @return
     */
    @RequestMapping(value = "getIndexBanner",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public ResultUtil getIndexBanner(){

        return ResultUtil.success(bannerService.getIndexBanner());
    }

    /**
     * 更新banner排序
     * @param id
     * @param sort
     * @return
     */
    @RequestMapping(value = "updateSortBanner",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public ResultUtil updateSortBanner(Integer id, Integer sort){
        bannerService.updateSortBanner(id,sort);
        return ResultUtil.success("更新成功!");
    }




}
