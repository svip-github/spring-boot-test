package com.jxcoop.fresh.entity;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 某个客户的某个单品对应的供应商
 * </p>
 *
 * @author Zhouqiyong
 * @since 2018-03-08
 */
@TableName("t_company_goods_provide")
public class CompanyGoodsProvide extends Model<CompanyGoodsProvide> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 企业ID
     */
    @TableField("company_id")
    private String companyId;
    /**
     * 菜品ID
     */
    @TableField("goodspec_id")
    private String goodspecId;
    /**
     * 供应商ID
     */
    @TableField("provide_id")
    private String provideId;
    /**
     * 顾客单位别名，冗余 备用
     */
    private String alias;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getGoodspecId() {
        return goodspecId;
    }

    public void setGoodspecId(String goodspecId) {
        this.goodspecId = goodspecId;
    }

    public String getProvideId() {
        return provideId;
    }

    public void setProvideId(String provideId) {
        this.provideId = provideId;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "CompanyGoodsProvide{" +
        ", id=" + id +
        ", companyId=" + companyId +
        ", goodspecId=" + goodspecId +
        ", provideId=" + provideId +
        ", alias=" + alias +
        "}";
    }
}
