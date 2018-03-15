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
 * 商品出入库明细
 * </p>
 *
 * @author Zhouqiyong
 * @since 2018-03-08
 */
@TableName("s_stock_detail")
public class StockDetail extends Model<StockDetail> {

    private static final long serialVersionUID = 1L;

    /**
     * 供应商入库单ID,如果是库管员做损耗，直接写默认的provideid
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    @TableField("provide_id")
    private String provideId;
    /**
     * 菜品id
     */
    @TableField("goods_specs_id")
    private Integer goodsSpecsId;
    /**
     * 菜品名
     */
    @TableField("goods_name")
    private String goodsName;
    /**
     * 商品规格
     */
    @TableField("spec_info")
    private String specInfo;
    /**
     * 需要采购数量
     */
    @TableField("real_num")
    private Float realNum;
    /**
     * 入库数量
     */
    @TableField("in_num")
    private Float inNum;
    /**
     *  1 自动入库  2自动 出库  3 手工入库   4 手工出库
     */
    private Integer flag;
    /**
     * 出入库说明
     */
    @TableField("flag_name")
    private String flagName;
    /**
     * 入库员id(入库员对采购单扫码入库，或者供应商分拣好的商品单个商品入库出库)
     */
    @TableField("user_id")
    private Integer userId;
    /**
     * 入库员姓名
     */
    @TableField("user_name")
    private String userName;
    /**
     * 入库时间，扫码后台自动插入系统时间
     */
    @TableField("check_time")
    private Date checkTime;
    /**
     * 备注
     */
    private String memo;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProvideId() {
        return provideId;
    }

    public void setProvideId(String provideId) {
        this.provideId = provideId;
    }

    public Integer getGoodsSpecsId() {
        return goodsSpecsId;
    }

    public void setGoodsSpecsId(Integer goodsSpecsId) {
        this.goodsSpecsId = goodsSpecsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getSpecInfo() {
        return specInfo;
    }

    public void setSpecInfo(String specInfo) {
        this.specInfo = specInfo;
    }

    public Float getRealNum() {
        return realNum;
    }

    public void setRealNum(Float realNum) {
        this.realNum = realNum;
    }

    public Float getInNum() {
        return inNum;
    }

    public void setInNum(Float inNum) {
        this.inNum = inNum;
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

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "StockDetail{" +
        ", id=" + id +
        ", provideId=" + provideId +
        ", goodsSpecsId=" + goodsSpecsId +
        ", goodsName=" + goodsName +
        ", specInfo=" + specInfo +
        ", realNum=" + realNum +
        ", inNum=" + inNum +
        ", flag=" + flag +
        ", flagName=" + flagName +
        ", userId=" + userId +
        ", userName=" + userName +
        ", checkTime=" + checkTime +
        ", memo=" + memo +
        "}";
    }
}
