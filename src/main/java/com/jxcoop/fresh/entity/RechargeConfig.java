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
 * 充值优惠配置表
 * </p>
 *
 * @author Zhouqiyong
 * @since 2018-03-08
 */
@TableName("s_recharge_config")
public class RechargeConfig extends Model<RechargeConfig> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 充值金额
     */
    @TableField("recharge_money")
    private Float rechargeMoney;
    /**
     * 实际支付金额
     */
    @TableField("actual_payment")
    private Float actualPayment;
    /**
     * 优惠金额
     */
    @TableField("discount_money")
    private Float discountMoney;
    /**
     * 时间
     */
    private Date time;
    /**
     * 1：正常 2删除
     */
    private Integer del;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getRechargeMoney() {
        return rechargeMoney;
    }

    public void setRechargeMoney(Float rechargeMoney) {
        this.rechargeMoney = rechargeMoney;
    }

    public Float getActualPayment() {
        return actualPayment;
    }

    public void setActualPayment(Float actualPayment) {
        this.actualPayment = actualPayment;
    }

    public Float getDiscountMoney() {
        return discountMoney;
    }

    public void setDiscountMoney(Float discountMoney) {
        this.discountMoney = discountMoney;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
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
        return "RechargeConfig{" +
        ", id=" + id +
        ", rechargeMoney=" + rechargeMoney +
        ", actualPayment=" + actualPayment +
        ", discountMoney=" + discountMoney +
        ", time=" + time +
        ", del=" + del +
        "}";
    }
}
