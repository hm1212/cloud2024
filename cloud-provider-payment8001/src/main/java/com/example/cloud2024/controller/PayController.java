package com.example.cloud2024.controller;

import cn.hutool.core.bean.BeanUtil;
import com.example.cloud2024.entities.Pay;
import com.example.cloud2024.entities.dto.PayDto;
import com.example.cloud2024.service.PayService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author hhmm
 * @date 2024/3/11
 **/
@Tag(name = "支付模块",description = "支付crud")
@RestController
@RequestMapping("/pay")
public class PayController {
    @Resource
    PayService payService;

    @Operation(summary = "添加支付数据",description = "添加支付数据")
    @PostMapping("/add")
    public int addPay(PayDto payDto) {
        Pay pay = BeanUtil.copyProperties(payDto, Pay.class);
        return payService.add(pay);
    }

    @Operation(summary = "删除支付数据",description = "删除支付数据")
    @DeleteMapping(value = "/del/{id}")
    public Integer deletePay(@PathVariable("id") Integer id) {
        return payService.deleteById(id);
    }

    @Operation(summary = "更新支付数据",description = "更新支付数据")
    @PutMapping(value = "/update")
    public String updatePay(@RequestBody PayDto payDto) {
        Pay pay = new Pay();
        BeanUtils.copyProperties(payDto, pay);

        int i = payService.update(pay);
        return "成功修改记录，返回值：" + i;
    }

    @Operation(summary = "获取具体支付数据",description = "获取具体支付数据")
    @GetMapping(value = "/get/{id}")
    public Pay getById(@PathVariable("id") Integer id) {
        return payService.getById(id);
    }

    @Operation(summary = "获取全部支付数据",description = "获取全部支付数据")
    @GetMapping(value = "/get/all")
    public List<Pay> getALL() {
        return payService.getALl();
    }

}
