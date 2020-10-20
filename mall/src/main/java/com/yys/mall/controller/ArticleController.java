package com.yys.mall.controller;

import com.yys.mall.entity.DbArticleInfo;
import com.yys.mall.entity.DbArticleSection;
import com.yys.mall.service.DbArticleInfoService;
import com.yys.mall.service.DbArticleSectionService;
import com.yys.mall.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("sys/article")
public class ArticleController {

    @Autowired
    private DbArticleInfoService articleInfoService;
    @Autowired
    private DbArticleSectionService articleSectionService;



    /**
     * 添加文章
     * @param articleInfo
     * @param request
     * @return
     */
    @RequestMapping("/addArticleInfo")
    @ResponseBody
    public ResultUtil addArticleInfo(DbArticleInfo articleInfo , HttpServletRequest request) {
        articleInfo.setCreateTime(new Date());
        int num = articleInfoService.addArticleInfo(articleInfo);
        if(num > 0){
            return ResultUtil.success("添加成功!");
        }else{
            return ResultUtil.error("添加失败!");
        }
    }


    /**
     * 查询商品列表
     * @param page
     * @param limit
     * @param request
     * @return
     */
    @RequestMapping(value = "getArticleInfoList",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public ResultUtil getArticleInfoList(Integer page, Integer limit,HttpServletRequest request){

        return articleInfoService.getArticleInfoList(page,limit);
    }

    /**
     * 查询文章页的文章列表
     * @param
     * @returntype_
     */
    @RequestMapping(value = "getArticleInfoListToArticle",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public ResultUtil getArticleInfoListToArticle( HttpServletRequest request) throws Exception{
        return ResultUtil.success(articleInfoService.getArticleInfoListToArticle());
    }


    /**
     * 删除文章
     * @param id
     * @param request
     * @return
     */
    @RequestMapping("/deleteArticleInfo")
    @ResponseBody
    public ResultUtil deleteArticleInfo(Integer id , HttpServletRequest request) {
        int num = articleInfoService.deleteArticleInfo(id);
        if(num > 0){
            return ResultUtil.success("删除成功!");
        }else{
            return ResultUtil.error("删除失败!");
        }
    }



    /**
     * 更新文章
     * @param articleInfo
     * @param request
     * @return
     */
    @RequestMapping("/updateArticleInfo")
    @ResponseBody
    public ResultUtil updateArticleInfo(DbArticleInfo articleInfo , HttpServletRequest request) {
        int num = articleInfoService.updateArticleInfo(articleInfo);
        if(num > 0){
            return ResultUtil.success("更新成功!");
        }else{
            return ResultUtil.error("更新失败!");
        }
    }



    /**
     * 删除内容
     * @param id
     * @param request
     * @return
     */
    @RequestMapping("/deleteArticleSection")
    @ResponseBody
    public ResultUtil deleteArticleSection(Integer id , HttpServletRequest request) {
        int num = articleSectionService.deleteArticleSection(id);
        if(num > 0){
            return ResultUtil.success("删除成功!");
        }else{
            return ResultUtil.error("删除失败!");
        }
    }




    /**
     * 添加内容
     * @param articleSection
     * @param request
     * @return
     */
    @RequestMapping("/addArticleSection")
    @ResponseBody
    public ResultUtil addArticleSection(DbArticleSection articleSection , HttpServletRequest request) {
        int num = articleSectionService.addArticleSection(articleSection);
        if(num > 0){
            return ResultUtil.success("添加成功!");
        }else{
            return ResultUtil.error("添加失败!");
        }
    }


    /**
     * 查询内容列表
     * @param page
     * @param limit
     * @param request
     * @return
     */
    @RequestMapping(value = "getArticleSectionList",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public ResultUtil getArticleSectionList(Integer page, Integer limit,HttpServletRequest request,Integer articleInfoId){
        return articleSectionService.getArticleSectionList(page,limit,articleInfoId);
    }

    /**
     * 更新内容排序
     * @param id
     * @param sort
     * @return
     */
    @RequestMapping(value = "updateSortSection",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public ResultUtil updateSortSection(Integer id, Integer sort){
        articleSectionService.updateSortSection(id,sort);
        return ResultUtil.success("更新成功!");
    }


    /**
     * 查询文章详情信息
     * @param
     * @param request
     * @return
     */
    @RequestMapping("/getArticleInfoById")
    @ResponseBody
    public ResultUtil getArticleInfoById(Integer id, HttpServletRequest request) {


        Map map = articleInfoService.getArticleInfoById(id);
        List<Map> mapSection=articleSectionService.getArticleSectionListById(id);

        Map result=new HashMap();
        result.put("articleInfo",map);
        result.put("articleSectionList",mapSection);

        return ResultUtil.success(result);
    }


}
