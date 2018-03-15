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
 * 交易明细表
 * </p>
 *
 * @author Zhouqiyong
 * @since 2018-03-08
 */
@TableName("m_order_paydetail")
public class OrderPaydetail extends Model<OrderPaydetail> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 交易编号 流水号
     */
    @TableField("trade_no")
    private String tradeNo;
    /**
     * 交易类型  支付渠道
     */
    @TableField("trade_type")
    private String tradeType;
    /**
     * 交易描述
     */
    @TableField("trade_desc")
    private String tradeDesc;
    /**
     * 本地传给支付通道的订单编号,会返回，本表唯一约束
     */
    @TableField("order_no")
    private String orderNo;
    /**
     * 谁的交易记录 
     */
    @TableField("member_id")
    private String memberId;
    /**
     * 支付类型 wxpay|alipay|yue
     */
    @TableField("trade_paytype")
    private String tradePaytype;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;
    /**
     * 交易金额
     */
    @TableField("trade_amount")
    private Float tradeAmount;
    /**
     * 支付平台付款成功返回信息
     */
    @TableField("trade_payed_info")
    private String tradePayedInfo;
    /**
     * 支付金额
     */
    @TableField("trade_payed_amount")
    private Float tradePayedAmount;
    /**
     * 支付成功时间
     */
    @TableField("trade_payed_time")
    private Date tradePayedTime;
    /**
     * 状态 0未付款 1已付款 2生成支付订单
     */
    private Integer state;
    /**
     * 统一下单的预支付  id
     */
    @TableField("prepay_id")
    private String prepayId;
    /**
     * 预支付订单生成时间
     */
    @TableField("prepay_time")
    private Date prepayTime;
    /**
     * 签名
     */
    private String paySign;
    private String appid;
    private String nonceStr;
    private String timeStamp;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public String getTradeType() {
        return tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }

    public String getTradeDesc() {
        return tradeDesc;
    }

    public void setTradeDesc(String tradeDesc) {
        this.tradeDesc = tradeDesc;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getTradePaytype() {
        return tradePaytype;
    }

    public void setTradePaytype(String tradePaytype) {
        this.tradePaytype = tradePaytype;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Float getTradeAmount() {
        return tradeAmount;
    }

    public void setTradeAmount(Float tradeAmount) {
        this.tradeAmount = tradeAmount;
    }

    public String getTradePayedInfo() {
        return tradePayedInfo;
    }

    public void setTradePayedInfo(String tradePayedInfo) {
        this.tradePayedInfo = tradePayedInfo;
    }

    public Float getTradePayedAmount() {
        return tradePayedAmount;
    }

    public void setTradePayedAmount(Float tradePayedAmount) {
        this.tradePayedAmount = tradePayedAmount;
    }

    public Date getTradePayedTime() {
        return tradePayedTime;
    }

    public void setTradePayedTime(Date tradePayedTime) {
        this.tradePayedTime = tradePayedTime;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getPrepayId() {
        return prepayId;
    }

    public void setPrepayId(String prepayId) {
        this.prepayId = prepayId;
    }

    public Date getPrepayTime() {
        return prepayTime;
    }

    public void setPrepayTime(Date prepayTime) {
        this.prepayTime = prepayTime;
    }

    public String getPaySign() {
        return paySign;
    }

    public void setPaySign(String paySign) {
        this.paySign = paySign;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getNonceStr() {
        return nonceStr;
    }

    public void setNonceStr(String nonceStr) {
        this.nonceStr = nonceStr;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "OrderPaydetail{" +
        ", id=" + id +
        ", tradeNo=" + tradeNo +
        ", tradeType=" + tradeType +
        ", tradeDesc=" + tradeDesc +
        ", orderNo=" + orderNo +
        ", memberId=" + memberId +
        ", tradePaytype=" + tradePaytype +
        ", createTime=" + createTime +
        ", tradeAmount=" + tradeAmount +
        ", tradePayedInfo=" + tradePayedInfo +
        ", tradePayedAmount=" + tradePayedAmount +
        ", tradePayedTime=" + tradePayedTime +
        ", state=" + state +
        ", prepayId=" + prepayId +
        ", prepayTime=" + prepayTime +
        ", paySign=" + paySign +
        ", appid=" + appid +
        ", nonceStr=" + nonceStr +
        ", timeStamp=" + timeStamp +
        "}";
    }
}
