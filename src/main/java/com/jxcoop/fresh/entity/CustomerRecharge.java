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
 * 用户的交易明细
 * </p>
 *
 * @author Zhouqiyong
 * @since 2018-03-08
 */
@TableName("m_customer_recharge")
public class CustomerRecharge extends Model<CustomerRecharge> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 操作人id
     */
    private String operator;
    /**
     * 操作时间
     */
    @TableField("operator_time")
    private Date operatorTime;
    /**
     * 交易前金额
     */
    @TableField("pre_money")
    private Float preMoney;
    /**
     * 操作金额
     */
    @TableField("operator_money")
    private Float operatorMoney;
    /**
     * 交易后金额，一般和用户的余额一致
     */
    @TableField("now_money")
    private Float nowMoney;
    /**
     * 所属企业id
     */
    @TableField("company_id")
    private String companyId;
    /**
     * 用户id
     */
    private String customer;
    /**
     * 备注
     */
    private String note;
    /**
     * 操作人姓名,主要是企业的管理员进行充值
     */
    @TableField("operator_name")
    private String operatorName;
    /**
     * 1.企业划拨，2在线充值，3.佣金提成，4下单奖励。5下单使用
     */
    private Integer type;
    /**
     * 订单编号
     */
    @TableField("order_sn")
    private String orderSn;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Date getOperatorTime() {
        return operatorTime;
    }

    public void setOperatorTime(Date operatorTime) {
        this.operatorTime = operatorTime;
    }

    public Float getPreMoney() {
        return preMoney;
    }

    public void setPreMoney(Float preMoney) {
        this.preMoney = preMoney;
    }

    public Float getOperatorMoney() {
        return operatorMoney;
    }

    public void setOperatorMoney(Float operatorMoney) {
        this.operatorMoney = operatorMoney;
    }

    public Float getNowMoney() {
        return nowMoney;
    }

    public void setNowMoney(Float nowMoney) {
        this.nowMoney = nowMoney;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "CustomerRecharge{" +
        ", id=" + id +
        ", operator=" + operator +
        ", operatorTime=" + operatorTime +
        ", preMoney=" + preMoney +
        ", operatorMoney=" + operatorMoney +
        ", nowMoney=" + nowMoney +
        ", companyId=" + companyId +
        ", customer=" + customer +
        ", note=" + note +
        ", operatorName=" + operatorName +
        ", type=" + type +
        ", orderSn=" + orderSn +
        "}";
    }
}
