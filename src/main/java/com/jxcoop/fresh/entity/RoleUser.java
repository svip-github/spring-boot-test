package com.jxcoop.fresh.entity;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 管理员和角色对应表
 * </p>
 *
 * @author Zhouqiyong
 * @since 2018-03-08
 */
@TableName("t_role_user")
public class RoleUser extends Model<RoleUser> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 管理员ID
     */
    @TableField("user_id")
    private Integer userId;
    /**
     * 角色ID
     */
    @TableField("role_id")
    private Integer roleId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "RoleUser{" +
        ", id=" + id +
        ", userId=" + userId +
        ", roleId=" + roleId +
        "}";
    }
}
