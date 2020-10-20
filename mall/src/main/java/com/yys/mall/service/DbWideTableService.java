package com.yys.mall.service;


import com.yys.mall.entity.DbWideTable;
import com.yys.mall.utils.ResultUtil;

import java.util.Map;

public interface DbWideTableService {

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
    ResultUtil getWideTableList(Map map);


    /**
     * 更新排序
     * @param id
     * @param sort
     * @return
     */
    int updateSortWideTable(Integer id, Integer sort);

}
