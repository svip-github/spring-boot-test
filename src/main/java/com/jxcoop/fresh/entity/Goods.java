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
 * 商品表
 * </p>
 *
 * @author Zhouqiyong
 * @since 2018-03-08
 */
@TableName("m_goods")
public class Goods extends Model<Goods> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 菜品名
     */
    private String name;
    /**
     * 菜品名称对应的拼音首字母
     */
    private String spell;
    /**
     * 所属类别
     */
    @TableField("class_id")
    private Integer classId;
    /**
     * 商品图片路径，只放1张
     */
    @TableField("img_path")
    private String imgPath;
    /**
     * 菜品详情
     */
    private String detail;
    /**
     * 上架时间
     */
    @TableField("up_time")
    private Date upTime;
    /**
     * 采购单位 斤 提 筒 防止没有多规格的商品无法输入采购单位
     */
    private String standard;
    /**
     * 品牌ID
     */
    @TableField("brand_id")
    private Integer brandId;
    /**
     * 品牌名称，修改brand后，需要批量修改本字段
     */
    @TableField("brand_name")
    private String brandName;
    /**
     * 逻辑删除(1：上架中，2：已删除 3 下架)
     */
    private Integer del;
    /**
     * 默认，显示的规格
     */
    @TableField("spec_id")
    private Integer specId;
    /**
     * 商品价格区间
     */
    @TableField("range_price")
    private String rangePrice;
    /**
     * 活动类型
     */
    @TableField("activity_type")
    private Integer activityType;
    private Integer sort;


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

    public String getSpell() {
        return spell;
    }

    public void setSpell(String spell) {
        this.spell = spell;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Date getUpTime() {
        return upTime;
    }

    public void setUpTime(Date upTime) {
        this.upTime = upTime;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public Integer getDel() {
        return del;
    }

    public void setDel(Integer del) {
        this.del = del;
    }

    public Integer getSpecId() {
        return specId;
    }

    public void setSpecId(Integer specId) {
        this.specId = specId;
    }

    public String getRangePrice() {
        return rangePrice;
    }

    public void setRangePrice(String rangePrice) {
        this.rangePrice = rangePrice;
    }

    public Integer getActivityType() {
        return activityType;
    }

    public void setActivityType(Integer activityType) {
        this.activityType = activityType;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Goods{" +
        ", id=" + id +
        ", name=" + name +
        ", spell=" + spell +
        ", classId=" + classId +
        ", imgPath=" + imgPath +
        ", detail=" + detail +
        ", upTime=" + upTime +
        ", standard=" + standard +
        ", brandId=" + brandId +
        ", brandName=" + brandName +
        ", del=" + del +
        ", specId=" + specId +
        ", rangePrice=" + rangePrice +
        ", activityType=" + activityType +
        ", sort=" + sort +
        "}";
    }
}
