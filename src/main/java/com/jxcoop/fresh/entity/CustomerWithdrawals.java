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
 * 
 * </p>
 *
 * @author Zhouqiyong
 * @since 2018-03-08
 */
@TableName("c_customer_withdrawals")
public class CustomerWithdrawals extends Model<CustomerWithdrawals> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 用户id
     */
    @TableField("customer_id")
    private String customerId;
    /**
     * 提现的金额
     */
    private Float money;
    /**
     * 提现类型 1 余额提现;2佣金提现;3 积分兑换提现
     */
    private Integer type;
    /**
     * 提现状态 1 待审核; 2 审核失败 ;3 待发放;4 发放失败;5发放成功 
     */
    private Integer status;
    /**
     * 提现时间
     */
    private Date time;
    /**
     * 处理时间 修改时间
     */
    @TableField("update_time")
    private Date updateTime;
    /**
     * 备注
     */
    private String memo;


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

    public Float getMoney() {
        return money;
    }

    public void setMoney(Float money) {
        this.money = money;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "CustomerWithdrawals{" +
        ", id=" + id +
        ", customerId=" + customerId +
        ", money=" + money +
        ", type=" + type +
        ", status=" + status +
        ", time=" + time +
        ", updateTime=" + updateTime +
        ", memo=" + memo +
        "}";
    }
}
