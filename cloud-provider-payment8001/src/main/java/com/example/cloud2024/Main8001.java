package com.example.cloud2024;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @Author hhmm
 * @date 2024/3/11
 **/
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.example.cloud2024.mapper")
@RefreshScope
public class Main8001 {
    public static void main(String[] args) {

        SpringApplication.run(Main8001.class);
    }
}
