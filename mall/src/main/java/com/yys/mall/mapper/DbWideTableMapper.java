package com.yys.mall.mapper;

import com.yys.mall.entity.DbWideTable;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface DbWideTableMapper {
    /**
     * 添加宽表
     * @param wideTable
     * @return
     */
   int addWideTable(DbWideTable wideTable);

    /**
     * 删除宽表
     * @param id
     * @return
     */
    int deleteWideTable(Integer id);



    /**
     * 查询列表
     * @param map
     * @return
     */
    List<Map>  getWideTableList(Map map);


    /**
     * 更新排序
     * @param id
     * @param sort
     * @return
     */
    int updateSortWideTable(Integer id, Integer sort);

}