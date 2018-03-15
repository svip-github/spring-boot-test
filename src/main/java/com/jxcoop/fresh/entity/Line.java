package com.jxcoop.fresh.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 配送线路信息表
 * </p>
 *
 * @author Zhouqiyong
 * @since 2018-03-08
 */
@TableName("s_line")
public class Line extends Model<Line> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 线路名称
     */
    private String name;
    /**
     * 配送员ID
     */
    private Integer sender;
    /**
     * 司机ID
     */
    private Integer driver;
    /**
     * 车牌号
     */
    private String car;
    private Date createTime;
    /**
     * 1 正常  2 删除 3 停用   
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

    public Integer getSender() {
        return sender;
    }

    public void setSender(Integer sender) {
        this.sender = sender;
    }

    public Integer getDriver() {
        return driver;
    }

    public void setDriver(Integer driver) {
        this.driver = driver;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
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
        return "Line{" +
        ", id=" + id +
        ", name=" + name +
        ", sender=" + sender +
        ", driver=" + driver +
        ", car=" + car +
        ", createTime=" + createTime +
        ", del=" + del +
        "}";
    }
}
