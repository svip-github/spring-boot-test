package com.jxcoop.fresh.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Zhouqiyong
 * @since 2018-03-08
 */
@TableName("c_share")
public class Share extends Model<Share> {

    private static final long serialVersionUID = 1L;

    private String id;
    /**
     * 分享人
     */
    @TableField("proxy_id")
    private String proxyId;
    /**
     * 分享时间
     */
    private Date time;
    private String url;
    private String urlName;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProxyId() {
        return proxyId;
    }

    public void setProxyId(String proxyId) {
        this.proxyId = proxyId;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrlName() {
        return urlName;
    }

    public void setUrlName(String urlName) {
        this.urlName = urlName;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Share{" +
        ", id=" + id +
        ", proxyId=" + proxyId +
        ", time=" + time +
        ", url=" + url +
        ", urlName=" + urlName +
        "}";
    }
}
