package com.jxcoop.fresh.entity;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 供应商的账户表
 * </p>
 *
 * @author Zhouqiyong
 * @since 2018-03-08
 */
@TableName("p_provide_user")
public class ProvideUser extends Model<ProvideUser> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 供应商编号
     */
    @TableField("provide_id")
    private String provideId;
    /**
     * 登录名称
     */
    @TableField("login_name")
    private String loginName;
    /**
     * 登录密码
     */
    private String password;
    /**
     * 真实姓名
     */
    @TableField("real_name")
    private String realName;
    /**
     * 联系电话
     */
    private String phone;
    /**
     * 1正常 2 删除  3 停用
     */
    private Integer del;
    /**
     * 1 管理员  2 配货员  3送货员 4 财务对账 5 采购员 6 其他
     */
    private Integer role;
    /**
     * 冗余， 是自己的采购员还是 外面的供应商 1 自采  2 外购供应商
     */
    @TableField("type_id")
    private Integer typeId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProvideId() {
        return provideId;
    }

    public void setProvideId(String provideId) {
        this.provideId = provideId;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getDel() {
        return del;
    }

    public void setDel(Integer del) {
        this.del = del;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
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
        return "ProvideUser{" +
        ", id=" + id +
        ", provideId=" + provideId +
        ", loginName=" + loginName +
        ", password=" + password +
        ", realName=" + realName +
        ", phone=" + phone +
        ", del=" + del +
        ", role=" + role +
        ", typeId=" + typeId +
        "}";
    }
}
