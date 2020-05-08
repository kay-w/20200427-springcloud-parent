package com.aaa.kay.springcloud.controller;

import com.aaa.kay.springcloud.BookServce;
import com.aaa.kay.springcloud.model.BooKInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName BookController
 * @Description: TODO
 * @Author 59983
 * @Date 2020/5/7
 * @Version V1.0
 **/
@RestController
public class BookController {
    @Autowired
    private BookServce bookServce;
    @GetMapping("/all")
    //@HystrixCommand(fallbackMethod = "selectAllBooksFallbacl")
    public List<BooKInfo> selectAllBooks()throws Exception{
        List<BooKInfo>  bookList= new BookServce().selectAllBook();
         /*if(bookList.size() > 0) {
            // 说明数据库中有值，说明程序是对的(按照咱们目前的情况，一定会进if中)
            // 所以直接抛出异常
            throw new Exception("故意抛出异常");// 必会抛出异常
        }*/
        return bookList;
    }
    /*public List<Book> selectAllBooksFallbacl() {
        List<Book> bookList = new ArrayList<Book>();
        Book book = new Book();
        book.setId(100000L);
        book.setBookName("测试异常熔断");
        bookList.add(book);
        return bookList;
    }*/


}














