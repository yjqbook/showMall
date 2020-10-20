package com.yys.mall.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("web")
public class WebPageController {


    @RequestMapping("/index")
    public String index() {
        return "web/index";
    }

    @RequestMapping("/product")
    public String product() {
        return "web/product";
    }
    @RequestMapping("/productInfo")
    public String productInfo() {
        return "web/productInfo";
    }
    @RequestMapping("/member")
    public String member() {
        return "web/member";
    }

    @RequestMapping("/article")
    public String article() {
        return "web/article";
    }
    @RequestMapping("/articleInfo")
    public String articleInfo() {
        return "web/articleInfo";
    }
    @RequestMapping("/brand")
    public String brand() {
        return "web/brand";
    }

}
