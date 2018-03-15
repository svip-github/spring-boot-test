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
 * 合伙人申请审核表
 * </p>
 *
 * @author Zhouqiyong
 * @since 2018-03-08
 */
@TableName("b_partner_apply")
public class PartnerApply extends Model<PartnerApply> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 微信openid
     */
    @TableField("open_id")
    private String openId;
    /**
     * 联系人
     */
    private String name;
    /**
     * 联系电话
     */
    private String phone;
    /**
     * 地址
     */
    private String address;
    /**
     * 处理状态 1:待处理 2已处理
     */
    private Integer status;
    /**
     * 申请时间
     */
    @TableField("create_time")
    private Date createTime;
    /**
     * 最后处理时间
     */
    @TableField("update_time")
    private Date updateTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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
        return "PartnerApply{" +
        ", id=" + id +
        ", openId=" + openId +
        ", name=" + name +
        ", phone=" + phone +
        ", address=" + address +
        ", status=" + status +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        "}";
    }
}
