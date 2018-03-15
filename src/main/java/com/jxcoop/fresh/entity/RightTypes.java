package com.jxcoop.fresh.entity;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 权限大栏目表(一级菜单)
 * </p>
 *
 * @author Zhouqiyong
 * @since 2018-03-08
 */
@TableName("t_right_types")
public class RightTypes extends Model<RightTypes> {

    private static final long serialVersionUID = 1L;

    /**
     * 权限大栏目ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 栏目名称
     */
    private String name;
    /**
     * 栏目描述
     */
    private String description;
    /**
     * 作为 后台管理界面的 左边 一级菜单栏，可以为每个选项配置2个图标用来显示，一个是 打开，一个是关闭，这个是关闭
     */
    @TableField("ico_path")
    private String icoPath;
    /**
     * 作为 后台管理界面的 左边 一级菜单栏，可以为每个选项配置2个图标用来显示，一个是 打开，一个是关闭，这个是打开
     */
    @TableField("ico_path_open")
    private String icoPathOpen;
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

    public String getIcoPath() {
        return icoPath;
    }

    public void setIcoPath(String icoPath) {
        this.icoPath = icoPath;
    }

    public String getIcoPathOpen() {
        return icoPathOpen;
    }

    public void setIcoPathOpen(String icoPathOpen) {
        this.icoPathOpen = icoPathOpen;
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
        return "RightTypes{" +
        ", id=" + id +
        ", name=" + name +
        ", description=" + description +
        ", icoPath=" + icoPath +
        ", icoPathOpen=" + icoPathOpen +
        ", sortId=" + sortId +
        ", del=" + del +
        "}";
    }
}
