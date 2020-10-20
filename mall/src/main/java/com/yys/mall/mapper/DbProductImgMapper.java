package com.yys.mall.mapper;

import com.yys.mall.entity.DbProductImg;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface DbProductImgMapper {
    /**
     * 添加商品
     * @param productImg
     * @return
     */
   int addProductImg(DbProductImg productImg);

    /**
     * 删除图片
     * @param id
     * @return
     */
    int deleteProductImg(Integer id);


    /**
     * 查询列表
     * @param map
     * @return
     */
    List<Map>  getProductImgList(Map map);
    Integer  getProductImgListCount(Map map);


    List<Map> getProductImgListById(Integer id);

    /**
     * 更新排序
     * @param id
     * @param sort
     * @return
     */
   int updateSortImg(Integer id, Integer sort);

}