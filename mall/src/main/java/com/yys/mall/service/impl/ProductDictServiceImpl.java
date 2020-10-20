package com.yys.mall.service.impl;

import com.yys.mall.entity.DbProductDict;
import com.yys.mall.mapper.DbProductDictMapper;
import com.yys.mall.service.DbProductDictService;
import com.yys.mall.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class ProductDictServiceImpl implements DbProductDictService {

    @Autowired
	private DbProductDictMapper productDictMapper;

    @Override
    public int addProductDict(DbProductDict productDict) {
        return productDictMapper.addProductDict(productDict);
    }

    @Override
    public ResultUtil getProductDictList(Integer page, Integer limit) {
        Map map=new HashMap();
        map.put("page", (page-1)*limit);
        map.put("limit",limit);
        List<Map> dbProductDict = productDictMapper.getProductDictList(map);
        Integer count = productDictMapper.getProductDictListCount(map);
        ResultUtil resultUtil = new ResultUtil();
        resultUtil.setCode(0);
        resultUtil.setCount(count);
        resultUtil.setData(dbProductDict);
        return resultUtil;
    }

    @Override
    public int deleteProductDict(Integer id) {
        return productDictMapper.deleteProductDict(id);
    }

    @Override
    public int updateSortDict(Integer id, Integer sort) {
        return productDictMapper.updateSortDict(id,sort);
    }


    @Override
    public List<Map> getProductDictListToIndex(Integer type) {
        return productDictMapper.getProductDictListToIndex(type);
    }
}
