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
 * 订单明细虚拟表
 * </p>
 *
 * @author Zhouqiyong
 * @since 2018-03-08
 */
@TableName("m_order_detail_fictitious")
public class OrderDetailFictitious extends Model<OrderDetailFictitious> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 订单编号
     */
    @TableField("order_sn")
    private String orderSn;
    @TableField("goods_spec_id")
    private Integer goodsSpecId;
    /**
     * 规格
     */
    @TableField("spec_info")
    private String specInfo;
    /**
     * 商品名称
     */
    @TableField("goods_name")
    private String goodsName;
    /**
     * 采购单位 桶 斤
     */
    private String unit;
    /**
     * 商品销售价
     */
    private Float price;
    /**
     * 单项总计
     */
    @TableField("totle_price")
    private Float totlePrice;
    /**
     * 订单数量
     */
    @TableField("order_num")
    private Float orderNum;
    /**
     * 备注
     */
    private String memo;
    /**
     * 生成订单后，把菜品插入明细表，为了统计，把订单的配送时间也冗余一个
     */
    @TableField("order_time")
    private Date orderTime;
    /**
     * 冗余客户id
     */
    @TableField("customer_id")
    private String customerId;
    /**
     * 企业ID
     */
    @TableField("company_id")
    private String companyId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public Integer getGoodsSpecId() {
        return goodsSpecId;
    }

    public void setGoodsSpecId(Integer goodsSpecId) {
        this.goodsSpecId = goodsSpecId;
    }

    public String getSpecInfo() {
        return specInfo;
    }

    public void setSpecInfo(String specInfo) {
        this.specInfo = specInfo;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Float getTotlePrice() {
        return totlePrice;
    }

    public void setTotlePrice(Float totlePrice) {
        this.totlePrice = totlePrice;
    }

    public Float getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Float orderNum) {
        this.orderNum = orderNum;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "OrderDetailFictitious{" +
        ", id=" + id +
        ", orderSn=" + orderSn +
        ", goodsSpecId=" + goodsSpecId +
        ", specInfo=" + specInfo +
        ", goodsName=" + goodsName +
        ", unit=" + unit +
        ", price=" + price +
        ", totlePrice=" + totlePrice +
        ", orderNum=" + orderNum +
        ", memo=" + memo +
        ", orderTime=" + orderTime +
        ", customerId=" + customerId +
        ", companyId=" + companyId +
        "}";
    }
}
