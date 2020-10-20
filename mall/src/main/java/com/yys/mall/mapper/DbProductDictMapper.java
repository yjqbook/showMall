package com.yys.mall.mapper;

import com.yys.mall.entity.DbProductDict;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface DbProductDictMapper {
    /**
     * 添加产品字典
     * @param productDict
     * @return
     */
   int addProductDict(DbProductDict productDict);

    /**
     * 删除产品字典
     * @param id
     * @return
     */
    int deleteProductDict(Integer id);


    /**
     * 查询列表
     * @param map
     * @return
     */
    List<Map>  getProductDictList(Map map);
    Integer  getProductDictListCount(Map map);

    /**
     * 更新排序
     * @param id
     * @param sort
     * @return
     */
    int updateSortDict(Integer id, Integer sort);

    /**
     * 产品页系列和类别列表
     * @param type
     * @return
     */
    List<Map> getProductDictListToIndex(Integer type);

}