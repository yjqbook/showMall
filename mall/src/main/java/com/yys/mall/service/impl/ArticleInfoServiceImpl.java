package com.yys.mall.service.impl;

import com.yys.mall.entity.DbArticleInfo;
import com.yys.mall.mapper.DbArticleInfoMapper;
import com.yys.mall.service.DbArticleInfoService;
import com.yys.mall.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class ArticleInfoServiceImpl implements DbArticleInfoService {

    @Autowired
	private DbArticleInfoMapper articleInfoMapper;

    @Override
    public int addArticleInfo(DbArticleInfo articleInfo) {
        return articleInfoMapper.addArticleInfo(articleInfo);
    }

    @Override
    public ResultUtil getArticleInfoList(Integer page, Integer limit) {
        Map map=new HashMap();
        map.put("page", (page-1)*limit);
        map.put("limit",limit);
        List<Map> dbArticleInfo = articleInfoMapper.getArticleInfoList(map);
        Integer count = articleInfoMapper.getArticleInfoListCount(map);
        ResultUtil resultUtil = new ResultUtil();
        resultUtil.setCode(0);
        resultUtil.setCount(count);
        resultUtil.setData(dbArticleInfo);
        return resultUtil;
    }




    @Override
    public int deleteArticleInfo(Integer id) {
        return articleInfoMapper.deleteArticleInfo(id);
    }

    @Override
    public int updateArticleInfo(DbArticleInfo dbArticleInfo) {
        return articleInfoMapper.updateArticleInfo(dbArticleInfo);
    }

    @Override
    public Map getArticleInfoById(Integer id) {
        return articleInfoMapper.getArticleInfoById(id);
    }


    @Override
    public List<Map> getArticleInfoListToArticle() {
        return articleInfoMapper.getArticleInfoListToArticle();
    }
}
