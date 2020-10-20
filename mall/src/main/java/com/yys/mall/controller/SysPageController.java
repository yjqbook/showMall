package com.yys.mall.controller;


import com.yys.mall.entity.DbAdminUser;
import com.yys.mall.service.DbArticleInfoService;
import com.yys.mall.service.DbProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
@RequestMapping("sys")
public class SysPageController {

    @Autowired
    private DbProductInfoService productInfoService;
    @Autowired
    private DbArticleInfoService articleInfoService;



    @RequestMapping("/index")
    public String index(HttpServletRequest request) {
        DbAdminUser adminUser=(DbAdminUser)request.getSession().getAttribute("adminUser");
        if(adminUser==null){
            return "redirect:/sys/login";
        }
        return "sys/index";
    }

    @RequestMapping("/changePwdPage")
    public String changePwdPage(HttpServletRequest request) {
        DbAdminUser adminUser=(DbAdminUser)request.getSession().getAttribute("adminUser");
        if(adminUser==null){
            return "redirect:/sys/login";
        }
        return "sys/changePwd";
    }

    @RequestMapping("/login")
    public String login() {
        return "sys/login";
    }




    //首页 banner列表
    @RequestMapping("/bannerListPage")
    public String bannerListPage(HttpServletRequest request) {
        DbAdminUser adminUser=(DbAdminUser)request.getSession().getAttribute("adminUser");
        if(adminUser==null){
            return "redirect:/sys/login";
        }
        return "sys/bannerList";
    }

    //首页 banner 添加页码
    @RequestMapping("/addBannerPage")
    public String addBannerPage(HttpServletRequest request) {
        DbAdminUser adminUser=(DbAdminUser)request.getSession().getAttribute("adminUser");
        if(adminUser==null){
            return "redirect:/sys/login";
        }
        return "sys/bannerAdd";
    }


    @RequestMapping("/productDictListPage")
    public String productDictListPage(HttpServletRequest request) {
        DbAdminUser adminUser=(DbAdminUser)request.getSession().getAttribute("adminUser");
        if(adminUser==null){
            return "redirect:/sys/login";
        }
        return "sys/productDictList";
    }


    @RequestMapping("/addProductDictPage")
    public String addProductDictPage(HttpServletRequest request) {
        DbAdminUser adminUser=(DbAdminUser)request.getSession().getAttribute("adminUser");
        if(adminUser==null){
            return "redirect:/sys/login";
        }
        return "sys/productDictAdd";
    }

    @RequestMapping("/productInfoListPage")
    public String productInfoListPage(HttpServletRequest request) {
        DbAdminUser adminUser=(DbAdminUser)request.getSession().getAttribute("adminUser");
        if(adminUser==null){
            return "redirect:/sys/login";
        }
        return "sys/productInfoList";
    }
    @RequestMapping("/addProductAddPage")
    public String addProductAddPage(HttpServletRequest request) {
        DbAdminUser adminUser=(DbAdminUser)request.getSession().getAttribute("adminUser");
        if(adminUser==null){
            return "redirect:/sys/login";
        }
        return "sys/productInfoAdd";
    }


    @RequestMapping("/addProductEditPage")
    public String addProductEditPage(HttpServletRequest request, Integer id, ModelMap model) {
        DbAdminUser adminUser=(DbAdminUser)request.getSession().getAttribute("adminUser");
        if(adminUser==null){
            return "redirect:/sys/login";
        }

        Map productInfo=  productInfoService.getProductInfoById(id);
        model.addAttribute("productInfo", productInfo);
        model.addAttribute("typeSeries", productInfo.get("typeSeries"));
        model.addAttribute("typeCategory", productInfo.get("typeCategory"));
        return "sys/productInfoEdit";
    }

    @RequestMapping("/productImgListPage")
    public String productImgListPage(HttpServletRequest request ,Integer id,ModelMap modelMap) {
        DbAdminUser adminUser=(DbAdminUser)request.getSession().getAttribute("adminUser");
        if(adminUser==null){
            return "redirect:/sys/login";
        }
        modelMap.addAttribute("productInfoId",id);
        return "sys/productImgList";
    }


    @RequestMapping("/addProductImgPage")
    public String addProductImgPage(HttpServletRequest request,Integer id,ModelMap modelMap) {
        DbAdminUser adminUser=(DbAdminUser)request.getSession().getAttribute("adminUser");
        if(adminUser==null){
            return "redirect:/sys/login";
        }
        modelMap.addAttribute("productInfoId",id);
        return "sys/productImgAdd";
    }


    @RequestMapping("/userListPage")
    public String userListPage(HttpServletRequest request) {
        DbAdminUser adminUser=(DbAdminUser)request.getSession().getAttribute("adminUser");
        if(adminUser==null){
            return "redirect:/sys/login";
        }
        return "sys/userList";
    }
    @RequestMapping("/articleInfoListPage")
    public String articleInfoListPage(HttpServletRequest request) {
        DbAdminUser adminUser=(DbAdminUser)request.getSession().getAttribute("adminUser");
        if(adminUser==null){
            return "redirect:/sys/login";
        }
        return "sys/articleInfoList";
    }


    @RequestMapping("/addArticleInfoAddPage")
    public String addArticleInfoAddPage(HttpServletRequest request) {
        DbAdminUser adminUser=(DbAdminUser)request.getSession().getAttribute("adminUser");
        if(adminUser==null){
            return "redirect:/sys/login";
        }
        return "sys/articleInfoAdd";
    }
    @RequestMapping("/editArticleInfoEditPage")
    public String editArticleInfoEditPage(HttpServletRequest request,Integer id, ModelMap model) {
        DbAdminUser adminUser=(DbAdminUser)request.getSession().getAttribute("adminUser");
        if(adminUser==null){
            return "redirect:/sys/login";
        }

        Map articleInfo=  articleInfoService.getArticleInfoById(id);
        model.addAttribute("articleInfo", articleInfo);

        return "sys/articleInfoEdit";
    }


    @RequestMapping("/articleSectionListPage")
    public String articleSectionListPage(HttpServletRequest request,Integer id,ModelMap modelMap) {
        DbAdminUser adminUser=(DbAdminUser)request.getSession().getAttribute("adminUser");
        if(adminUser==null){
            return "redirect:/sys/login";
        }
        modelMap.addAttribute("articleInfoId",id);
        return "sys/articleSectionList";
    }


    @RequestMapping("/addArticleSectionPage")
    public String addArticleSectionPage(HttpServletRequest request,Integer id,ModelMap modelMap) {
        DbAdminUser adminUser=(DbAdminUser)request.getSession().getAttribute("adminUser");
        if(adminUser==null){
            return "redirect:/sys/login";
        }
        modelMap.addAttribute("articleInfoId",id);
        return "sys/articleSectionAdd";
    }


    @RequestMapping("/wideTableListPage")
    public String wideTableListPage(HttpServletRequest request,ModelMap modelMap) {
        DbAdminUser adminUser=(DbAdminUser)request.getSession().getAttribute("adminUser");
        if(adminUser==null){
            return "redirect:/sys/login";
        }
        return "sys/wideTableList";
    }


    @RequestMapping("/addWideTablePage")
    public String addWideTablePage(HttpServletRequest request,ModelMap modelMap) {
        DbAdminUser adminUser=(DbAdminUser)request.getSession().getAttribute("adminUser");
        if(adminUser==null){
            return "redirect:/sys/login";
        }
        return "sys/wideTableAdd";
    }



    @RequestMapping("/wideTableMemberListPage")
    public String wideTableMemberListPage(HttpServletRequest request,ModelMap modelMap) {
        DbAdminUser adminUser=(DbAdminUser)request.getSession().getAttribute("adminUser");
        if(adminUser==null){
            return "redirect:/sys/login";
        }
        return "sys/wideTableMemberList";
    }


    @RequestMapping("/addWideTableMemberPage")
    public String addWideTableMemberPage(HttpServletRequest request,ModelMap modelMap) {
        DbAdminUser adminUser=(DbAdminUser)request.getSession().getAttribute("adminUser");
        if(adminUser==null){
            return "redirect:/sys/login";
        }
        return "sys/wideTableMemberAdd";
    }


}
