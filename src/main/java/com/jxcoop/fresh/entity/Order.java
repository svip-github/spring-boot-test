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
 * 订单表
 * </p>
 *
 * @author Zhouqiyong
 * @since 2018-03-08
 */
@TableName("m_order")
public class Order extends Model<Order> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 订单编号 用时间生成随机编号
     */
    private String sn;
    /**
     * 下单时间
     */
    @TableField("create_time")
    private Date createTime;
    /**
     * 配送日期
     */
    @TableField("send_date")
    private Date sendDate;
    /**
     * 顾客ID
     */
    @TableField("customer_id")
    private String customerId;
    /**
     * 下单员名称，如果是食堂作业人员，直接插入单位名称，否则前缀都要加单位或者合伙人名称
     */
    @TableField("customer_name")
    private String customerName;
    /**
     * 下单人员手机号码，用来接收短信提醒
     */
    @TableField("customer_phone")
    private String customerPhone;
    /**
     * 订单类型(下单的主体) 1 企业作业人员 2 企业员工 3 合伙人 4 社区居民 
     */
    @TableField("customer_type")
    private Integer customerType;
    /**
     * 总价格
     */
    private Float price;
    /**
     * 实际支付价格:碰到余额已经支付，但是订单数量修改了。在客户签收后好多退少补
     */
    @TableField("pay_price")
    private Float payPrice;
    /**
     * 1已下单 2已取消 3审核成功 4审核不通过 5 未满单 6已满单   7分拣完毕, 8 装箱完毕  9配送中 10已送达 11补单中 12拒签  13已签收 14已结算
     */
    private Integer status;
    /**
     * 下单方式: 1 后台手工录入 2 微信下单 3电脑下单 4 安卓下单 5 苹果下单
     */
    private Integer type;
    /**
     * 如果是后台录入 则要记录 录入人员姓名
     */
    @TableField("user_name")
    private String userName;
    /**
     * 订单内的商品品种数量
     */
    private Integer num;
    /**
     * 支付方式 1 月结 2 余额支付  3 在线支付 4 积分兑换 5 免单
     */
    @TableField("pay_type")
    private Integer payType;
    /**
     * 在线支付通道 1 微信 2 支付宝 3 银联  4 添加更多
     */
    @TableField("pay_band")
    private Integer payBand;
    /**
     * 1 未付款  2 付款失败  3 付款成功 4退款中 5已退款 
     */
    @TableField("pay_status")
    private Integer payStatus;
    /**
     * 顾客所在的企业的企业短号
     */
    private String alias;
    /**
     * 顾客所在的企业或者合伙人ID
     */
    @TableField("company_id")
    private String companyId;
    /**
     * 创建订单的时候 存入企业的业务员ID，方便统计业务员的业绩
     */
    @TableField("sales_id")
    private Integer salesId;
    /**
     * 业务员姓名 冗余
     */
    @TableField("sales_name")
    private String salesName;
    /**
     * 货运费
     */
    private Float autoprice;
    /**
     * 订单的服务费
     */
    @TableField("service_money")
    private Float serviceMoney;
    /**
     * 逻辑删除(1：未删除，2：已删除)
     */
    private Integer del;
    /**
     * 配送地址
     */
    private String address;
    /**
     * 订单备注
     */
    private String memo;
    @TableField("balance_id")
    private Integer balanceId;
    /**
     * 是否评价(0:未评价；1已评价)
     */
    @TableField("is_evaluate")
    private Integer isEvaluate;
    /**
     * 结算单id
     */
    @TableField("sheet_id")
    private Integer sheetId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getSendDate() {
        return sendDate;
    }

    public void setSendDate(Date sendDate) {
        this.sendDate = sendDate;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public Integer getCustomerType() {
        return customerType;
    }

    public void setCustomerType(Integer customerType) {
        this.customerType = customerType;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Float getPayPrice() {
        return payPrice;
    }

    public void setPayPrice(Float payPrice) {
        this.payPrice = payPrice;
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public Integer getPayBand() {
        return payBand;
    }

    public void setPayBand(Integer payBand) {
        this.payBand = payBand;
    }

    public Integer getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Integer payStatus) {
        this.payStatus = payStatus;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public Integer getSalesId() {
        return salesId;
    }

    public void setSalesId(Integer salesId) {
        this.salesId = salesId;
    }

    public String getSalesName() {
        return salesName;
    }

    public void setSalesName(String salesName) {
        this.salesName = salesName;
    }

    public Float getAutoprice() {
        return autoprice;
    }

    public void setAutoprice(Float autoprice) {
        this.autoprice = autoprice;
    }

    public Float getServiceMoney() {
        return serviceMoney;
    }

    public void setServiceMoney(Float serviceMoney) {
        this.serviceMoney = serviceMoney;
    }

    public Integer getDel() {
        return del;
    }

    public void setDel(Integer del) {
        this.del = del;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Integer getBalanceId() {
        return balanceId;
    }

    public void setBalanceId(Integer balanceId) {
        this.balanceId = balanceId;
    }

    public Integer getIsEvaluate() {
        return isEvaluate;
    }

    public void setIsEvaluate(Integer isEvaluate) {
        this.isEvaluate = isEvaluate;
    }

    public Integer getSheetId() {
        return sheetId;
    }

    public void setSheetId(Integer sheetId) {
        this.sheetId = sheetId;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Order{" +
        ", id=" + id +
        ", sn=" + sn +
        ", createTime=" + createTime +
        ", sendDate=" + sendDate +
        ", customerId=" + customerId +
        ", customerName=" + customerName +
        ", customerPhone=" + customerPhone +
        ", customerType=" + customerType +
        ", price=" + price +
        ", payPrice=" + payPrice +
        ", status=" + status +
        ", type=" + type +
        ", userName=" + userName +
        ", num=" + num +
        ", payType=" + payType +
        ", payBand=" + payBand +
        ", payStatus=" + payStatus +
        ", alias=" + alias +
        ", companyId=" + companyId +
        ", salesId=" + salesId +
        ", salesName=" + salesName +
        ", autoprice=" + autoprice +
        ", serviceMoney=" + serviceMoney +
        ", del=" + del +
        ", address=" + address +
        ", memo=" + memo +
        ", balanceId=" + balanceId +
        ", isEvaluate=" + isEvaluate +
        ", sheetId=" + sheetId +
        "}";
    }
}
