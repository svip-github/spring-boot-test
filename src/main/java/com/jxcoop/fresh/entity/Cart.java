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
 * 购物车
 * </p>
 *
 * @author Zhouqiyong
 * @since 2018-03-08
 */
@TableName("c_cart")
public class Cart extends Model<Cart> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 顾客ID
     */
    @TableField("customer_id")
    private String customerId;
    /**
     * 商品ID
     */
    @TableField("goods_spec_id")
    private Integer goodsSpecId;
    /**
     * 放入时间
     */
    private Date createTime;
    /**
     * 商品数量
     */
    private Float num;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public Integer getGoodsSpecId() {
        return goodsSpecId;
    }

    public void setGoodsSpecId(Integer goodsSpecId) {
        this.goodsSpecId = goodsSpecId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Float getNum() {
        return num;
    }

    public void setNum(Float num) {
        this.num = num;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Cart{" +
        ", id=" + id +
        ", customerId=" + customerId +
        ", goodsSpecId=" + goodsSpecId +
        ", createTime=" + createTime +
        ", num=" + num +
        "}";
    }
}
