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
 * 短信发送记录表
 * </p>
 *
 * @author Zhouqiyong
 * @since 2018-03-08
 */
@TableName("m_sended_sms")
public class SendedSms extends Model<SendedSms> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 短信类型，0 找回密码，1重置密码 2通知类 3验证码
     */
    @TableField("message_type")
    private Integer messageType;
    /**
     * 发送时间
     */
    @TableField("send_time")
    private Date sendTime;
    /**
     * 发送者  如果是自动触发0   否则存入当前登录者的userid
     */
    @TableField("send_type")
    private Integer sendType;
    /**
     * 发送状态 ，1 成功 ， 2失败
     */
    @TableField("send_code")
    private Integer sendCode;
    /**
     * 发送内容
     */
    @TableField("send_content")
    private String sendContent;
    /**
     * 发送源 后台 或者 其他平台
     */
    @TableField("send_src")
    private String sendSrc;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMessageType() {
        return messageType;
    }

    public void setMessageType(Integer messageType) {
        this.messageType = messageType;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public Integer getSendType() {
        return sendType;
    }

    public void setSendType(Integer sendType) {
        this.sendType = sendType;
    }

    public Integer getSendCode() {
        return sendCode;
    }

    public void setSendCode(Integer sendCode) {
        this.sendCode = sendCode;
    }

    public String getSendContent() {
        return sendContent;
    }

    public void setSendContent(String sendContent) {
        this.sendContent = sendContent;
    }

    public String getSendSrc() {
        return sendSrc;
    }

    public void setSendSrc(String sendSrc) {
        this.sendSrc = sendSrc;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "SendedSms{" +
        ", id=" + id +
        ", messageType=" + messageType +
        ", sendTime=" + sendTime +
        ", sendType=" + sendType +
        ", sendCode=" + sendCode +
        ", sendContent=" + sendContent +
        ", sendSrc=" + sendSrc +
        "}";
    }
}
