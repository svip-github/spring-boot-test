package com.jxcoop.fresh.entity;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 品牌表
 * </p>
 *
 * @author Zhouqiyong
 * @since 2018-03-08
 */
@TableName("m_brand")
public class Brand extends Model<Brand> {

    private static final long serialVersionUID = 1L;

    /**
     * 品牌表
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 品牌名
     */
    private String name;
    /**
     * 公司名称
     */
    private String company;
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

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
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
        return "Brand{" +
        ", id=" + id +
        ", name=" + name +
        ", company=" + company +
        ", del=" + del +
        "}";
    }
}
