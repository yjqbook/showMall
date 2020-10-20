package com.yys.mall.service.impl;

import com.yys.mall.entity.DbBanner;
import com.yys.mall.mapper.DbBannerMapper;
import com.yys.mall.service.DbBannerService;
import com.yys.mall.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class BannerServiceImpl implements DbBannerService {

    @Autowired
	private DbBannerMapper bannerMapper;

    @Override
    public int addBanner(DbBanner dbBanner) {
        return bannerMapper.addBanner(dbBanner);
    }

    @Override
    public ResultUtil getBannerList(Integer page, Integer limit) {
        Map map=new HashMap();
        map.put("page", (page-1)*limit);
        map.put("limit",limit);
        List<Map> dbBanner = bannerMapper.getBannerList(map);
        Integer count = bannerMapper.getBannerListCount(map);
        ResultUtil resultUtil = new ResultUtil();
        resultUtil.setCode(0);
        resultUtil.setCount(count);
        resultUtil.setData(dbBanner);
        return resultUtil;
    }

    @Override
    public int deleteBanner(Integer id) {
        return bannerMapper.deleteBanner(id);
    }

    @Override
    public int updateTypeBanner(Map map) {
        return bannerMapper.updateTypeBanner(map);
    }

    @Override
    public List<Map> getIndexBanner() {
        return bannerMapper.getIndexBanner();
    }

    @Override
    public int updateSortBanner(Integer id, Integer sort) {
        return bannerMapper.updateSortBanner(id,sort);
    }
}
