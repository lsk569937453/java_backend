package com.lsk.backend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/*
*
 * @Author shikai.liu
 * @Description //TODO
 * @Date 6:01 下午 2020/8/25
 * @Param 
 * @return 
 **/
@SpringBootApplication
@MapperScan("com.lsk.backend.mapper")

public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

}
