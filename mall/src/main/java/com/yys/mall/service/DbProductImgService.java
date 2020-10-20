package com.yys.mall.service;


import com.yys.mall.entity.DbProductImg;
import com.yys.mall.utils.ResultUtil;

import java.util.List;
import java.util.Map;

public interface DbProductImgService {
    /**
     * 添加图片
     * @param productImg
     * @return
     */
    int addProductImg(DbProductImg productImg);

    /**
     * 删除图片
     * @param id
     * @return
     */
    int deleteProductImg(Integer id);


    /**
     * 查询列表
     * @param page
     * @param limit
     * @param productInfoId
     * @return
     */
    ResultUtil getProductImgList(Integer page, Integer limit,Integer productInfoId);

   List<Map> getProductImgListById(Integer id);


    /**
     * 更新排序
     * @param id
     * @param sort
     * @return
     */
    int updateSortImg(Integer id, Integer sort);


}
