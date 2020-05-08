package com.aaa.kay.springcloud.service;

import com.aaa.kay.springcloud.fallback.FallbackService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.awt.print.Book;
import java.util.List;

@FeignClient(value = "book-provider",fallbackFactory = FallbackService.class)
//@FeignClient(value = "book-provider")
public interface IBookService {
    /**
     * @MethodName：查询数据
     * @Description: 这个方法就是consumer来调用provider的方法
     * 如果抛出异常一定和这个方法相关
     * 因为consumer中有这个方法
     *
     * @Param: []
     * @Return: java.util.List<java.awt.print.Book>
     * @Author: 59983
     * @Date: 2020/5/6
    **/
    @GetMapping("all")
    List<Book> selectAllBooks();
}
