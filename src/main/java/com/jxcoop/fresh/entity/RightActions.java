package com.jxcoop.fresh.entity;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 二级权限对应路由action,可以有多个actiond对应一个 二级权限（因为一个二级菜单可能包括查询 新增 等请求）
 * </p>
 *
 * @author Zhouqiyong
 * @since 2018-03-08
 */
@TableName("t_right_actions")
public class RightActions extends Model<RightActions> {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 权限id   和 t_rights的id字段关联
     */
    @TableField("right_id")
    private Integer rightId;
    /**
     * 具体的请求路径，可能多个action对应一个二级模块，也就本表的rightid
     */
    private String action;
    private String description;
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

    public Integer getRightId() {
        return rightId;
    }

    public void setRightId(Integer rightId) {
        this.rightId = rightId;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
        return "RightActions{" +
        ", id=" + id +
        ", rightId=" + rightId +
        ", action=" + action +
        ", description=" + description +
        ", del=" + del +
        "}";
    }
}
