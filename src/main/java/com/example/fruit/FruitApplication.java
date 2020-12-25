package com.example.fruit;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//为这个包com.example.fruit.dao下的接口创建对象
@SpringBootApplication
@MapperScan("com.example.fruit.dao")
public class FruitApplication {

    public static void main(String[] args) {
        SpringApplication.run(FruitApplication.class, args);
    }

}
