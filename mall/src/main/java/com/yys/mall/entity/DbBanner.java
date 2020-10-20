package com.yys.mall.entity;

public class DbBanner {

    private static final long serialVersionUID = 1L;

	private Integer id;

    /**
     * 图片名称
     */
	private String bannerName;
    /**
     * 图标链接
     */
	private String bannerImg;
    /**
     * 排序
     */
	private Integer sort;
    /**
     * 状态 : 0 正常, 1 删除
     */
	private Integer status;

    /**
     * 是否为banner 0 不是banner 1,是banner
     * @return
     */
    private Integer type;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBannerName() {
        return bannerName;
    }

    public void setBannerName(String bannerName) {
        this.bannerName = bannerName;
    }

    public String getBannerImg() {
        return bannerImg;
    }

    public void setBannerImg(String bannerImg) {
        this.bannerImg = bannerImg;
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

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}
