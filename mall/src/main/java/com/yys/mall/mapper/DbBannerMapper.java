package com.yys.mall.mapper;

import com.yys.mall.entity.DbBanner;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface DbBannerMapper {
    /**
     * 添加banner
     * @param banner
     * @return
     */
   int addBanner(DbBanner banner);

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
     * 查询列表
     * @param map
     * @return
     */
    List<Map>  getBannerList(Map map);
    Integer  getBannerListCount(Map map);
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