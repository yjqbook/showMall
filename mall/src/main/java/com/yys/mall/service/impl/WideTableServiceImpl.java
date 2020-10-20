package com.yys.mall.service.impl;

import com.yys.mall.entity.DbWideTable;
import com.yys.mall.mapper.DbWideTableMapper;
import com.yys.mall.service.DbWideTableService;
import com.yys.mall.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service
public class WideTableServiceImpl implements DbWideTableService {

    @Autowired
	private DbWideTableMapper wideTableMapper;

    @Override
    public int addWideTable(DbWideTable wideTable) {
        return wideTableMapper.addWideTable(wideTable);
    }

    @Override
    public int deleteWideTable(Integer id) {
        return wideTableMapper.deleteWideTable(id);
    }

    @Override
    public ResultUtil getWideTableList(Map map) {

        List<Map> dbUser = wideTableMapper.getWideTableList(map);
        Integer count =0;
        if(dbUser!=null){
            count = dbUser.size();
        }
        ResultUtil resultUtil = new ResultUtil();
        resultUtil.setCode(0);
        resultUtil.setCount(count);
        resultUtil.setData(dbUser);
        return resultUtil;
    }

    @Override
    public int updateSortWideTable(Integer id, Integer sort) {
        return wideTableMapper.updateSortWideTable(id,sort);
    }
}
