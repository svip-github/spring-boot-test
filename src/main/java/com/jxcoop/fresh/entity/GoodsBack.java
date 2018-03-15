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
@TableName("s_goods_back")
public class GoodsBack extends Model<GoodsBack> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 采购入库结算表id
     */
    @TableField("s_in_stock")
    private Integer sInStock;
    @TableField("detail_id")
    private Integer detailId;
    @TableField("operator_id")
    private Integer operatorId;
    private String operator;
    @TableField("operator_time")
    private Date operatorTime;
    /**
     * 1,审核中，2审核成功，3审核失败，4已退款
     */
    private Integer statues;
    private Integer num;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getsInStock() {
        return sInStock;
    }

    public void setsInStock(Integer sInStock) {
        this.sInStock = sInStock;
    }

    public Integer getDetailId() {
        return detailId;
    }

    public void setDetailId(Integer detailId) {
        this.detailId = detailId;
    }

    public Integer getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Integer operatorId) {
        this.operatorId = operatorId;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Date getOperatorTime() {
        return operatorTime;
    }

    public void setOperatorTime(Date operatorTime) {
        this.operatorTime = operatorTime;
    }

    public Integer getStatues() {
        return statues;
    }

    public void setStatues(Integer statues) {
        this.statues = statues;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "GoodsBack{" +
        ", id=" + id +
        ", sInStock=" + sInStock +
        ", detailId=" + detailId +
        ", operatorId=" + operatorId +
        ", operator=" + operator +
        ", operatorTime=" + operatorTime +
        ", statues=" + statues +
        ", num=" + num +
        "}";
    }
}
