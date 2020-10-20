package com.yys.mall.mapper;

import com.yys.mall.entity.DbProductInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface DbProductInfoMapper {
    /**
     * 添加商品
     * @param productInfo
     * @return
     */
   int addProductInfo(DbProductInfo productInfo);

    /**
     * 删除商品
     * @param id
     * @return
     */
    int deleteProductInfo(Integer id);


    /**
     * 更新商品
     * @param productInfo
     * @return
     */
    int updateProductInfo(DbProductInfo productInfo);

    /**
     * 查询列表
     * @param map
     * @return
     */
    List<Map>  getProductInfoList(Map map);
    Integer  getProductInfoListCount(Map map);
    /**
     * 通过id查询 商品信息
     * @param id
     * @return
     */
    Map  getProductInfoById(Integer id);

    /**
     * 设置到首页
     * @param id
     * @param type
     * @return
     */
 int updateInfoType(Integer id,Integer type);

    /**
     * 得到首页的商品展示
     * @return
     */
  List<Map>  getProductInfoListToIndex();

    /**
     * 产品页查询列表
     * @param typeSeries
     * @param typeCategory
     * @param title
     * @return
     */
  List<Map>  getProductInfoListToProduct(Integer  typeSeries ,Integer typeCategory ,String title);

}