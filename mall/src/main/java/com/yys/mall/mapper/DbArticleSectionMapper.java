package com.yys.mall.mapper;

import com.yys.mall.entity.DbArticleSection;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface DbArticleSectionMapper {
    /**
     * 添加商品
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
     * @param map
     * @return
     */
    List<Map>  getArticleSectionList(Map map);
    Integer  getArticleSectionListCount(Map map);


    List<Map> getArticleSectionListById(Integer id);

    /**
     * 更新排序
     * @param id
     * @param sort
     * @return
     */
   int updateSortSection(Integer id, Integer sort);

}