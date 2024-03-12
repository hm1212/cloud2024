package org.example.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @Author hhmm
 * @date 2024/3/11
 **/

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PayDto {


    private Integer id;

    /**
     * 流水号
     */

    private String payNo;

    /**
     * 支付订单号
     */
    private String orderId;

    /**
     * 用户编号
     */
    private Integer userId;

    /**
     * 交易金额
     */
    private BigDecimal amount;

}
