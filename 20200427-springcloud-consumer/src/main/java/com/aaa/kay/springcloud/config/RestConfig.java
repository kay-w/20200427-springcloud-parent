package com.aaa.kay.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName RestConfig
 * @Description: TODO
 * @Author 59983
 * @Date 2020/4/27
 * @Version V1.0
 **/
@Configuration
public class RestConfig {
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
