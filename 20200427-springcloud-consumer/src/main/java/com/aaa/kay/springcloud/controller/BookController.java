package com.aaa.kay.springcloud.controller;

import com.aaa.kay.springcloud.model.BooKInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @ClassName BookController
 * @Description: TODO
 * @Author 59983
 * @Date 2020/4/27
 * @Version V1.0
 **/
@RestController
public class BookController {
    @Autowired
    private RestTemplate restTemplate;
    /**
     * @MethodName: selectAllBooks
     * @Description: TODO
     * @Param: []
     * @Return: java.util.List<com.aaa.kay.springcloud.model.BooKInfo>
     * @Author: 59983
     * @Date: 2020/4/27
    **/
    @GetMapping("/bookAll")
    public List<BooKInfo> selectAllBooks() {
        return restTemplate.getForObject("http://localhost:8081/all", List.class);
    }
}




