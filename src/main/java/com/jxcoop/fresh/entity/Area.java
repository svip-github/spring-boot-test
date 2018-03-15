package com.jxcoop.fresh.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 配送服务区域ztree根节点id=0名字 中国
 * </p>
 *
 * @author Zhouqiyong
 * @since 2018-03-08
 */
@TableName("m_area")
public class Area extends Model<Area> {

    private static final long serialVersionUID = 1L;

    /**
     * 前面2位固定+18uuid
     */
    private String id;
    /**
     * 上一级区域sn
     */
    @TableField("parent_id")
    private String parentId;
    /**
     * 片区名称
     */
    private String name;
    /**
     * 线路说明
     */
    private String memo;
    /**
     * 快速搜索字段 存放自己的所有父级sn用逗号隔开，查询使用 find_in_set
     */
    private String path;
    /**
     * 1正常  2已删除
     */
    private Integer sort;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Area{" +
        ", id=" + id +
        ", parentId=" + parentId +
        ", name=" + name +
        ", memo=" + memo +
        ", path=" + path +
        ", sort=" + sort +
        "}";
    }
}
