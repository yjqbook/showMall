package com.yys.mall.entity;

public class DbProductInfo {

    private static final long serialVersionUID = 1L;

	private Integer id;

    /**
     * 标题
     */
	private String title;
    /**
     * 二级标题
     */
	private String titleTwo;
    /**
     * 金额
     */
	private Integer money;
    /**
     * 体积(ml)
     */
	private Integer volume;


    /**
     * 规格
     */
	private String norms;
    /**
     * 主图片
     */
	private String titleImg;
    /**
     * 产品类型
     */
	private Integer typeCategory;
    /**
     * 系列
     */
    private Integer typeSeries;

    /**
     * 排序
     */
	private Integer sort;
    /**
     * 天猫地址
     */
	private String tmall;
    /**
     * 京东地址
     */
	private String jd;

    /**
     * 是否删除  0 未删除, 1删除
     */
    private Integer status;

    /**
     * 是否首页, 0 不在 1 在
     */
    private  Integer type;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitleTwo() {
        return titleTwo;
    }

    public void setTitleTwo(String titleTwo) {
        this.titleTwo = titleTwo;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public String getNorms() {
        return norms;
    }

    public void setNorms(String norms) {
        this.norms = norms;
    }

    public String getTitleImg() {
        return titleImg;
    }

    public void setTitleImg(String titleImg) {
        this.titleImg = titleImg;
    }

    public Integer getTypeCategory() {
        return typeCategory;
    }

    public void setTypeCategory(Integer typeCategory) {
        this.typeCategory = typeCategory;
    }

    public Integer getTypeSeries() {
        return typeSeries;
    }

    public void setTypeSeries(Integer typeSeries) {
        this.typeSeries = typeSeries;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getTmall() {
        return tmall;
    }

    public void setTmall(String tmall) {
        this.tmall = tmall;
    }

    public String getJd() {
        return jd;
    }

    public void setJd(String jd) {
        this.jd = jd;
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
