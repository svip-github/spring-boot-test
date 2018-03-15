package com.jxcoop.fresh.entity;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 系统参数配置表
 * </p>
 *
 * @author Zhouqiyong
 * @since 2018-03-08
 */
@TableName("s_config")
public class Config extends Model<Config> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 参数名称
     */
    private String keyname;
    /**
     * 参数值
     */
    private String value;
    /**
     * 说明
     */
    private String memo;
    /**
     * 是否允许客户直接修改 1 开发人员配置的参数，  2平台运营参数  3 营销工具参数
     */
    private Integer type;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKeyname() {
        return keyname;
    }

    public void setKeyname(String keyname) {
        this.keyname = keyname;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
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
        return "Config{" +
        ", id=" + id +
        ", keyname=" + keyname +
        ", value=" + value +
        ", memo=" + memo +
        ", type=" + type +
        "}";
    }
}
