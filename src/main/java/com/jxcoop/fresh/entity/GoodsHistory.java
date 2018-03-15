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
 * 商品价格历史表 一年1个表， 只备份标准菜 
 * </p>
 *
 * @author Zhouqiyong
 * @since 2018-03-08
 */
@TableName("s_goods_history")
public class GoodsHistory extends Model<GoodsHistory> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 商品id
     */
    @TableField("goods_id")
    private Integer goodsId;
    /**
     * 具体商品id
     */
    @TableField("goods_spec_id")
    private Integer goodsSpecId;
    /**
     * 价格更新时间
     */
    @TableField("price_time")
    private Date priceTime;
    /**
     * 采购价格
     */
    @TableField("buy_price")
    private Float buyPrice;
    /**
     * 销售价格
     */
    @TableField("sale_price")
    private Float salePrice;
    @TableField("now_price")
    private Float nowPrice;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Date getPriceTime() {
        return priceTime;
    }

    public void setPriceTime(Date priceTime) {
        this.priceTime = priceTime;
    }

    public Float getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(Float buyPrice) {
        this.buyPrice = buyPrice;
    }

    public Float getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Float salePrice) {
        this.salePrice = salePrice;
    }

    public Float getNowPrice() {
        return nowPrice;
    }

    public void setNowPrice(Float nowPrice) {
        this.nowPrice = nowPrice;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "GoodsHistory{" +
        ", id=" + id +
        ", goodsId=" + goodsId +
        ", goodsSpecId=" + goodsSpecId +
        ", priceTime=" + priceTime +
        ", buyPrice=" + buyPrice +
        ", salePrice=" + salePrice +
        ", nowPrice=" + nowPrice +
        "}";
    }
}
