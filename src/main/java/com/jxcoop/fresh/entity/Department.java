package com.jxcoop.fresh.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 部门表
 * </p>
 *
 * @author Zhouqiyong
 * @since 2018-03-08
 */
@TableName("t_department")
public class Department extends Model<Department> {

    private static final long serialVersionUID = 1L;

    private Integer id;
    /**
     * 父节点 id
     */
    @TableField("parent_id")
    private Integer parentId;
    /**
     * 部门名称
     */
    private String name;
    /**
     * 排序id， 政府部门 必须要这个玩意
     */
    @TableField("sort_id")
    private Integer sortId;
    /**
     * 逻辑删除(1：正常，2：已删除 3 停用)
     */
    private Integer del;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSortId() {
        return sortId;
    }

    public void setSortId(Integer sortId) {
        this.sortId = sortId;
    }

    public Integer getDel() {
        return del;
    }

    public void setDel(Integer del) {
        this.del = del;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Department{" +
        ", id=" + id +
        ", parentId=" + parentId +
        ", name=" + name +
        ", sortId=" + sortId +
        ", del=" + del +
        "}";
    }
}
