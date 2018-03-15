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
@TableName("c_bound_company")
public class BoundCompany extends Model<BoundCompany> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    @TableField("customer_id")
    private String customerId;
    /**
     * 操作人id
     */
    @TableField("user_id")
    private String userId;
    @TableField("old_company_id")
    private String oldCompanyId;
    @TableField("company_id")
    private String companyId;
    /**
     * 操作人
     */
    private String operator;
    /**
     * 操作时间
     */
    @TableField("operator_time")
    private Date operatorTime;
    /**
     * 0,未审核,1审核通过 2审核不通过
     */
    private Integer status;


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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getOldCompanyId() {
        return oldCompanyId;
    }

    public void setOldCompanyId(String oldCompanyId) {
        this.oldCompanyId = oldCompanyId;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "BoundCompany{" +
        ", id=" + id +
        ", customerId=" + customerId +
        ", userId=" + userId +
        ", oldCompanyId=" + oldCompanyId +
        ", companyId=" + companyId +
        ", operator=" + operator +
        ", operatorTime=" + operatorTime +
        ", status=" + status +
        "}";
    }
}
