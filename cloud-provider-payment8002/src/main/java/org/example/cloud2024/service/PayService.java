package org.example.cloud2024.service;


import cloud2024.entities.Pay;

import java.util.List;

/**
 * @Author hhmm
 * @date 2024/3/11
 **/
public interface PayService {
     int add(Pay pay);
     int deleteById(int  id);
     int update(Pay pay);
     Pay getById(int  id);

     List<Pay> getALl();


}
