package com.aaa.kay.springcloud;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @MethodName:
 * @Description: TODO
 * @Param:
 * @Return:
 * @Author: 59983
 * @Date: 2020/5/7
**/
@SpringBootApplication
@MapperScan("com.aaa.kay.springcloud.mapper")
@EnableDiscoveryClient
@EnableCircuitBreaker
public class ApplicationRun8084 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun8084.class, args);
    }

}
