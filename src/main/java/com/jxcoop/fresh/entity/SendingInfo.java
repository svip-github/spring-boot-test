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
 * 配送记录绩效表
 * </p>
 *
 * @author Zhouqiyong
 * @since 2018-03-08
 */
@TableName("s_sending_info")
public class SendingInfo extends Model<SendingInfo> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 订单号
     */
    @TableField("order_sn")
    private String orderSn;
    /**
     * 总的订单金额
     */
    @TableField("order_price")
    private Float orderPrice;
    /**
     * 提成比率
     */
    private Float ratio;
    /**
     * 服务费，提成金额
     */
    @TableField("service_price")
    private Float servicePrice;
    /**
     * 配送员id
     */
    @TableField("user_id")
    private Integer userId;
    /**
     * 配送员名字
     */
    @TableField("user_name")
    private String userName;
    /**
     * 配送时间
     */
    @TableField("sending_time")
    private Date sendingTime;
    /**
     * 司机id
     */
    @TableField("driver_id")
    private Integer driverId;
    /**
     * 司机名字
     */
    @TableField("driver_name")
    private String driverName;
    /**
     * 是否已打印 1 没打印  2 已打印
     */
    @TableField("is_print")
    private Integer isPrint;
    /**
     * 状态 1,待结算，2，已结算，3，结算不通过
     */
    private Integer status;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public Float getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(Float orderPrice) {
        this.orderPrice = orderPrice;
    }

    public Float getRatio() {
        return ratio;
    }

    public void setRatio(Float ratio) {
        this.ratio = ratio;
    }

    public Float getServicePrice() {
        return servicePrice;
    }

    public void setServicePrice(Float servicePrice) {
        this.servicePrice = servicePrice;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getSendingTime() {
        return sendingTime;
    }

    public void setSendingTime(Date sendingTime) {
        this.sendingTime = sendingTime;
    }

    public Integer getDriverId() {
        return driverId;
    }

    public void setDriverId(Integer driverId) {
        this.driverId = driverId;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public Integer getIsPrint() {
        return isPrint;
    }

    public void setIsPrint(Integer isPrint) {
        this.isPrint = isPrint;
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
        return "SendingInfo{" +
        ", id=" + id +
        ", orderSn=" + orderSn +
        ", orderPrice=" + orderPrice +
        ", ratio=" + ratio +
        ", servicePrice=" + servicePrice +
        ", userId=" + userId +
        ", userName=" + userName +
        ", sendingTime=" + sendingTime +
        ", driverId=" + driverId +
        ", driverName=" + driverName +
        ", isPrint=" + isPrint +
        ", status=" + status +
        "}";
    }
}
