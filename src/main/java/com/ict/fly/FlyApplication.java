package com.ict.fly;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


//@ComponentScan(basePackages = {"com.ict.fly.*"})
/** 不加此注解报错 A component required a bean of type 'com.xxx.xxx.dao.xxx' that could not be found.*/

@MapperScan(value = {"com.ict.fly.dao"})//手动配置dao路径
@SpringBootApplication
public class FlyApplication {

    public static void main(String[] args) {
        SpringApplication.run(FlyApplication.class, args);
    }

}
