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
 * 订单结算表
 * </p>
 *
 * @author Zhouqiyong
 * @since 2018-03-08
 */
@TableName("m_settlement_sheet")
public class SettlementSheet extends Model<SettlementSheet> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 总的订单价格
     */
    @TableField("order_price")
    private Float orderPrice;
    /**
     * 实际支付的价格
     */
    @TableField("actual_price")
    private Float actualPrice;
    /**
     * 操作人id
     */
    @TableField("user_id")
    private Integer userId;
    /**
     * 备注
     */
    private String memo;
    /**
     * 结算时间
     */
    @TableField("create_time")
    private Date createTime;
    /**
     * 最后修改时间
     */
    @TableField("update_time")
    private Date updateTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(Float orderPrice) {
        this.orderPrice = orderPrice;
    }

    public Float getActualPrice() {
        return actualPrice;
    }

    public void setActualPrice(Float actualPrice) {
        this.actualPrice = actualPrice;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "SettlementSheet{" +
        ", id=" + id +
        ", orderPrice=" + orderPrice +
        ", actualPrice=" + actualPrice +
        ", userId=" + userId +
        ", memo=" + memo +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        "}";
    }
}
