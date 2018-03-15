package com.jxcoop.fresh.entity;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 商品规格表
 * </p>
 *
 * @author Zhouqiyong
 * @since 2018-03-08
 */
@TableName("m_spec")
public class Spec extends Model<Spec> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 规格名称
     */
    @TableField("sp_name")
    private String spName;
    /**
     * 规格值列
     */
    @TableField("sp_value")
    private String spValue;
    /**
     * 排序
     */
    @TableField("sp_sort")
    private Integer spSort;
    /**
     * 逻辑删除(1：未删除，2：已删除)
     */
    private Integer del;
    /**
     * 特殊规格 0:普通;1特殊规格
     */
    private Integer flag;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSpName() {
        return spName;
    }

    public void setSpName(String spName) {
        this.spName = spName;
    }

    public String getSpValue() {
        return spValue;
    }

    public void setSpValue(String spValue) {
        this.spValue = spValue;
    }

    public Integer getSpSort() {
        return spSort;
    }

    public void setSpSort(Integer spSort) {
        this.spSort = spSort;
    }

    public Integer getDel() {
        return del;
    }

    public void setDel(Integer del) {
        this.del = del;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Spec{" +
        ", id=" + id +
        ", spName=" + spName +
        ", spValue=" + spValue +
        ", spSort=" + spSort +
        ", del=" + del +
        ", flag=" + flag +
        "}";
    }
}
