package com.example.cloud2024;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @Author hhmm
 * @date 2024/3/11
 **/
@SpringBootApplication
@MapperScan("com.example.cloud2024.mapper")
public class Main8001 {
    public static void main(String[] args) {

        SpringApplication.run(Main8001.class);
    }
}
