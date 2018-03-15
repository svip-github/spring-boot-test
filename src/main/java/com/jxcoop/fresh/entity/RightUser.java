package com.jxcoop.fresh.entity;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 管理员和权限的对应表，除非了用角色赋予功能，还可以直接赋予二级权限
 * </p>
 *
 * @author Zhouqiyong
 * @since 2018-03-08
 */
@TableName("t_right_user")
public class RightUser extends Model<RightUser> {

    private static final long serialVersionUID = 1L;

    /**
     * 编号ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 管理员ID
     */
    @TableField("user_id")
    private Integer userId;
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

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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
        return "RightUser{" +
        ", id=" + id +
        ", userId=" + userId +
        ", rightId=" + rightId +
        "}";
    }
}
