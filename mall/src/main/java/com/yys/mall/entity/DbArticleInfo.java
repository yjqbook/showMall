package com.yys.mall.entity;

import java.util.Date;

public class DbArticleInfo {

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
     * 主图片
     */
	private String titleImg;


    /**
     * 排序
     */
	private Integer sort;

    /**
     * 是否删除  0 未删除, 1删除
     */
    private Integer status;

    private Date createTime;


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

    public String getTitleImg() {
        return titleImg;
    }

    public void setTitleImg(String titleImg) {
        this.titleImg = titleImg;
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
