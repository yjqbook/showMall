package com.yys.mall.entity;

public class DbProductImg {

    private static final long serialVersionUID = 1L;

	private Integer id;

    /**图片地址
     *
     */
	private String imgurl;

    /**
     * 产品
     */
	private Integer productInfoId;

    /**
     * 排序
     */
	private Integer sort;

    /**
     * 是否删除  0 未删除, 1删除
     */
    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    public Integer getProductInfoId() {
        return productInfoId;
    }

    public void setProductInfoId(Integer productInfoId) {
        this.productInfoId = productInfoId;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
