package com.yys.mall.controller;

import com.yys.mall.entity.DbProductDict;
import com.yys.mall.entity.DbProductImg;
import com.yys.mall.entity.DbProductInfo;
import com.yys.mall.service.DbProductDictService;
import com.yys.mall.service.DbProductImgService;
import com.yys.mall.service.DbProductInfoService;
import com.yys.mall.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("sys/product")
public class ProductController {
    @Autowired
    private DbProductDictService productDictService;
    @Autowired
    private DbProductInfoService productInfoService;
    @Autowired
    private DbProductImgService productImgService;
    /**
     * 添加字典列表
     * @param productDict
     * @param request
     * @return
     */
    @RequestMapping("/addProductDict")
    @ResponseBody
    public ResultUtil addProductDict(DbProductDict productDict , HttpServletRequest request) {
        int num = productDictService.addProductDict(productDict);
        if(num > 0){
            return ResultUtil.success("添加成功!");
        }else{
            return ResultUtil.error("添加失败!");
        }
    }

    /**
     * 删除字典列表
     * @param id
     * @param request
     * @return
     */
    @RequestMapping("/deleteProductDict")
    @ResponseBody
    public ResultUtil deleteProductDict(Integer id , HttpServletRequest request) {
        int num = productDictService.deleteProductDict(id);
        if(num > 0){
            return ResultUtil.success("删除成功!");
        }else{
            return ResultUtil.error("删除失败!");
        }
    }


    /**
     * 查询字典列表
     * @param page
     * @param limit
     * @param request
     * @return
     */
    @RequestMapping(value = "getProductDictList",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public ResultUtil getProductDictList(Integer page, Integer limit,HttpServletRequest request){

        return productDictService.getProductDictList(page,limit);
    }



    /**
     * 查询产品页的产品系列
     * @param request
     * @return
     */
    @RequestMapping(value = "getProductSeriesDictListToIndex",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public ResultUtil getProductSeriesDictListToIndex(HttpServletRequest request){
        Integer type=1;
        return ResultUtil.success(productDictService.getProductDictListToIndex(type));
    }


    /**
     * 查询产品页的产品类别
     * @param
     * @returntype_
     */
    @RequestMapping(value = "getProductCategoryDictListToIndex",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public ResultUtil getProductCategoryDictListToIndex(HttpServletRequest request){
        Integer type=2;
        return ResultUtil.success(productDictService.getProductDictListToIndex(type));
    }






    /**
     * 更新图片排序
     * @param id
     * @param sort
     * @return
     */
    @RequestMapping(value = "updateSortDict",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public ResultUtil updateSortDict(Integer id, Integer sort){
        productDictService.updateSortDict(id,sort);
        return ResultUtil.success("更新成功!");
    }

    /**
     * 添加商品
     * @param productInfo
     * @param request
     * @return
     */
    @RequestMapping("/addProductInfo")
    @ResponseBody
    public ResultUtil addProductInfo(DbProductInfo productInfo , HttpServletRequest request) {
        int num = productInfoService.addProductInfo(productInfo);
        if(num > 0){
            return ResultUtil.success("添加成功!");
        }else{
            return ResultUtil.error("添加失败!");
        }
    }
    /**
     * 添加商品
     * @param
     * @param request
     * @return
     */
    @RequestMapping("/getProductInfoById")
    @ResponseBody
    public ResultUtil getProductInfoById(Integer id, HttpServletRequest request) {


        Map map = productInfoService.getProductInfoById(id);
        List<Map> mapImg=productImgService.getProductImgListById(id);

        Map result=new HashMap();
        result.put("productInfo",map);
        result.put("productInfoImgList",mapImg);

        return ResultUtil.success(result);
    }



    /**
     * 查询商品列表
     * @param page
     * @param limit
     * @param request
     * @return
     */
    @RequestMapping(value = "getProductInfoList",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public ResultUtil getProductInfoList(Integer page, Integer limit,HttpServletRequest request){

        return productInfoService.getProductInfoList(page,limit);
    }

    /**
     * 查询产品页的产品列表
     * @param
     * @returntype_
     */
    @RequestMapping(value = "getProductInfoListToProduct",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public ResultUtil getProductInfoListToProduct(Integer hearSearch,Integer  typeSeries ,Integer typeCategory ,String title, HttpServletRequest request) throws Exception{

        if(hearSearch!=null && hearSearch==1){
            title= URLDecoder.decode(title,"utf-8");
            title= URLDecoder.decode(title,"utf-8");
        }
        if((hearSearch ==null || hearSearch!=1) && title!=null){
            title=title.replaceAll("%", "/%").replaceAll("_", "/_");
        }



        return ResultUtil.success(productInfoService.getProductInfoListToProduct(typeSeries,typeCategory,title));
    }


    /**
     * 查询首页商品列表
     * @param request
     * @return
     */
    @RequestMapping(value = "getProductInfoListToIndex",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public ResultUtil getProductInfoListToIndex(HttpServletRequest request){
        return ResultUtil.success(productInfoService.getProductInfoListToIndex());
    }




    /**
     * 删除商品
     * @param id
     * @param request
     * @return
     */
    @RequestMapping("/deleteProductInfo")
    @ResponseBody
    public ResultUtil deleteProductInfo(Integer id , HttpServletRequest request) {
        int num = productInfoService.deleteProductInfo(id);
        if(num > 0){
            return ResultUtil.success("删除成功!");
        }else{
            return ResultUtil.error("删除失败!");
        }
    }



    /**
     * 更新商品
     * @param dbProductInfo
     * @param request
     * @return
     */
    @RequestMapping("/updateProductInfo")
    @ResponseBody
    public ResultUtil updateProductInfo(DbProductInfo dbProductInfo , HttpServletRequest request) {
        int num = productInfoService.updateProductInfo(dbProductInfo);
        if(num > 0){
            return ResultUtil.success("更新成功!");
        }else{
            return ResultUtil.error("更新失败!");
        }
    }

    /**
     * 设置到首页
     * @param request
     * @return
     */
    @RequestMapping("/updateInfoType")
    @ResponseBody
    public ResultUtil updateInfoType(Integer id , Integer type , HttpServletRequest request) {
        int num = productInfoService.updateInfoType(id,type);
        if(num > 0){
            return ResultUtil.success("更新成功!");
        }else{
            return ResultUtil.error("更新失败!");
        }
    }



    /**
     * 删除图片
     * @param id
     * @param request
     * @return
     */
    @RequestMapping("/deleteProductImg")
    @ResponseBody
    public ResultUtil deleteProductImg(Integer id , HttpServletRequest request) {
        int num = productImgService.deleteProductImg(id);
        if(num > 0){
            return ResultUtil.success("删除成功!");
        }else{
            return ResultUtil.error("删除失败!");
        }
    }




    /**
     * 添加图片
     * @param productImg
     * @param request
     * @return
     */
    @RequestMapping("/addProductImg")
    @ResponseBody
    public ResultUtil addProductImg(DbProductImg productImg , HttpServletRequest request) {
        int num = productImgService.addProductImg(productImg);
        if(num > 0){
            return ResultUtil.success("添加成功!");
        }else{
            return ResultUtil.error("添加失败!");
        }
    }


    /**
     * 查询图片
     * @param page
     * @param limit
     * @param request
     * @return
     */
    @RequestMapping(value = "getProductImgList",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public ResultUtil getProductImgList(Integer page, Integer limit,HttpServletRequest request,Integer productInfoId){
        return productImgService.getProductImgList(page,limit,productInfoId);
    }

    /**
     * 更新图片排序
     * @param id
     * @param sort
     * @return
     */
    @RequestMapping(value = "updateSortImg",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public ResultUtil updateSortImg(Integer id, Integer sort){
        productImgService.updateSortImg(id,sort);
        return ResultUtil.success("更新成功!");
    }




}
