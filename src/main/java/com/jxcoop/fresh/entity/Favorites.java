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
 * 我的收藏表
 * </p>
 *
 * @author Zhouqiyong
 * @since 2018-03-08
 */
@TableName("c_favorites")
public class Favorites extends Model<Favorites> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 客户ID
     */
    @TableField("customer_id")
    private String customerId;
    /**
     * 菜品ID
     */
    @TableField("goods_id")
    private Integer goodsId;
    /**
     * 收藏时间
     */
    @TableField("create_time")
    private Date createTime;


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

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Favorites{" +
        ", id=" + id +
        ", customerId=" + customerId +
        ", goodsId=" + goodsId +
        ", createTime=" + createTime +
        "}";
    }
}
