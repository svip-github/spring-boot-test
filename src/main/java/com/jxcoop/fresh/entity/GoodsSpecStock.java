package com.jxcoop.fresh.entity;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 商品库存表
 * </p>
 *
 * @author Zhouqiyong
 * @since 2018-03-08
 */
@TableName("m_goods_spec_stock")
public class GoodsSpecStock extends Model<GoodsSpecStock> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 商品规格
     */
    @TableField("spec_id")
    private Integer specId;
    /**
     * 库存
     */
    private Float stock;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSpecId() {
        return specId;
    }

    public void setSpecId(Integer specId) {
        this.specId = specId;
    }

    public Float getStock() {
        return stock;
    }

    public void setStock(Float stock) {
        this.stock = stock;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "GoodsSpecStock{" +
        ", id=" + id +
        ", specId=" + specId +
        ", stock=" + stock +
        "}";
    }
}
