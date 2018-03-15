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
 * 给企业的充值明细
 * </p>
 *
 * @author Zhouqiyong
 * @since 2018-03-08
 */
@TableName("m_company_recharge")
public class CompanyRecharge extends Model<CompanyRecharge> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 操作人id
     */
    private String operator;
    /**
     * 操作时间
     */
    @TableField("operator_time")
    private Date operatorTime;
    /**
     * 交易前金额
     */
    @TableField("pre_money")
    private Float preMoney;
    /**
     * 操作金额
     */
    @TableField("operator_money")
    private Float operatorMoney;
    /**
     * 交易后后金额
     */
    @TableField("now_money")
    private Float nowMoney;
    /**
     * 企业id
     */
    @TableField("company_id")
    private String companyId;
    private String note;
    /**
     * 给企业交易的工作是由运营中心操作员来处理
     */
    @TableField("operator_name")
    private String operatorName;
    /**
     * 1.企业在线充值 2后台充值
     */
    private Integer type;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Float getPreMoney() {
        return preMoney;
    }

    public void setPreMoney(Float preMoney) {
        this.preMoney = preMoney;
    }

    public Float getOperatorMoney() {
        return operatorMoney;
    }

    public void setOperatorMoney(Float operatorMoney) {
        this.operatorMoney = operatorMoney;
    }

    public Float getNowMoney() {
        return nowMoney;
    }

    public void setNowMoney(Float nowMoney) {
        this.nowMoney = nowMoney;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "CompanyRecharge{" +
        ", id=" + id +
        ", operator=" + operator +
        ", operatorTime=" + operatorTime +
        ", preMoney=" + preMoney +
        ", operatorMoney=" + operatorMoney +
        ", nowMoney=" + nowMoney +
        ", companyId=" + companyId +
        ", note=" + note +
        ", operatorName=" + operatorName +
        ", type=" + type +
        "}";
    }
}
