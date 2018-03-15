package com.jxcoop.fresh.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 佣金记录表
 * </p>
 *
 * @author Zhouqiyong
 * @since 2018-03-08
 */
@TableName("c_commission_info")
public class CommissionInfo extends Model<CommissionInfo> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 用户的id
     */
    @TableField("customer_id")
    private String customerId;
    /**
     * 对应的订单号
     */
    @TableField("order_sn")
    private String orderSn;
    /**
     * 提成方式 1：固定金额提成 2，比率提成
     */
    private Integer type;
    /**
     * 佣金
     */
    private Float commission;
    /**
     * 备注
     */
    private String memo;
    /**
     * 时间
     */
    private Date time;
    /**
     * 到账状态 0：待发放 1：发放失败 2：发放成功
     */
    private Integer status;
    /**
     * 状态最后修改时间
     */
    @TableField("update_time")
    private Date updateTime;
    /**
     * 来源id(奖励来自哪个用户)
     */
    @TableField("child_id")
    private String childId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Float getCommission() {
        return commission;
    }

    public void setCommission(Float commission) {
        this.commission = commission;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getChildId() {
        return childId;
    }

    public void setChildId(String childId) {
        this.childId = childId;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "CommissionInfo{" +
        ", id=" + id +
        ", customerId=" + customerId +
        ", orderSn=" + orderSn +
        ", type=" + type +
        ", commission=" + commission +
        ", memo=" + memo +
        ", time=" + time +
        ", status=" + status +
        ", updateTime=" + updateTime +
        ", childId=" + childId +
        "}";
    }
}
