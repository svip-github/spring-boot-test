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
 * 订单明细 和订单表 多对一
 * </p>
 *
 * @author Zhouqiyong
 * @since 2018-03-08
 */
@TableName("m_order_detail")
public class OrderDetail extends Model<OrderDetail> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 订单编号
     */
    @TableField("order_sn")
    private String orderSn;
    /**
     * 商品id
     */
    @TableField("goods_id")
    private Integer goodsId;
    /**
     * 具体商品规格id
     */
    @TableField("goods_spec_id")
    private Integer goodsSpecId;
    @TableField("spec_info")
    private String specInfo;
    /**
     * 商品名称
     */
    @TableField("goods_name")
    private String goodsName;
    /**
     * 选中的商品规格全名称
     */
    @TableField("goods_spec_name")
    private String goodsSpecName;
    /**
     * 商品销售价
     */
    private Float price;
    /**
     * 采购单位 桶 斤
     */
    private String unit;
    /**
     * 菜品采购价
     */
    @TableField("buy_price")
    private Float buyPrice;
    /**
     * 标准售价
     */
    @TableField("stand_price")
    private Float standPrice;
    /**
     * 订单数量
     */
    @TableField("order_num")
    private Float orderNum;
    /**
     * 实际采购数量，可能会少于订单数量 采购单和 分拣单用这个值
     */
    @TableField("real_buy_num")
    private Float realBuyNum;
    /**
     * 称重入库设置本字段，即供应商实际配送数。同时分拣中心分拣后也是设置本字段
     */
    @TableField("provide_num")
    private Float provideNum;
    /**
     * 扫码入篓的时候，设置本配送数量，如果provide_num大于order_num 则设置为 provide_num,否则设置为 order_num
     */
    @TableField("send_num")
    private Float sendNum;
    /**
     *  客户实际签收数量，配送员回来后可以修改该值。默认和send_num一致，扫码入篓的时候可以一起设置send_num和customer_num
     */
    @TableField("customer_num")
    private Float customerNum;
    /**
     * 供应商ID 下单成功后，特定客户的特定商品有默认供应商的，直接设置供应商id
     */
    @TableField("provide_id")
    private String provideId;
    /**
     * 抢单时间（或后台指定供应商时间)
     */
    @TableField("appoint_time")
    private Date appointTime;
    /**
     * 1:待分拣 2:已打包;3:已装箱;4：单品已签收;5单品拒签 6:换货中;7:已换货 8:退货中，9:已退货
     */
    private Integer status;
    /**
     * 菜品详单类型：0、抢过来的单，1、推送过来的单 2、默认指定的单 
     */
    private Integer type;
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
    /**
     * 1已下单 2已取消 3审核成功 4审核不通过 5 未满单 6已满单   7分拣完毕, 8 装箱完毕  9配送中 10已送达 11补单中 12拒签  13已签收 14已结算
     */
    @TableField("order_status")
    private Integer orderStatus;
    /**
     * 1 无退货，2有退货
     */
    @TableField("is_back")
    private Integer isBack;
    @TableField("create_time")
    private Date createTime;
    /**
     * 商品规格图片
     */
    @TableField("goods_spec_img")
    private String goodsSpecImg;


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

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
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

    public String getGoodsSpecName() {
        return goodsSpecName;
    }

    public void setGoodsSpecName(String goodsSpecName) {
        this.goodsSpecName = goodsSpecName;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Float getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(Float buyPrice) {
        this.buyPrice = buyPrice;
    }

    public Float getStandPrice() {
        return standPrice;
    }

    public void setStandPrice(Float standPrice) {
        this.standPrice = standPrice;
    }

    public Float getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Float orderNum) {
        this.orderNum = orderNum;
    }

    public Float getRealBuyNum() {
        return realBuyNum;
    }

    public void setRealBuyNum(Float realBuyNum) {
        this.realBuyNum = realBuyNum;
    }

    public Float getProvideNum() {
        return provideNum;
    }

    public void setProvideNum(Float provideNum) {
        this.provideNum = provideNum;
    }

    public Float getSendNum() {
        return sendNum;
    }

    public void setSendNum(Float sendNum) {
        this.sendNum = sendNum;
    }

    public Float getCustomerNum() {
        return customerNum;
    }

    public void setCustomerNum(Float customerNum) {
        this.customerNum = customerNum;
    }

    public String getProvideId() {
        return provideId;
    }

    public void setProvideId(String provideId) {
        this.provideId = provideId;
    }

    public Date getAppointTime() {
        return appointTime;
    }

    public void setAppointTime(Date appointTime) {
        this.appointTime = appointTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
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

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Integer getIsBack() {
        return isBack;
    }

    public void setIsBack(Integer isBack) {
        this.isBack = isBack;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getGoodsSpecImg() {
        return goodsSpecImg;
    }

    public void setGoodsSpecImg(String goodsSpecImg) {
        this.goodsSpecImg = goodsSpecImg;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "OrderDetail{" +
        ", id=" + id +
        ", orderSn=" + orderSn +
        ", goodsId=" + goodsId +
        ", goodsSpecId=" + goodsSpecId +
        ", specInfo=" + specInfo +
        ", goodsName=" + goodsName +
        ", goodsSpecName=" + goodsSpecName +
        ", price=" + price +
        ", unit=" + unit +
        ", buyPrice=" + buyPrice +
        ", standPrice=" + standPrice +
        ", orderNum=" + orderNum +
        ", realBuyNum=" + realBuyNum +
        ", provideNum=" + provideNum +
        ", sendNum=" + sendNum +
        ", customerNum=" + customerNum +
        ", provideId=" + provideId +
        ", appointTime=" + appointTime +
        ", status=" + status +
        ", type=" + type +
        ", memo=" + memo +
        ", orderTime=" + orderTime +
        ", customerId=" + customerId +
        ", companyId=" + companyId +
        ", orderStatus=" + orderStatus +
        ", isBack=" + isBack +
        ", createTime=" + createTime +
        ", goodsSpecImg=" + goodsSpecImg +
        "}";
    }
}
