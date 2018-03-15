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
@TableName("t_user")
public class User extends Model<User> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    @TableField("login_name")
    private String loginName;
    private String sex;
    private Date birthday;
    private String address;
    private String pic;
    private String password;
    /**
     * 真实姓名
     */
    @TableField("real_name")
    private String realName;
    /**
     * 手机号码
     */
    @TableField("mobile_num")
    private String mobileNum;
    /**
     * 账号级别， 1：默认员工  2 部门经理  
     */
    private Integer level;
    /**
     * 部门名称id
     */
    @TableField("department_id")
    private Integer departmentId;
    @TableField("create_time")
    private Date createTime;
    /**
     * 逻辑删除(1：正常，2：已删除 3已停用)
     */
    private Integer del;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
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

    public String getMobileNum() {
        return mobileNum;
    }

    public void setMobileNum(String mobileNum) {
        this.mobileNum = mobileNum;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getDel() {
        return del;
    }

    public void setDel(Integer del) {
        this.del = del;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "User{" +
        ", id=" + id +
        ", loginName=" + loginName +
        ", sex=" + sex +
        ", birthday=" + birthday +
        ", address=" + address +
        ", pic=" + pic +
        ", password=" + password +
        ", realName=" + realName +
        ", mobileNum=" + mobileNum +
        ", level=" + level +
        ", departmentId=" + departmentId +
        ", createTime=" + createTime +
        ", del=" + del +
        "}";
    }
}
