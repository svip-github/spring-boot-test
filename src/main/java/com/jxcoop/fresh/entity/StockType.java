package com.jxcoop.fresh.entity;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 出入库类型表
 * </p>
 *
 * @author Zhouqiyong
 * @since 2018-03-08
 */
@TableName("s_stock_type")
public class StockType extends Model<StockType> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 出入库类别 1 自动入库  2自动 出库  3 手工入库   4 手工出库
     */
    private Integer flag;
    /**
     * 出入库说明
     */
    @TableField("flag_name")
    private String flagName;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public String getFlagName() {
        return flagName;
    }

    public void setFlagName(String flagName) {
        this.flagName = flagName;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "StockType{" +
        ", id=" + id +
        ", flag=" + flag +
        ", flagName=" + flagName +
        "}";
    }
}
