package com.jxcoop.fresh.entity;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 角色信息表
 * </p>
 *
 * @author Zhouqiyong
 * @since 2018-03-08
 */
@TableName("t_roles")
public class Roles extends Model<Roles> {

    private static final long serialVersionUID = 1L;

    /**
     * 角色ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 角色名称
     */
    private String name;
    /**
     * 角色描述
     */
    private String description;
    /**
     * 角色包含的功能模块（大模块） 用来控制修改角色的时候显示哪些一级菜单
     */
    @TableField("right_ids")
    private String rightIds;
    /**
     * 逻辑删除(1：未删除，2：已删除)
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

    public String getRightIds() {
        return rightIds;
    }

    public void setRightIds(String rightIds) {
        this.rightIds = rightIds;
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
        return "Roles{" +
        ", id=" + id +
        ", name=" + name +
        ", description=" + description +
        ", rightIds=" + rightIds +
        ", del=" + del +
        "}";
    }
}
