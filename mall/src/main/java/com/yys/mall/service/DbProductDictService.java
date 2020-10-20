package com.yys.mall.service;


import com.yys.mall.entity.DbProductDict;
import com.yys.mall.utils.ResultUtil;

import java.util.List;
import java.util.Map;

public interface DbProductDictService {
    /**
     * 添加产品字典
     * @param productDict
     * @return
     */
    int addProductDict(DbProductDict productDict);

    /**
     * 删除产品字典
     * @param id
     * @return
     */
    int deleteProductDict(Integer id);


    /**
     * 得到产品字典列表
     * @param page
     * @param limit
     * @return
     */
    ResultUtil getProductDictList(Integer page, Integer limit);

    /**
     * 更新排序
     * @param id
     * @param sort
     * @return
     */
    int updateSortDict(Integer id, Integer sort);


    /**
     * 产品页系列和类别列表
     * @param type
     * @return
     */
    List<Map> getProductDictListToIndex(Integer type);

}
