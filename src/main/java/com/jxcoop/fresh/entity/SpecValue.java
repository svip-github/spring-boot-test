package com.jxcoop.fresh.entity;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 商品规格值表
 * </p>
 *
 * @author Zhouqiyong
 * @since 2018-03-08
 */
@TableName("m_spec_value")
public class SpecValue extends Model<SpecValue> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 所属规格id
     */
    @TableField("sp_id")
    private Integer spId;
    /**
     * 规格值名称
     */
    @TableField("sp_value_name")
    private String spValueName;
    /**
     * 规格图片
     */
    @TableField("sp_value_image")
    private String spValueImage;
    /**
     * 排序
     */
    @TableField("sp_value_sort")
    private Integer spValueSort;
    /**
     * 逻辑删除(1：未删除，2：已删除)
     */
    private Integer del;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSpId() {
        return spId;
    }

    public void setSpId(Integer spId) {
        this.spId = spId;
    }

    public String getSpValueName() {
        return spValueName;
    }

    public void setSpValueName(String spValueName) {
        this.spValueName = spValueName;
    }

    public String getSpValueImage() {
        return spValueImage;
    }

    public void setSpValueImage(String spValueImage) {
        this.spValueImage = spValueImage;
    }

    public Integer getSpValueSort() {
        return spValueSort;
    }

    public void setSpValueSort(Integer spValueSort) {
        this.spValueSort = spValueSort;
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
        return "SpecValue{" +
        ", id=" + id +
        ", spId=" + spId +
        ", spValueName=" + spValueName +
        ", spValueImage=" + spValueImage +
        ", spValueSort=" + spValueSort +
        ", del=" + del +
        "}";
    }
}
