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
 * 供应商入库单明细表
 * </p>
 *
 * @author Zhouqiyong
 * @since 2018-03-08
 */
@TableName("p_provide_data_detail")
public class ProvideDataDetail extends Model<ProvideDataDetail> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 供应商入库单ID
     */
    @TableField("data_id")
    private Integer dataId;
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
    @TableField("in_house_num")
    private Float inHouseNum;
    /**
     * 仓管员核准入库数量
     */
    @TableField("approval_num")
    private Float approvalNum;
    /**
     * 实际采购单价，不管采购员买来的规格是啥，都要折算成该产品的销售单价
     */
    @TableField("buy_price")
    private Float buyPrice;
    /**
     * 单项小计总价
     */
    @TableField("sum_price")
    private Float sumPrice;
    /**
     * 备注
     */
    private String memo;
    /**
     * 0系统直接导过来的，1采购员自己加的单
     */
    private Integer type;
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


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDataId() {
        return dataId;
    }

    public void setDataId(Integer dataId) {
        this.dataId = dataId;
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

    public Float getInHouseNum() {
        return inHouseNum;
    }

    public void setInHouseNum(Float inHouseNum) {
        this.inHouseNum = inHouseNum;
    }

    public Float getApprovalNum() {
        return approvalNum;
    }

    public void setApprovalNum(Float approvalNum) {
        this.approvalNum = approvalNum;
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

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "ProvideDataDetail{" +
        ", id=" + id +
        ", dataId=" + dataId +
        ", goodsSpecsId=" + goodsSpecsId +
        ", goodsName=" + goodsName +
        ", specInfo=" + specInfo +
        ", realNum=" + realNum +
        ", inHouseNum=" + inHouseNum +
        ", approvalNum=" + approvalNum +
        ", buyPrice=" + buyPrice +
        ", sumPrice=" + sumPrice +
        ", memo=" + memo +
        ", type=" + type +
        ", userId=" + userId +
        ", userName=" + userName +
        ", checkTime=" + checkTime +
        "}";
    }
}
