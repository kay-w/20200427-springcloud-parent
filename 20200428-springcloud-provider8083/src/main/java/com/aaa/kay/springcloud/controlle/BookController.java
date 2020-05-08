package com.aaa.kay.springcloud.controlle;



import com.aaa.kay.springcloud.BookServce;
import com.aaa.kay.springcloud.model.BooKInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class BookController {
    @Autowired
    private BookServce bookServce;
    /**
     * @MethodName: 查询所有的图书信息
     * @Description: TODO
     * @Param: []
     * @Return: java.util.List<com.aaa.kay.mycat.model.BooKInfo>
     * @Author: 59983
     * @Date: 2020/4/9
    **/
    @GetMapping("/all")
    public List<BooKInfo> selectAllBook(){
        return bookServce.selectAllBook();
    }
    /**
     * @MethodName: 添加图示信息
     * @Description: TODO
     * @Param: []
     * @Return: boolean
     * @Author: 59983
     * @Date: 2020/4/9
    **/
    @PutMapping("/addGoodsBook")
    public String addGoodsBook() {
        BooKInfo goodsBook = new BooKInfo();
        goodsBook.setId(2L);
        goodsBook.setBookName("java从入门到入土");
        goodsBook.setBookPrice(253.2);
        return bookServce.insert(goodsBook);
    }

    /**
     * @MethodName: 根据id删除数据
     * @Description: TODO
     * @Param: [id]
     * @Return: java.lang.String
     * @Author: 59983
     * @Date: 2020/4/9
    **/
    @DeleteMapping("delGoodsBook")
    public String delGoodsBook() {
        return bookServce.deleteByPrimaryKey(1L);
    }
    /**
     * @MethodName: 根据id修改数据
     * @Description: TODO
     * @Param: []
     * @Return: java.lang.String
     * @Author: 59983
     * @Date: 2020/4/9
    **/
    @PostMapping("updateGoodsBook")
    public String updateGoodsBook() {
        BooKInfo goodsBook= new BooKInfo();
        goodsBook.setId(2L);
        goodsBook.setBookName("西游记");
        goodsBook.setBookPrice(20.0);
        return bookServce.updateByPrimaryKey(goodsBook);
    }
    @PutMapping("selectByPrimaryKey")
    public BooKInfo selectByPrimaryKey() {
        return bookServce.selectByPrimaryKey(2L);
    }


}
