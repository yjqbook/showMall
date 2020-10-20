package com.yys.mall.service;


import com.yys.mall.entity.DbBanner;
import com.yys.mall.utils.ResultUtil;

import java.util.List;
import java.util.Map;

public interface DbBannerService {
    /**
     * 添加banner
     * @param dbBanner
     * @return
     */
    int addBanner(DbBanner dbBanner);

    /**
     * 得到banner列表
     * @param page
     * @param limit
     * @return
     */
    ResultUtil getBannerList(Integer page, Integer limit);

    /**
     * 删除banner
     * @param id
     * @return
     */
    int deleteBanner(Integer id);

    /**
     * 更新banner
     * @param map
     * @return
     */
    int updateTypeBanner(Map map);

    /**
     * 首页banner
     * @return
     */
    List<Map> getIndexBanner();

    /**
     * 更新排序
     * @param id
     * @param sort
     * @return
     */
    int updateSortBanner(Integer id, Integer sort);


}
