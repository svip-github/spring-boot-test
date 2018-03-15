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
 * 采购入库结算表
 * </p>
 *
 * @author Zhouqiyong
 * @since 2018-03-08
 */
@TableName("s_in_stock")
public class InStock extends Model<InStock> {

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
     * 实际采购单价,
     */
    @TableField("buy_price")
    private Float buyPrice;
    /**
     * 单项小计总价
     */
    @TableField("sum_price")
    private Float sumPrice;
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
    /**
     * j加单审核状态  冗余，0 等待审核，1审核成功，2审核失败
     */
    @TableField("instock_status")
    private Integer instockStatus;
    /**
     * 0，正常，1 加单
     */
    private Integer type;
    /**
     *  1 采购报销  2供应商结算
     */
    private Integer flag;
    /**
     * 1 审核中  2 结算成功   3 结算失败
     */
    private Integer status;
    /**
     * 结算时间
     */
    @TableField("final_time")
    private Date finalTime;
    /**
     * 配送时间
     */
    @TableField("send_time")
    private Date sendTime;
    /**
     * 采购入库结算单id
     */
    @TableField("stock_sheet_id")
    private Integer stockSheetId;


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

    public Float getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(Float buyPrice) {
        this.buyPrice = buyPrice;
    }

    public Float getSumPrice() {
        return sumPrice;
    }

    public void setSumPrice(Float sumPrice) {
        this.sumPrice = sumPrice;
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

    public Integer getInstockStatus() {
        return instockStatus;
    }

    public void setInstockStatus(Integer instockStatus) {
        this.instockStatus = instockStatus;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getFinalTime() {
        return finalTime;
    }

    public void setFinalTime(Date finalTime) {
        this.finalTime = finalTime;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public Integer getStockSheetId() {
        return stockSheetId;
    }

    public void setStockSheetId(Integer stockSheetId) {
        this.stockSheetId = stockSheetId;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "InStock{" +
        ", id=" + id +
        ", provideId=" + provideId +
        ", goodsSpecsId=" + goodsSpecsId +
        ", goodsName=" + goodsName +
        ", specInfo=" + specInfo +
        ", realNum=" + realNum +
        ", inNum=" + inNum +
        ", buyPrice=" + buyPrice +
        ", sumPrice=" + sumPrice +
        ", userId=" + userId +
        ", userName=" + userName +
        ", checkTime=" + checkTime +
        ", memo=" + memo +
        ", instockStatus=" + instockStatus +
        ", type=" + type +
        ", flag=" + flag +
        ", status=" + status +
        ", finalTime=" + finalTime +
        ", sendTime=" + sendTime +
        ", stockSheetId=" + stockSheetId +
        "}";
    }
}
