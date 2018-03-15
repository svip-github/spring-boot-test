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
 * 采购入库结算单表
 * </p>
 *
 * @author Zhouqiyong
 * @since 2018-03-08
 */
@TableName("s_in_stock_sheet")
public class InStockSheet extends Model<InStockSheet> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 总价格
     */
    @TableField("totle_price")
    private Float totlePrice;
    /**
     * 实际结算价格
     */
    @TableField("actual_price")
    private Float actualPrice;
    /**
     * 操作人id
     */
    @TableField("user_id")
    private Integer userId;
    /**
     * 备注
     */
    private String memo;
    /**
     *  1 采购报销  2供应商结算
     */
    private Integer flag;
    /**
     * 结算时间
     */
    @TableField("create_time")
    private Date createTime;
    /**
     * 最后修改时间
     */
    @TableField("update_time")
    private Date updateTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getTotlePrice() {
        return totlePrice;
    }

    public void setTotlePrice(Float totlePrice) {
        this.totlePrice = totlePrice;
    }

    public Float getActualPrice() {
        return actualPrice;
    }

    public void setActualPrice(Float actualPrice) {
        this.actualPrice = actualPrice;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "InStockSheet{" +
        ", id=" + id +
        ", totlePrice=" + totlePrice +
        ", actualPrice=" + actualPrice +
        ", userId=" + userId +
        ", memo=" + memo +
        ", flag=" + flag +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        "}";
    }
}
