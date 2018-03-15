package com.jxcoop.fresh.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 供应商
 * </p>
 *
 * @author Zhouqiyong
 * @since 2018-03-08
 */
@TableName("p_provide")
public class Provide extends Model<Provide> {

    private static final long serialVersionUID = 1L;

    /**
     * 供应商编号 全局唯一 前面2位固定
     */
    private String id;
    /**
     * 供应商名称
     */
    private String name;
    /**
     * 联系人
     */
    private String contacts;
    /**
     * 联系电话
     */
    private String phone;
    /**
     * 供应商地址
     */
    private String address;
    /**
     * 供应商级别 1 战略合作伙伴 2紧密合作伙伴 3商业合作伙伴
     */
    private Integer level;
    /**
     * 1 正常  2 删除 3 停用 4审核失败 5 等待审核 
     */
    private Integer del;
    /**
     * 供应商类型，是外采还是 自采  1 自采供应商 2 外购供应商
     */
    @TableField("type_id")
    private Integer typeId;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
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

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getDel() {
        return del;
    }

    public void setDel(Integer del) {
        this.del = del;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Provide{" +
        ", id=" + id +
        ", name=" + name +
        ", contacts=" + contacts +
        ", phone=" + phone +
        ", address=" + address +
        ", level=" + level +
        ", del=" + del +
        ", typeId=" + typeId +
        "}";
    }
}
