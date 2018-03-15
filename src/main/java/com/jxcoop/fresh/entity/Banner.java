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
 * 微信首页轮播图
 * </p>
 *
 * @author Zhouqiyong
 * @since 2018-03-08
 */
@TableName("c_banner")
public class Banner extends Model<Banner> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 标题
     */
    private String title;
    /**
     * 图片
     */
    private String image;
    /**
     * 跳转链接
     */
    private String url;
    /**
     * 状态(1:正常;2:停用)
     */
    private Integer status;
    /**
     * 排序
     */
    private Integer sort;
    /**
     * 创建时间或者修改时间
     */
    @TableField("up_time")
    private Date upTime;
    /**
     * 创建人或者修改人
     */
    @TableField("user_name")
    private String userName;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Date getUpTime() {
        return upTime;
    }

    public void setUpTime(Date upTime) {
        this.upTime = upTime;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Banner{" +
        ", id=" + id +
        ", title=" + title +
        ", image=" + image +
        ", url=" + url +
        ", status=" + status +
        ", sort=" + sort +
        ", upTime=" + upTime +
        ", userName=" + userName +
        "}";
    }
}
