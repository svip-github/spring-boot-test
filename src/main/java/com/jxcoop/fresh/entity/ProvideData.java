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
 * 供应商入库单表
 * </p>
 *
 * @author Zhouqiyong
 * @since 2018-03-08
 */
@TableName("p_provide_data")
public class ProvideData extends Model<ProvideData> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 供应商（采购员）ID
     */
    @TableField("provide_id")
    private String provideId;
    /**
     * 采购日期 yyyy-mm-dd
     */
    @TableField("buy_time")
    private Date buyTime;
    /**
     * 实际采购总价格
     */
    @TableField("total_price")
    private Float totalPrice;
    /**
     * 分拣中心di
     */
    @TableField("dc_id")
    private String dcId;
    /**
     * 1 审核中  2 核对通过   3 核对不通过 4 已报销
     */
    private Integer status;
    /**
     * 备注信息
     */
    private String memo;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProvideId() {
        return provideId;
    }

    public void setProvideId(String provideId) {
        this.provideId = provideId;
    }

    public Date getBuyTime() {
        return buyTime;
    }

    public void setBuyTime(Date buyTime) {
        this.buyTime = buyTime;
    }

    public Float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getDcId() {
        return dcId;
    }

    public void setDcId(String dcId) {
        this.dcId = dcId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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
        return "ProvideData{" +
        ", id=" + id +
        ", provideId=" + provideId +
        ", buyTime=" + buyTime +
        ", totalPrice=" + totalPrice +
        ", dcId=" + dcId +
        ", status=" + status +
        ", memo=" + memo +
        "}";
    }
}
