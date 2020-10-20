package com.yys.mall.service.impl;

import com.yys.mall.entity.DbArticleSection;
import com.yys.mall.mapper.DbArticleSectionMapper;
import com.yys.mall.service.DbArticleSectionService;
import com.yys.mall.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class ArticleSectionServiceImpl implements DbArticleSectionService {

    @Autowired
	private DbArticleSectionMapper articleSectionMapper;

    @Override
    public int addArticleSection(DbArticleSection dbArticleSection) {
        return articleSectionMapper.addArticleSection(dbArticleSection);
    }

    @Override
    public ResultUtil getArticleSectionList(Integer page, Integer limit,Integer articleInfoId) {
        Map map=new HashMap();
        map.put("page", (page-1)*limit);
        map.put("limit",limit);
        map.put("articleInfoId",articleInfoId);
        List<Map> dbArticleSection = articleSectionMapper.getArticleSectionList(map);
        Integer count = articleSectionMapper.getArticleSectionListCount(map);
        ResultUtil resultUtil = new ResultUtil();
        resultUtil.setCode(0);
        resultUtil.setCount(count);
        resultUtil.setData(dbArticleSection);
        return resultUtil;
    }

    @Override
    public int deleteArticleSection(Integer id) {
        return articleSectionMapper.deleteArticleSection(id);
    }

    @Override
    public int updateSortSection(Integer id, Integer sort) {
        return articleSectionMapper.updateSortSection(id,sort);
    }


    @Override
    public List<Map> getArticleSectionListById(Integer id) {
        return articleSectionMapper.getArticleSectionListById(id);
    }
}
