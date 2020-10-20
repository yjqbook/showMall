package com.yys.mall.entity;


public class DbProductDict {

    private static final long serialVersionUID = 1L;

	private Integer id;

    /**
     * 图片名称
     */
	private String name;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
