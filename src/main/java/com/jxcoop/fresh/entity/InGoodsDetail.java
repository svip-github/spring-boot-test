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
 * 
 * </p>
 *
 * @author Zhouqiyong
 * @since 2018-03-08
 */
@TableName("c_in_goods_detail")
public class InGoodsDetail extends Model<InGoodsDetail> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 用户id
     */
    @TableField("user_id")
    private String userId;
    /**
     * 商品id
     */
    @TableField("goods_id")
    private Integer goodsId;
    /**
     * 点击时间
     */
    private Date time;
    /**
     * 分享人id
     */
    @TableField("proxy_id")
    private String proxyId;
    @TableField("share_id")
    private String shareId;
    private String goodsName;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getProxyId() {
        return proxyId;
    }

    public void setProxyId(String proxyId) {
        this.proxyId = proxyId;
    }

    public String getShareId() {
        return shareId;
    }

    public void setShareId(String shareId) {
        this.shareId = shareId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "InGoodsDetail{" +
        ", id=" + id +
        ", userId=" + userId +
        ", goodsId=" + goodsId +
        ", time=" + time +
        ", proxyId=" + proxyId +
        ", shareId=" + shareId +
        ", goodsName=" + goodsName +
        "}";
    }
}
