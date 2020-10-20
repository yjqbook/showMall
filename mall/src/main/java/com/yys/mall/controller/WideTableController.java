package com.yys.mall.controller;

import com.yys.mall.entity.DbWideTable;
import com.yys.mall.service.DbWideTableService;
import com.yys.mall.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("sys/wideTable")
public class WideTableController {
    @Autowired
    private DbWideTableService wideTableService;

    /**
     * 添加
     * @param
     * @return
     */
    @RequestMapping("/addWideTable")
    @ResponseBody
    public ResultUtil addWideTable(DbWideTable dbWideTable) throws Exception{

        int num = wideTableService.addWideTable(dbWideTable);
        if(num > 0){
            return ResultUtil.success("添加成功!");
        }else{
            return ResultUtil.error("添加失败!");
        }
    }

    /**
     * 删除
     * @param id
     * @param request
     * @return
     */
    @RequestMapping("/deleteWideTable")
    @ResponseBody
    public ResultUtil deleteWideTable(Integer id , HttpServletRequest request) {
        int num = wideTableService.deleteWideTable(id);
        if(num > 0){
            return ResultUtil.success("删除成功!");
        }else{
            return ResultUtil.error("删除失败!");
        }
    }




    /**
     * 查询列表
     * @param request
     * @return
     */
    @RequestMapping(value = "getWideTableList",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public ResultUtil getWideTableList(Integer type,HttpServletRequest request){
        Map map=new HashMap();
        map.put("type",type);
        return wideTableService.getWideTableList(map);
    }


    /**
     * 排序
     * @return
     */
    @RequestMapping(value = "updateSortWideTable",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public ResultUtil updateSortWideTable(Integer id, Integer sort){
        wideTableService.updateSortWideTable(id,sort);
        return ResultUtil.success("更新成功!");
    }



}
