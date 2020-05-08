package com.aaa.kay.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.awt.print.Book;
import java.util.List;

/**
 * @ClassName BookController
 * @Description: TODO
 * @Author 59983
 * @Date 2020/4/30
 * @Version V1.0
 **/
@RestController
public class BookController {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private LoadBalancerClient loadBalancerClient;
    @GetMapping("/")
    public List<Book> selectAllBooks(){
        return restTemplate.getForObject("http://book-provider/all",List.class);

    }
    @GetMapping("/noEureka")
    public List<Book> selectAllBooksNoEureka(){
        // 1.根据在application.properties文件中所配置算法规则来选择出最终需要找到Server服务器信息
        ServiceInstance serviceInstance = loadBalancerClient.choose("book-provider");
        // 2.Server对象中有provider服务器的ip地址以及端口号，获取选择出来的那一台provider的ip地址
        String host = serviceInstance.getHost();
        System.out.println(host);
        // 3.获取端口号
        int port = serviceInstance.getPort();
        System.out.println(port);
        return restTemplate.getForObject("http://"+host+":"+port+"/all", List.class);
    }
}

