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
 * 分拣记录表
 * </p>
 *
 * @author Zhouqiyong
 * @since 2018-03-08
 */
@TableName("s_sorter_record")
public class SorterRecord extends Model<SorterRecord> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    @TableField("order_sn")
    private String orderSn;
    /**
     * 订单单品id
     */
    @TableField("order_detail_id")
    private Long orderDetailId;
    /**
     * 具体商品id
     */
    @TableField("goods_spec_id")
    private Integer goodsSpecId;
    /**
     * 商品名称
     */
    @TableField("goods_name")
    private String goodsName;
    /**
     * 商品规格
     */
    @TableField("spec_info")
    private String specInfo;
    /**
     * 单位
     */
    private String unit;
    /**
     * 分拣数量
     */
    @TableField("sorter_num")
    private Float sorterNum;
    /**
     * 分拣时间
     */
    @TableField("sorter_time")
    private Date sorterTime;
    /**
     * 分拣人的id
     */
    @TableField("user_id")
    private Integer userId;
    /**
     * 分拣人姓名
     */
    @TableField("user_name")
    private String userName;
    /**
     * 分区id
     */
    @TableField("dc_id")
    private String dcId;


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

    public Long getOrderDetailId() {
        return orderDetailId;
    }

    public void setOrderDetailId(Long orderDetailId) {
        this.orderDetailId = orderDetailId;
    }

    public Integer getGoodsSpecId() {
        return goodsSpecId;
    }

    public void setGoodsSpecId(Integer goodsSpecId) {
        this.goodsSpecId = goodsSpecId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getSpecInfo() {
        return specInfo;
    }

    public void setSpecInfo(String specInfo) {
        this.specInfo = specInfo;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Float getSorterNum() {
        return sorterNum;
    }

    public void setSorterNum(Float sorterNum) {
        this.sorterNum = sorterNum;
    }

    public Date getSorterTime() {
        return sorterTime;
    }

    public void setSorterTime(Date sorterTime) {
        this.sorterTime = sorterTime;
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

    public String getDcId() {
        return dcId;
    }

    public void setDcId(String dcId) {
        this.dcId = dcId;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "SorterRecord{" +
        ", id=" + id +
        ", orderSn=" + orderSn +
        ", orderDetailId=" + orderDetailId +
        ", goodsSpecId=" + goodsSpecId +
        ", goodsName=" + goodsName +
        ", specInfo=" + specInfo +
        ", unit=" + unit +
        ", sorterNum=" + sorterNum +
        ", sorterTime=" + sorterTime +
        ", userId=" + userId +
        ", userName=" + userName +
        ", dcId=" + dcId +
        "}";
    }
}
