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
 * 实际商品表
 * </p>
 *
 * @author Zhouqiyong
 * @since 2018-03-08
 */
@TableName("m_goods_spec")
public class GoodsSpec extends Model<GoodsSpec> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 商品id
     */
    @TableField("goods_id")
    private Integer goodsId;
    /**
     * 商品名称
     */
    @TableField("goods_name")
    private String goodsName;
    /**
     * 商品规格组合 白色_4.5寸
     */
    @TableField("spec_base")
    private String specBase;
    /**
     * 可修改的 商品规格组合名称 便于识别
     */
    @TableField("spec_info")
    private String specInfo;
    /**
     * 规格名称
     */
    @TableField("spec_name")
    private String specName;
    /**
     * 商品规格序列化
     */
    @TableField("spec_goods_spec")
    private String specGoodsSpec;
    /**
     * 这个规格的商品的图片
     */
    @TableField("spec_goods_img")
    private String specGoodsImg;
    /**
     * 商品名称对应的拼音首字母
     */
    @TableField("goods_spell")
    private String goodsSpell;
    /**
     * 最低价
     */
    @TableField("low_price")
    private Float lowPrice;
    /**
     * 最高价
     */
    @TableField("high_price")
    private Float highPrice;
    /**
     * 当前销售价
     */
    private Float price;
    /**
     * 上次销售价
     */
    @TableField("pre_price")
    private Float prePrice;
    /**
     * 当前采购价
     */
    @TableField("buy_price")
    private Float buyPrice;
    /**
     * 上次采购价
     */
    @TableField("pre_buy_price")
    private Float preBuyPrice;
    /**
     * 审价员 更新价格的时间
     */
    @TableField("price_time")
    private Date priceTime;
    /**
     * 毛利单位 %
     */
    private Float profit;
    /**
     * 损耗单位 %
     */
    private Float loss;
    /**
     * 税点单位 %
     */
    private Float tax;
    /**
     * 是否是标准菜品  1 是   2 否（单个客户的特定中标菜,不对外售卖）
     */
    private Integer sharePrice;
    /**
     * 采购单位 斤 桶
     */
    private String unit;
    /**
     * 逻辑删除(1：上架中，2：已删除 3 已下架)
     */
    private Integer del;
    @TableField("class_id")
    private Integer classId;
    /**
     * 搜索关键字
     */
    private String keyvalue;
    /**
     * 冗余字段 活动类型
     */
    @TableField("activity_type")
    private Integer activityType;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getSpecBase() {
        return specBase;
    }

    public void setSpecBase(String specBase) {
        this.specBase = specBase;
    }

    public String getSpecInfo() {
        return specInfo;
    }

    public void setSpecInfo(String specInfo) {
        this.specInfo = specInfo;
    }

    public String getSpecName() {
        return specName;
    }

    public void setSpecName(String specName) {
        this.specName = specName;
    }

    public String getSpecGoodsSpec() {
        return specGoodsSpec;
    }

    public void setSpecGoodsSpec(String specGoodsSpec) {
        this.specGoodsSpec = specGoodsSpec;
    }

    public String getSpecGoodsImg() {
        return specGoodsImg;
    }

    public void setSpecGoodsImg(String specGoodsImg) {
        this.specGoodsImg = specGoodsImg;
    }

    public String getGoodsSpell() {
        return goodsSpell;
    }

    public void setGoodsSpell(String goodsSpell) {
        this.goodsSpell = goodsSpell;
    }

    public Float getLowPrice() {
        return lowPrice;
    }

    public void setLowPrice(Float lowPrice) {
        this.lowPrice = lowPrice;
    }

    public Float getHighPrice() {
        return highPrice;
    }

    public void setHighPrice(Float highPrice) {
        this.highPrice = highPrice;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Float getPrePrice() {
        return prePrice;
    }

    public void setPrePrice(Float prePrice) {
        this.prePrice = prePrice;
    }

    public Float getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(Float buyPrice) {
        this.buyPrice = buyPrice;
    }

    public Float getPreBuyPrice() {
        return preBuyPrice;
    }

    public void setPreBuyPrice(Float preBuyPrice) {
        this.preBuyPrice = preBuyPrice;
    }

    public Date getPriceTime() {
        return priceTime;
    }

    public void setPriceTime(Date priceTime) {
        this.priceTime = priceTime;
    }

    public Float getProfit() {
        return profit;
    }

    public void setProfit(Float profit) {
        this.profit = profit;
    }

    public Float getLoss() {
        return loss;
    }

    public void setLoss(Float loss) {
        this.loss = loss;
    }

    public Float getTax() {
        return tax;
    }

    public void setTax(Float tax) {
        this.tax = tax;
    }

    public Integer getSharePrice() {
        return sharePrice;
    }

    public void setSharePrice(Integer sharePrice) {
        this.sharePrice = sharePrice;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Integer getDel() {
        return del;
    }

    public void setDel(Integer del) {
        this.del = del;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getKeyvalue() {
        return keyvalue;
    }

    public void setKeyvalue(String keyvalue) {
        this.keyvalue = keyvalue;
    }

    public Integer getActivityType() {
        return activityType;
    }

    public void setActivityType(Integer activityType) {
        this.activityType = activityType;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "GoodsSpec{" +
        ", id=" + id +
        ", goodsId=" + goodsId +
        ", goodsName=" + goodsName +
        ", specBase=" + specBase +
        ", specInfo=" + specInfo +
        ", specName=" + specName +
        ", specGoodsSpec=" + specGoodsSpec +
        ", specGoodsImg=" + specGoodsImg +
        ", goodsSpell=" + goodsSpell +
        ", lowPrice=" + lowPrice +
        ", highPrice=" + highPrice +
        ", price=" + price +
        ", prePrice=" + prePrice +
        ", buyPrice=" + buyPrice +
        ", preBuyPrice=" + preBuyPrice +
        ", priceTime=" + priceTime +
        ", profit=" + profit +
        ", loss=" + loss +
        ", tax=" + tax +
        ", sharePrice=" + sharePrice +
        ", unit=" + unit +
        ", del=" + del +
        ", classId=" + classId +
        ", keyvalue=" + keyvalue +
        ", activityType=" + activityType +
        "}";
    }
}
