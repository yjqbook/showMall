package com.yys.mall.service;


import com.yys.mall.entity.DbArticleInfo;
import com.yys.mall.utils.ResultUtil;

import java.util.List;
import java.util.Map;

public interface DbArticleInfoService {

    /**
     * 添加文章
     * @param articleInfo
     * @return
     */
    int addArticleInfo(DbArticleInfo articleInfo);

    /**
     * 删除文章
     * @param id
     * @return
     */
    int deleteArticleInfo(Integer id);


    /**
     * 更新文章
     * @param articleInfo
     * @return
     */
    int updateArticleInfo(DbArticleInfo articleInfo);

    /**
     * 查询列表
     * @return
     */
    ResultUtil getArticleInfoList(Integer page, Integer limit);
    /**
     * 通过id查询 商品信息
     * @param id
     * @return
     */
    Map  getArticleInfoById(Integer id);



    /**
     * 文章页查询列表
     * @return
     */
    List<Map>  getArticleInfoListToArticle();

}
