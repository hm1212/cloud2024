package com.example.cloud2024.service.impl;

import com.example.cloud2024.entities.Pay;
import com.example.cloud2024.mapper.PayMapper;
import com.example.cloud2024.service.PayService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author hhmm
 * @date 2024/3/11
 **/
@Service
public class PayServiceImpl implements PayService {
    @Resource
    PayMapper payMapper;


    @Override
    public int add(Pay pay) {
        return payMapper.insertSelective(pay);
    }

    @Override
    public int deleteById(int id) {
        return payMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int update(Pay pay) {
        return payMapper.updateByPrimaryKey(pay);
    }

    @Override
    public Pay getById(int id) {
        return payMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Pay> getALl() {
        return payMapper.selectAll();
    }
}
