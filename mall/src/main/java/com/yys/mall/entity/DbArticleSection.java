package com.yys.mall.entity;

public class DbArticleSection {

    private static final long serialVersionUID = 1L;

	private Integer id;

    /**
     * 类型:1 1级标题, 2 2级标题 3 段落, 4 图片
     */
    private Integer type;
    /**
     *  内容或者图片地址
     */
	private String content;

    /**
     * 文章
     */
	private Integer articleInfoId;

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

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getArticleInfoId() {
        return articleInfoId;
    }

    public void setArticleInfoId(Integer articleInfoId) {
        this.articleInfoId = articleInfoId;
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
