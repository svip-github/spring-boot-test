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
 * 日志表
 * </p>
 *
 * @author Zhouqiyong
 * @since 2018-03-08
 */
@TableName("t_logs")
public class Logs extends Model<Logs> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 操作员id
     */
    @TableField("manager_id")
    private Integer managerId;
    /**
     * 事件类型 0 新增 1 修改 2 删除 3登录 4退出 
     */
    @TableField("type_flag")
    private Integer typeFlag;
    /**
     * 操作内容
     */
    private String content;
    /**
     * 操作时间
     */
    @TableField("modi_time")
    private Date modiTime;
    /**
     * 来源IP(可选)
     */
    @TableField("source_ip")
    private String sourceIp;
    /**
     * 请求路径(可选)
     */
    @TableField("access_url")
    private String accessUrl;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    public Integer getTypeFlag() {
        return typeFlag;
    }

    public void setTypeFlag(Integer typeFlag) {
        this.typeFlag = typeFlag;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getModiTime() {
        return modiTime;
    }

    public void setModiTime(Date modiTime) {
        this.modiTime = modiTime;
    }

    public String getSourceIp() {
        return sourceIp;
    }

    public void setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
    }

    public String getAccessUrl() {
        return accessUrl;
    }

    public void setAccessUrl(String accessUrl) {
        this.accessUrl = accessUrl;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Logs{" +
        ", id=" + id +
        ", managerId=" + managerId +
        ", typeFlag=" + typeFlag +
        ", content=" + content +
        ", modiTime=" + modiTime +
        ", sourceIp=" + sourceIp +
        ", accessUrl=" + accessUrl +
        "}";
    }
}
