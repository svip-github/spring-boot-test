package com.jxcoop.fresh.entity;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 商品分类表
 * </p>
 *
 * @author Zhouqiyong
 * @since 2018-03-08
 */
@TableName("m_goods_class")
public class GoodsClass extends Model<GoodsClass> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 分类名称
     */
    private String name;
    /**
     * 父ID
     */
    @TableField("parent_id")
    private Integer parentId;
    /**
     * 排序
     */
    private Integer sort;
    /**
     * 描述
     */
    @TableField("gc_description")
    private String gcDescription;
    /**
     * 用逗号存放所有父类id和自己的id，前台按分类查询的时候使用 find_in_set
     */
    @TableField("gc_idpath")
    private String gcIdpath;
    /**
     * 分类图标地址，一般只有父级才有，即parent_id=0的才需要设置
     */
    private String icon;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getGcDescription() {
        return gcDescription;
    }

    public void setGcDescription(String gcDescription) {
        this.gcDescription = gcDescription;
    }

    public String getGcIdpath() {
        return gcIdpath;
    }

    public void setGcIdpath(String gcIdpath) {
        this.gcIdpath = gcIdpath;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
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
        return "GoodsClass{" +
        ", id=" + id +
        ", name=" + name +
        ", parentId=" + parentId +
        ", sort=" + sort +
        ", gcDescription=" + gcDescription +
        ", gcIdpath=" + gcIdpath +
        ", icon=" + icon +
        ", del=" + del +
        "}";
    }
}
