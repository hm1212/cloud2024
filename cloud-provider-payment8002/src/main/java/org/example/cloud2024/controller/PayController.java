package org.example.cloud2024.controller;

import cloud2024.entities.Pay;
import cloud2024.entities.dto.PayDto;
import cloud2024.resp.ResultData;
import cn.hutool.core.bean.BeanUtil;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import org.example.cloud2024.service.PayService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Value;
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
    public ResultData<String> addPay(PayDto payDto) {
        Pay pay = BeanUtil.copyProperties(payDto, Pay.class);
        int add = payService.add(pay);

        return ResultData.success("数据添加成功:"+add);
    }

    @Operation(summary = "删除支付数据",description = "删除支付数据")
    @DeleteMapping(value = "/del/{id}")
    public ResultData<String> deletePay(@PathVariable("id") Integer id) {
        int i = payService.deleteById(id);
        return ResultData.success("数据删除成功:"+i);
    }

    @Operation(summary = "更新支付数据",description = "更新支付数据")
    @PutMapping(value = "/update")
    public ResultData<String> updatePay(@RequestBody PayDto payDto) {
        Pay pay = new Pay();
        BeanUtils.copyProperties(payDto, pay);

        int i = payService.update(pay);
        return ResultData.success("成功更新支付数据，返回值：" + i);
    }

    @Operation(summary = "获取具体支付数据",description = "获取具体支付数据")
    @GetMapping(value = "/get/{id}")
    public ResultData<Pay> getById(@PathVariable("id") Integer id) {
        Pay pay = payService.getById(id);
        return ResultData.success(pay);
    }

    @Operation(summary = "获取全部支付数据",description = "获取全部支付数据")
    @GetMapping(value = "/get/all")
    public ResultData<List<Pay>> getALL() {
        List<Pay> aLl = payService.getALl();
        return ResultData.success(aLl);
    }

    @GetMapping(value = "/refresh/scope")
    public String refresh(@Value("${HHMM}") String hhmm,@Value("${server.port}") String port) {
        return "hhmm:"+hhmm+"\t"+"port:"+port;
    }


}
