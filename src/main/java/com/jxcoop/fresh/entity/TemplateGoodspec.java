package com.jxcoop.fresh.entity;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 价格模板对应的菜品数据
 * </p>
 *
 * @author Zhouqiyong
 * @since 2018-03-08
 */
@TableName("s_template_goodspec")
public class TemplateGoodspec extends Model<TemplateGoodspec> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 模板ID
     */
    @TableField("template_id")
    private Integer templateId;
    /**
     * 商品id
     */
    @TableField("goods_id")
    private Integer goodsId;
    /**
     * 菜品物理编号，用来做外键处理
     */
    @TableField("goods_spec_id")
    private Integer goodsSpecId;
    /**
     * 实际销售价
     */
    @TableField("sale_price")
    private Float salePrice;
    /**
     * 模板中菜品的名称,可以与标准菜菜名不一致
     */
    @TableField("goods_name")
    private String goodsName;
    /**
     * 菜品的采购单位 可以与标准菜不一致
     */
    private String unit;
    /**
     * 规格 可以与标准菜不一致
     */
    @TableField("spec_info")
    private String specInfo;
    /**
     * 相比标准销售价上下浮动比例 支持负数
     */
    private Float rate;
    /**
     * 1 是标书指定的菜 2不是指定的菜 ，能买所有菜的中标客户，导出EXCEL的时候，可以快速区分哪些菜是中标文件里的.
     */
    private Integer type;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Integer templateId) {
        this.templateId = templateId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getGoodsSpecId() {
        return goodsSpecId;
    }

    public void setGoodsSpecId(Integer goodsSpecId) {
        this.goodsSpecId = goodsSpecId;
    }

    public Float getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Float salePrice) {
        this.salePrice = salePrice;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getSpecInfo() {
        return specInfo;
    }

    public void setSpecInfo(String specInfo) {
        this.specInfo = specInfo;
    }

    public Float getRate() {
        return rate;
    }

    public void setRate(Float rate) {
        this.rate = rate;
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
        return "TemplateGoodspec{" +
        ", id=" + id +
        ", templateId=" + templateId +
        ", goodsId=" + goodsId +
        ", goodsSpecId=" + goodsSpecId +
        ", salePrice=" + salePrice +
        ", goodsName=" + goodsName +
        ", unit=" + unit +
        ", specInfo=" + specInfo +
        ", rate=" + rate +
        ", type=" + type +
        "}";
    }
}
