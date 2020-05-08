package com.aaa.kay.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @ClassName ApplicationRun3081
 * @Description: TODO
 * @Author 59983
 * @Date 2020/5/8
 * @Version V1.0
 **/
@SpringBootApplication
@EnableConfigServer
public class ApplicationRun3081 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun3081.class,args);
    }
}
