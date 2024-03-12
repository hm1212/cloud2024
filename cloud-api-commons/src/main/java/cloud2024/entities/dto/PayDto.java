package cloud2024.entities.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * @Author hhmm
 * @date 2024/3/11
 **/
//封装数据库查询和插入数据库的数据
@NoArgsConstructor
@AllArgsConstructor
@Data
public class PayDto {

    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     * 流水号
     */
    @Column(name = "pay_no")
    private String payNo;

    /**
     * 支付订单号
     */
    @Column(name = "order_id")
    private String orderId;

    /**
     * 用户编号
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 交易金额
     */
    private BigDecimal amount;

}
