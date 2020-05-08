package com.aaa.kay.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TestController
 * @Description: TODO
 * @Author 59983
 * @Date 2020/5/8
 * @Version V1.0
 **/
@RestController
public class TestController {
    @Value("${server.port}")
    private String port;

    @Value("${spring.datasource.driver-class-name}")
    private String driverClassName;

    @GetMapping("/test")
    public String test() {
        return port+"--------------"+driverClassName;
    }

}
