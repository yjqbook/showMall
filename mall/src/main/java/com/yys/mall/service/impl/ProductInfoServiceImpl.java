package com.yys.mall.service.impl;

import com.yys.mall.entity.DbProductInfo;
import com.yys.mall.mapper.DbProductInfoMapper;
import com.yys.mall.service.DbProductInfoService;
import com.yys.mall.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class ProductInfoServiceImpl implements DbProductInfoService {

    @Autowired
	private DbProductInfoMapper productInfoMapper;

    @Override
    public int addProductInfo(DbProductInfo dbProductInfo) {
        return productInfoMapper.addProductInfo(dbProductInfo);
    }

    @Override
    public ResultUtil getProductInfoList(Integer page, Integer limit) {
        Map map=new HashMap();
        map.put("page", (page-1)*limit);
        map.put("limit",limit);
        List<Map> dbProductInfo = productInfoMapper.getProductInfoList(map);
        Integer count = productInfoMapper.getProductInfoListCount(map);
        ResultUtil resultUtil = new ResultUtil();
        resultUtil.setCode(0);
        resultUtil.setCount(count);
        resultUtil.setData(dbProductInfo);
        return resultUtil;
    }


    @Override
    public List<Map> getProductInfoListToIndex() {
        return productInfoMapper.getProductInfoListToIndex();
    }

    @Override
    public int deleteProductInfo(Integer id) {
        return productInfoMapper.deleteProductInfo(id);
    }

    @Override
    public int updateProductInfo(DbProductInfo dbProductInfo) {
        return productInfoMapper.updateProductInfo(dbProductInfo);
    }

    @Override
    public Map getProductInfoById(Integer id) {
        return productInfoMapper.getProductInfoById(id);
    }


    @Override
    public int updateInfoType(Integer id, Integer type) {
        return productInfoMapper.updateInfoType(id,type);
    }

    @Override
    public List<Map> getProductInfoListToProduct(Integer typeSeries, Integer typeCategory, String title) {
        return productInfoMapper.getProductInfoListToProduct(typeSeries,typeCategory,title);
    }
}
