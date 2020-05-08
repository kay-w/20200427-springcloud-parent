package com.aaa.kay.springcloud.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName RestConfig
 * @Description: TODO
 * @Author 59983
 * @Date 2020/4/30
 * @Version V1.0
 **/
@Configuration
public class RestConfig {
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
    /**
     * @MethodName: 随机算法
     * @Description: TODO
     * @Param: []
     * @Return: com.netflix.loadbalancer.IRule
     * @Author: 59983
     * @Date: 2020/4/30
    **/
    @Bean
    public IRule mineRule(){
        return new RandomRule();
    }

}
