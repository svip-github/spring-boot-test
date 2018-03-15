package com.jxcoop.fresh.entity;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 二级栏目权限表
 * </p>
 *
 * @author Zhouqiyong
 * @since 2018-03-08
 */
@TableName("t_rights")
public class Rights extends Model<Rights> {

    private static final long serialVersionUID = 1L;

    /**
     * 二级权限ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 二级权限类型ID 
     */
    @TableField("type_id")
    private Integer typeId;
    /**
     * 二级权限名称
     */
    private String name;
    /**
     * 二级权限描述
     */
    private String description;
    /**
     * 菜单对应的 url， 用来在 首页 动态生成 抽屉菜单
     */
    private String url;
    /**
     * 菜单的排序顺序
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

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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
        return "Rights{" +
        ", id=" + id +
        ", typeId=" + typeId +
        ", name=" + name +
        ", description=" + description +
        ", url=" + url +
        ", sortId=" + sortId +
        ", del=" + del +
        "}";
    }
}
