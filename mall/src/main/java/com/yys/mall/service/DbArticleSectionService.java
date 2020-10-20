package com.yys.mall.service;


import com.yys.mall.entity.DbArticleSection;
import com.yys.mall.utils.ResultUtil;

import java.util.List;
import java.util.Map;

public interface DbArticleSectionService {
    /**
     * 添加图片
     * @param articleSection
     * @return
     */
    int addArticleSection(DbArticleSection articleSection);

    /**
     * 删除图片
     * @param id
     * @return
     */
    int deleteArticleSection(Integer id);


    /**
     * 查询列表
     * @param page
     * @param limit
     * @param articleInfoId
     * @return
     */
    ResultUtil getArticleSectionList(Integer page, Integer limit, Integer articleInfoId);

   List<Map> getArticleSectionListById(Integer id);


    /**
     * 更新排序
     * @param id
     * @param sort
     * @return
     */
    int updateSortSection(Integer id, Integer sort);


}
