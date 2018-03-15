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
 * 价格模板
 * </p>
 *
 * @author Zhouqiyong
 * @since 2018-03-08
 */
@TableName("s_template")
public class Template extends Model<Template> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 模板名称
     */
    private String name;
    /**
     * 编辑人员姓名
     */
    @TableField("user_name")
    private String userName;
    /**
     * 修改时间-每次导入价格需要修改本事件
     */
    @TableField("update_time")
    private Date updateTime;
    /**
     * 模板备注信息
     */
    private String memo;
    /**
     * 标准菜品价格修改后是否修改模板内的菜品价格：0：不更新，1：更新
     */
    private Integer flag;
    /**
     * 1正常  2已删除 3停用
     */
    private Integer del;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
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

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Template{" +
        ", id=" + id +
        ", name=" + name +
        ", userName=" + userName +
        ", updateTime=" + updateTime +
        ", memo=" + memo +
        ", flag=" + flag +
        ", del=" + del +
        "}";
    }
}
