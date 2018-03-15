package com.jxcoop.fresh.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 客户表_社区居民
 * </p>
 *
 * @author Zhouqiyong
 * @since 2018-03-08
 */
@TableName("c_customer_c")
public class CustomerC extends Model<CustomerC> {

    private static final long serialVersionUID = 1L;

    /**
     * 前面2位固定+uui18
     */
    private String id;
    /**
     * 登录名
     */
    @TableField("login_name")
    private String loginName;
    private String password;
    /**
     * 真实姓名
     */
    @TableField("real_name")
    private String realName;
    /**
     * 企业id
     */
    @TableField("company_id")
    private String companyId;
    /**
     * 字段 0待审核 1正常  2审核失败 3 停用
     */
    private Integer status;
    /**
     * 创建时间 或者审核时间
     */
    @TableField("create_time")
    private Date createTime;
    /**
     * 审核人员或者 录入人员
     */
    @TableField("o_user")
    private String oUser;
    /**
     * 集团用户的权限，默认0为集团管理员，1为采购员，2、收货员，3、管理层、4、财务
     */
    private Integer role;
    /**
     * 联系电话
     */
    private String phone;
    /**
     * 金额修改时间
     */
    @TableField("money_time")
    private Date moneyTime;
    /**
     * 每次修改金额的时候 把 余额+系统时间 生成MD5串
     */
    @TableField("md5_str")
    private String md5Str;
    /**
     * 账户余额
     */
    private Float money;
    /**
     * 佣金
     */
    private Float commision;
    /**
     * 积分
     */
    @TableField("bonus_point")
    private Float bonusPoint;
    /**
     * 微信的openId 用来做绑定 用的
     */
    @TableField("open_id")
    private String openId;
    /**
     * 1 企业作业人员 2 企业员工 3 合伙人 4 社区居民
     */
    private Integer flag;
    /**
     * 逻辑删除(1：正常，2：已删除 3已经停用)
     */
    private Integer del;
    /**
     * 推荐人
     */
    @TableField("parent_id")
    private String parentId;
    /**
     * 上一次余额变动数量，用来方便从交易明细中搜索操作历史记录
     */
    private Float howmuch;
    /**
     * 部门名称
     */
    private String department;
    /**
     * 所属合伙人ID
     */
    @TableField("proxy_id")
    private String proxyId;
    @TableField("head_img")
    private String headImg;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
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

    public String getoUser() {
        return oUser;
    }

    public void setoUser(String oUser) {
        this.oUser = oUser;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getMoneyTime() {
        return moneyTime;
    }

    public void setMoneyTime(Date moneyTime) {
        this.moneyTime = moneyTime;
    }

    public String getMd5Str() {
        return md5Str;
    }

    public void setMd5Str(String md5Str) {
        this.md5Str = md5Str;
    }

    public Float getMoney() {
        return money;
    }

    public void setMoney(Float money) {
        this.money = money;
    }

    public Float getCommision() {
        return commision;
    }

    public void setCommision(Float commision) {
        this.commision = commision;
    }

    public Float getBonusPoint() {
        return bonusPoint;
    }

    public void setBonusPoint(Float bonusPoint) {
        this.bonusPoint = bonusPoint;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Integer getDel() {
        return del;
    }

    public void setDel(Integer del) {
        this.del = del;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public Float getHowmuch() {
        return howmuch;
    }

    public void setHowmuch(Float howmuch) {
        this.howmuch = howmuch;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getProxyId() {
        return proxyId;
    }

    public void setProxyId(String proxyId) {
        this.proxyId = proxyId;
    }

    public String getHeadImg() {
        return headImg;
    }

    public void setHeadImg(String headImg) {
        this.headImg = headImg;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "CustomerC{" +
        ", id=" + id +
        ", loginName=" + loginName +
        ", password=" + password +
        ", realName=" + realName +
        ", companyId=" + companyId +
        ", status=" + status +
        ", createTime=" + createTime +
        ", oUser=" + oUser +
        ", role=" + role +
        ", phone=" + phone +
        ", moneyTime=" + moneyTime +
        ", md5Str=" + md5Str +
        ", money=" + money +
        ", commision=" + commision +
        ", bonusPoint=" + bonusPoint +
        ", openId=" + openId +
        ", flag=" + flag +
        ", del=" + del +
        ", parentId=" + parentId +
        ", howmuch=" + howmuch +
        ", department=" + department +
        ", proxyId=" + proxyId +
        ", headImg=" + headImg +
        "}";
    }
}
