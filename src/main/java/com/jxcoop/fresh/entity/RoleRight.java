package com.jxcoop.fresh.entity;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 角色和二级权限的对应表
 * </p>
 *
 * @author Zhouqiyong
 * @since 2018-03-08
 */
@TableName("t_role_right")
public class RoleRight extends Model<RoleRight> {

    private static final long serialVersionUID = 1L;

    /**
     * 编号ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 角色ID
     */
    @TableField("role_id")
    private Integer roleId;
    /**
     * 权限ID
     */
    @TableField("right_id")
    private Integer rightId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getRightId() {
        return rightId;
    }

    public void setRightId(Integer rightId) {
        this.rightId = rightId;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "RoleRight{" +
        ", id=" + id +
        ", roleId=" + roleId +
        ", rightId=" + rightId +
        "}";
    }
}
