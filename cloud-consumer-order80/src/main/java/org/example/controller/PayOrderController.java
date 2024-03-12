package org.example.controller;

import cloud2024.resp.ResultData;
import cn.hutool.core.bean.BeanUtil;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import org.apache.commons.lang3.stream.Streams;
import org.example.entities.PayDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author hhmm
 * @date 2024/3/11
 **/
@RestController
@RequestMapping("/consumer")
@Tag(name = "消费者80", description = "消费者80")
public class PayOrderController {
    private String url = "http://cloud-payment-service/";
    @Resource
    private RestTemplate restTemplate;

    @PostMapping("/add")
    @Operation(summary = "新增", description = "添加支付数据")
    public ResultData<PayDto> addOrder(PayDto payDto) {
        PayDto resultDto = restTemplate.postForObject(url + "/pay/add", payDto, PayDto.class);
        return ResultData.success(resultDto);
    }

    @PostMapping("/del")
    @Operation(summary = "删除", description = "删除支付数据")
    public ResultData<String> delOrderById(int id) {
        HashMap<Object, Object> map = new HashMap<>();
        map.put("id", id);
        restTemplate.delete(url, map);
        return ResultData.success("删除成功");
    }

    @PostMapping("/get/{id}")
    @Operation(summary = "根据ID获取数据", description = "根据ID获取数据")
    public ResultData<PayDto> getOrderById(@PathVariable int id) {
        ResponseEntity<PayDto> forEntity = restTemplate.getForEntity(url + "/pay/get/"+id, PayDto.class, id);
        if (forEntity.getStatusCode().is2xxSuccessful()) {

            return ResultData.success(forEntity.getBody());
        }
        return null;

    }
    @PostMapping("/get/all")
    @Operation(summary = "获取全部数据", description = "获取全部数据")
    public ResultData<PayDto> getAll() {
        ResponseEntity<ResultData> entity = restTemplate.getForEntity(url + "/pay/get/all", ResultData.class);
        if (entity.getStatusCode().is2xxSuccessful()){
           return entity.getBody();
        }
        return null;
    }
    @GetMapping(value = "/refresh/scope")
    public String refresh() {
        String forObject = restTemplate.getForObject(url + "/pay/refresh/scope", String.class);
        return forObject;
    }
}
