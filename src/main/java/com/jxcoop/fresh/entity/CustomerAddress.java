package com.jxcoop.fresh.entity;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 客户提货地址表，一个人的提货地址可以有一个企业和多个合伙人地址随便选
 * </p>
 *
 * @author Zhouqiyong
 * @since 2018-03-08
 */
@TableName("c_customer_address")
public class CustomerAddress extends Model<CustomerAddress> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 用户id
     */
    @TableField("customer_id")
    private String customerId;
    /**
     * 1 默认地址 2 非默认地址
     */
    @TableField("default_address")
    private Integer defaultAddress;
    /**
     * 企业id
     */
    @TableField("company_id")
    private String companyId;
    /**
     * 地址
     */
    private String address;
    /**
     * 收货人
     */
    private String name;
    /**
     * 收货人手机号
     */
    private String phone;


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

    public Integer getDefaultAddress() {
        return defaultAddress;
    }

    public void setDefaultAddress(Integer defaultAddress) {
        this.defaultAddress = defaultAddress;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "CustomerAddress{" +
        ", id=" + id +
        ", customerId=" + customerId +
        ", defaultAddress=" + defaultAddress +
        ", companyId=" + companyId +
        ", address=" + address +
        ", name=" + name +
        ", phone=" + phone +
        "}";
    }
}
