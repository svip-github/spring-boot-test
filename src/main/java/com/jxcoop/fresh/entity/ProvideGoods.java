package com.jxcoop.fresh.entity;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 供应商能供应的菜,多对多
 * </p>
 *
 * @author Zhouqiyong
 * @since 2018-03-08
 */
@TableName("p_provide_goods")
public class ProvideGoods extends Model<ProvideGoods> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    @TableField("provide_id")
    private String provideId;
    /**
     * 具体的商品
     */
    @TableField("goods_spec_id")
    private Integer goodsSpecId;


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

    public Integer getGoodsSpecId() {
        return goodsSpecId;
    }

    public void setGoodsSpecId(Integer goodsSpecId) {
        this.goodsSpecId = goodsSpecId;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "ProvideGoods{" +
        ", id=" + id +
        ", provideId=" + provideId +
        ", goodsSpecId=" + goodsSpecId +
        "}";
    }
}
