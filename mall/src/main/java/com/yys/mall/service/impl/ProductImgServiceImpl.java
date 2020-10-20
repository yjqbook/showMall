package com.yys.mall.service.impl;

import com.yys.mall.entity.DbProductImg;
import com.yys.mall.mapper.DbProductImgMapper;
import com.yys.mall.service.DbProductImgService;
import com.yys.mall.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class ProductImgServiceImpl implements DbProductImgService {

    @Autowired
	private DbProductImgMapper productImgMapper;

    @Override
    public int addProductImg(DbProductImg dbProductImg) {
        return productImgMapper.addProductImg(dbProductImg);
    }

    @Override
    public ResultUtil getProductImgList(Integer page, Integer limit,Integer productInfoId) {
        Map map=new HashMap();
        map.put("page", (page-1)*limit);
        map.put("limit",limit);
        map.put("productInfoId",productInfoId);
        List<Map> dbProductInfo = productImgMapper.getProductImgList(map);
        Integer count = productImgMapper.getProductImgListCount(map);
        ResultUtil resultUtil = new ResultUtil();
        resultUtil.setCode(0);
        resultUtil.setCount(count);
        resultUtil.setData(dbProductInfo);
        return resultUtil;
    }

    @Override
    public int deleteProductImg(Integer id) {
        return productImgMapper.deleteProductImg(id);
    }

    @Override
    public int updateSortImg(Integer id, Integer sort) {
        return productImgMapper.updateSortImg(id,sort);
    }


    @Override
    public List<Map> getProductImgListById(Integer id) {
        return productImgMapper.getProductImgListById(id);
    }
}
