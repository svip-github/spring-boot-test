package com.jxcoop.fresh.entity;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Zhouqiyong
 * @since 2018-03-08
 */
@TableName("s_commision_config")
public class CommisionConfig extends Model<CommisionConfig> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 名称
     */
    private String name;
    /**
     * 1:积分奖励，2 佣金奖励
     */
    @TableField("reward_type")
    private Integer rewardType;
    /**
     * 类型 1：固定提成；2 比率提成
     */
    private Integer type;
    /**
     * b端积分提成
     */
    @TableField("b_bonus_point")
    private Float bBonusPoint;
    /**
     * b端佣金提成
     */
    @TableField("b_commission")
    private Float bCommission;
    /**
     * c积分提成
     */
    @TableField("c_bonus_point")
    private Float cBonusPoint;
    /**
     * c端佣金提成
     */
    @TableField("c_commission")
    private Float cCommission;
    /**
     * 状态， 是否启用，1：启用；2：停用
     */
    private Integer status;


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

    public Integer getRewardType() {
        return rewardType;
    }

    public void setRewardType(Integer rewardType) {
        this.rewardType = rewardType;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Float getbBonusPoint() {
        return bBonusPoint;
    }

    public void setbBonusPoint(Float bBonusPoint) {
        this.bBonusPoint = bBonusPoint;
    }

    public Float getbCommission() {
        return bCommission;
    }

    public void setbCommission(Float bCommission) {
        this.bCommission = bCommission;
    }

    public Float getcBonusPoint() {
        return cBonusPoint;
    }

    public void setcBonusPoint(Float cBonusPoint) {
        this.cBonusPoint = cBonusPoint;
    }

    public Float getcCommission() {
        return cCommission;
    }

    public void setcCommission(Float cCommission) {
        this.cCommission = cCommission;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "CommisionConfig{" +
        ", id=" + id +
        ", name=" + name +
        ", rewardType=" + rewardType +
        ", type=" + type +
        ", bBonusPoint=" + bBonusPoint +
        ", bCommission=" + bCommission +
        ", cBonusPoint=" + cBonusPoint +
        ", cCommission=" + cCommission +
        ", status=" + status +
        "}";
    }
}
