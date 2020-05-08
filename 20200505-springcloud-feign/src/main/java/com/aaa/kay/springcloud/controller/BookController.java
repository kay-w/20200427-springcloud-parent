package com.aaa.kay.springcloud.controller;

import com.aaa.kay.springcloud.service.IBookService;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Book;
import java.util.List;

/**
 * @ClassName BookController
 * @Description: TODO
 * @Author 59983
 * @Date 2020/5/6
 * @Version V1.0
 **/
@RestController
public class BookController {
    @Autowired
    private IBookService bookService;
    @GetMapping("/all")
    public List<Book> selectAllBooks(){
        return bookService.selectAllBooks();
    }
}
