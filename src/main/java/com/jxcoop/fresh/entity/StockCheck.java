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
 * 加单审核记录表
 * </p>
 *
 * @author Zhouqiyong
 * @since 2018-03-08
 */
@TableName("s_stock_check")
public class StockCheck extends Model<StockCheck> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 采购入库结算表id
     */
    @TableField("s_in_stock")
    private Integer sInStock;
    /**
     * 审核人id
     */
    @TableField("operator_id")
    private String operatorId;
    /**
     * 审核人
     */
    @TableField("operator_name")
    private String operatorName;
    /**
     * 审核意见
     */
    private String note;
    /**
     * 审核时间
     */
    @TableField("operator_time")
    private Date operatorTime;
    /**
     * 审核状态，0 等待审核，1审核成功，2审核失败
     */
    private Integer statue;


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

    public String getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Date getOperatorTime() {
        return operatorTime;
    }

    public void setOperatorTime(Date operatorTime) {
        this.operatorTime = operatorTime;
    }

    public Integer getStatue() {
        return statue;
    }

    public void setStatue(Integer statue) {
        this.statue = statue;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "StockCheck{" +
        ", id=" + id +
        ", sInStock=" + sInStock +
        ", operatorId=" + operatorId +
        ", operatorName=" + operatorName +
        ", note=" + note +
        ", operatorTime=" + operatorTime +
        ", statue=" + statue +
        "}";
    }
}
