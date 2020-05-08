package com.aaa.kay.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName ApplicationRun6082
 * @Description: TODO
 * @Author 59983
 * @Date 2020/4/30
 * @Version V1.0
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class ApplicationRun6082 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun6082.class,args);
    }
}
