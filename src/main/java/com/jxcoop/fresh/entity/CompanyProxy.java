package com.jxcoop.fresh.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 企业表_合伙人表
 * </p>
 *
 * @author Zhouqiyong
 * @since 2018-03-08
 */
@TableName("b_company_proxy")
public class CompanyProxy extends Model<CompanyProxy> {

    private static final long serialVersionUID = 1L;

    /**
     * 客户编号 前面2位+18位uuid
     */
    private String id;
    /**
     * 企业名称
     */
    private String name;
    /**
     * 顾客单位别名，用于绿瑞康内部衔接老系统
     */
    private String alias;
    private String address;
    /**
     * 行政区域
     */
    @TableField("area_id")
    private String areaId;
    /**
     * 客户级别   1 普通 2银卡  3金卡 4钻石
     */
    private Integer level;
    /**
     * 类型   1 企业客户  2 合伙人
     */
    private Integer type;
    /**
     * 创建时间 或者审核时间
     */
    @TableField("create_time")
    private Date createTime;
    /**
     * 审核人员或者 录入人员
     */
    @TableField("user_name")
    private String userName;
    /**
     * 业务员ID
     */
    @TableField("sale_id")
    private Integer saleId;
    /**
     * 业务员
     */
    @TableField("sale_name")
    private String saleName;
    /**
     * 运费
     */
    @TableField("auto_price")
    private Float autoPrice;
    /**
     * 联系人
     */
    @TableField("link_man")
    private String linkMan;
    /**
     * 联系人电话
     */
    @TableField("link_phone")
    private String linkPhone;
    /**
     * 价格模板的id，0为标准价格，其它值为数据库中价格模板的id，通过模板查找菜品价格
     */
    @TableField("template_id")
    private Integer templateId;
    /**
     * 是否支持月结  0不支持 1 支持 
     */
    @TableField("pay_type")
    private Integer payType;
    /**
     * 只针对模板编号不为0的企业，也就是需要读模板的客户。    这个标志确定是只能买模板里的菜，还是可以买所有菜  1  只买模板  2 买所有菜 
     */
    @TableField("all_goods")
    private Integer allGoods;
    /**
     * 配送服务费比率
     */
    @TableField("service_price")
    private Float servicePrice;
    /**
     * gps x坐标
     */
    @TableField("gps_x")
    private Float gpsX;
    /**
     * gps y坐标
     */
    @TableField("gpx_y")
    private Float gpxY;
    /**
     * 逻辑删除(1：正常，2：已删除 3 停用)
     */
    private Integer del;
    /**
     * 金额修改时间
     */
    @TableField("money_time")
    private Date moneyTime;
    /**
     * 每次修改金额的时候 把 余额+系统时间 生成MD5串
     */
    @TableField("md5_str")
    private String md5Str;
    /**
     * 账户余额
     */
    private Float money;
    /**
     * 上一次余额变动数量，用来方便从交易明细中搜索操作历史记录
     */
    private Float howmuch;
    /**
     * 父公司id
     */
    @TableField("parent_id")
    private String parentId;
    /**
     * 0,扣本公司帐户的钱，1扣总公司账户的钱
     */
    @TableField("pay_flag")
    private Integer payFlag;
    /**
     * 默认的开发人的账号
     */
    @TableField("default_referee")
    private String defaultReferee;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getSaleId() {
        return saleId;
    }

    public void setSaleId(Integer saleId) {
        this.saleId = saleId;
    }

    public String getSaleName() {
        return saleName;
    }

    public void setSaleName(String saleName) {
        this.saleName = saleName;
    }

    public Float getAutoPrice() {
        return autoPrice;
    }

    public void setAutoPrice(Float autoPrice) {
        this.autoPrice = autoPrice;
    }

    public String getLinkMan() {
        return linkMan;
    }

    public void setLinkMan(String linkMan) {
        this.linkMan = linkMan;
    }

    public String getLinkPhone() {
        return linkPhone;
    }

    public void setLinkPhone(String linkPhone) {
        this.linkPhone = linkPhone;
    }

    public Integer getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Integer templateId) {
        this.templateId = templateId;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public Integer getAllGoods() {
        return allGoods;
    }

    public void setAllGoods(Integer allGoods) {
        this.allGoods = allGoods;
    }

    public Float getServicePrice() {
        return servicePrice;
    }

    public void setServicePrice(Float servicePrice) {
        this.servicePrice = servicePrice;
    }

    public Float getGpsX() {
        return gpsX;
    }

    public void setGpsX(Float gpsX) {
        this.gpsX = gpsX;
    }

    public Float getGpxY() {
        return gpxY;
    }

    public void setGpxY(Float gpxY) {
        this.gpxY = gpxY;
    }

    public Integer getDel() {
        return del;
    }

    public void setDel(Integer del) {
        this.del = del;
    }

    public Date getMoneyTime() {
        return moneyTime;
    }

    public void setMoneyTime(Date moneyTime) {
        this.moneyTime = moneyTime;
    }

    public String getMd5Str() {
        return md5Str;
    }

    public void setMd5Str(String md5Str) {
        this.md5Str = md5Str;
    }

    public Float getMoney() {
        return money;
    }

    public void setMoney(Float money) {
        this.money = money;
    }

    public Float getHowmuch() {
        return howmuch;
    }

    public void setHowmuch(Float howmuch) {
        this.howmuch = howmuch;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public Integer getPayFlag() {
        return payFlag;
    }

    public void setPayFlag(Integer payFlag) {
        this.payFlag = payFlag;
    }

    public String getDefaultReferee() {
        return defaultReferee;
    }

    public void setDefaultReferee(String defaultReferee) {
        this.defaultReferee = defaultReferee;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "CompanyProxy{" +
        ", id=" + id +
        ", name=" + name +
        ", alias=" + alias +
        ", address=" + address +
        ", areaId=" + areaId +
        ", level=" + level +
        ", type=" + type +
        ", createTime=" + createTime +
        ", userName=" + userName +
        ", saleId=" + saleId +
        ", saleName=" + saleName +
        ", autoPrice=" + autoPrice +
        ", linkMan=" + linkMan +
        ", linkPhone=" + linkPhone +
        ", templateId=" + templateId +
        ", payType=" + payType +
        ", allGoods=" + allGoods +
        ", servicePrice=" + servicePrice +
        ", gpsX=" + gpsX +
        ", gpxY=" + gpxY +
        ", del=" + del +
        ", moneyTime=" + moneyTime +
        ", md5Str=" + md5Str +
        ", money=" + money +
        ", howmuch=" + howmuch +
        ", parentId=" + parentId +
        ", payFlag=" + payFlag +
        ", defaultReferee=" + defaultReferee +
        "}";
    }
}
