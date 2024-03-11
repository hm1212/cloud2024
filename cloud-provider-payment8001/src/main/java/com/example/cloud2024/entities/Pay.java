package com.example.cloud2024.entities;

import io.swagger.v3.oas.annotations.media.Schema;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 表名：t_pay
 * 表注释：交易信息表
*/
@Table(name = "t_pay")
@Schema(description = "支付交易表实体类")
public class Pay {

    @Id
    @Schema(description = "主键")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     * 流水号
     */
    @Schema(description = "流水号")
    @Column(name = "pay_no")
    private String payNo;

    /**
     * 支付订单号
     */

    @Column(name = "order_id")
    @Schema(description = "支付订单号")
    private String orderId;

    /**
     * 用户编号
     */
    @Column(name = "user_id")
    @Schema(description = "用户编号")
    private Integer userId;

    /**
     * 交易金额
     */
    @Schema(description = "交易金额")
    private BigDecimal amount;

    /**
     * 是否删除，0未删除，1删除
     */
    private Byte deleted;

    /**
     * 交易时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取流水号
     *
     * @return payNo - 流水号
     */
    public String getPayNo() {
        return payNo;
    }

    /**
     * 设置流水号
     *
     * @param payNo 流水号
     */
    public void setPayNo(String payNo) {
        this.payNo = payNo;
    }

    /**
     * 获取支付订单号
     *
     * @return orderId - 支付订单号
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * 设置支付订单号
     *
     * @param orderId 支付订单号
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * 获取用户编号
     *
     * @return userId - 用户编号
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置用户编号
     *
     * @param userId 用户编号
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取交易金额
     *
     * @return amount - 交易金额
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * 设置交易金额
     *
     * @param amount 交易金额
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * 获取是否删除，0未删除，1删除
     *
     * @return deleted - 是否删除，0未删除，1删除
     */
    public Byte getDeleted() {
        return deleted;
    }

    /**
     * 设置是否删除，0未删除，1删除
     *
     * @param deleted 是否删除，0未删除，1删除
     */
    public void setDeleted(Byte deleted) {
        this.deleted = deleted;
    }

    /**
     * 获取交易时间
     *
     * @return createTime - 交易时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置交易时间
     *
     * @param createTime 交易时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取更新时间
     *
     * @return updateTime - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}