package com.jxcoop.fresh.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 运营中心给企业端的公告信息
 * </p>
 *
 * @author Zhouqiyong
 * @since 2018-03-08
 */
@TableName("b_message")
public class Message extends Model<Message> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 标题
     */
    private String title;
    /**
     * 消息
     */
    private String message;
    /**
     * 时间
     */
    private Date time;
    /**
     * 类型：1 运用中心 ； 2 供应商 ；3企业端
     */
    private Integer type;
    /**
     * 1:正常；2删除
     */
    private Integer del;


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

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
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
        return "Message{" +
        ", id=" + id +
        ", title=" + title +
        ", message=" + message +
        ", time=" + time +
        ", type=" + type +
        ", del=" + del +
        "}";
    }
}
