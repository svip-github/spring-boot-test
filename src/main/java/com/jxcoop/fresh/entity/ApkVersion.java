package com.jxcoop.fresh.entity;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * apk版本信息
 * </p>
 *
 * @author Zhouqiyong
 * @since 2018-03-08
 */
@TableName("apk_version")
public class ApkVersion extends Model<ApkVersion> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * apk下载地址
     */
    private String url;
    /**
     * apk版本号
     */
    @TableField("version_code")
    private Integer versionCode;
    /**
     * 更新信息
     */
    @TableField("update_message")
    private String updateMessage;
    /**
     * 1:代表运营中心apk  2:供应商
     */
    private Integer flag;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getVersionCode() {
        return versionCode;
    }

    public void setVersionCode(Integer versionCode) {
        this.versionCode = versionCode;
    }

    public String getUpdateMessage() {
        return updateMessage;
    }

    public void setUpdateMessage(String updateMessage) {
        this.updateMessage = updateMessage;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "ApkVersion{" +
        ", id=" + id +
        ", url=" + url +
        ", versionCode=" + versionCode +
        ", updateMessage=" + updateMessage +
        ", flag=" + flag +
        "}";
    }
}
