package com.aaa.kay.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName ApplicationRun8081
 * @Description: TODO
 * @Author 59983
 * @Date 2020/4/27
 * @Version V1.0
 **/
@SpringBootApplication
@MapperScan("com.aaa.kay.springcloud.mapper")
@EnableEurekaClient
public class ApplicationRun8082 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun8082.class, args);
    }
}
