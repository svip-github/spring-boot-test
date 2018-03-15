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
 * 订单状态跟踪表
 * </p>
 *
 * @author Zhouqiyong
 * @since 2018-03-08
 */
@TableName("m_order_flow")
public class OrderFlow extends Model<OrderFlow> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 订单编号
     */
    @TableField("order_sn")
    private String orderSn;
    /**
     * 订单状态修改时间
     */
    private Date time;
    /**
     * 状态说明，用户下单，用户取消订单， 配货中....
     */
    private String content;
    /**
     * 1已下单 2已取消  5 未满单 6已满单  3审核成功 4审核不通过  7分拣完毕,可能和8冲突  8装箱中 9 装箱完毕  10配送中 11补单中 12拒签  13已签收 14已结算 
     */
    private Integer status;
    /**
     * 操作人名字，可能是用户 也可能是后台
     */
    private String operator;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "OrderFlow{" +
        ", id=" + id +
        ", orderSn=" + orderSn +
        ", time=" + time +
        ", content=" + content +
        ", status=" + status +
        ", operator=" + operator +
        "}";
    }
}
