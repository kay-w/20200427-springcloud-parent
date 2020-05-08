package com.aaa.kay.springcloud;


import com.aaa.kay.springcloud.mapper.BookMapper;
import com.aaa.kay.springcloud.model.BooKInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BookServce {
    @Autowired
    private BookMapper bookMapper;

    public List<BooKInfo> selectAllBook(){
        return bookMapper.selectAll();
    }

    public String insert(BooKInfo goodsBook) {
         int i= bookMapper.insert(goodsBook);
         if (i>0){
             return "新增成功";
         }
         return "新增失败";
    }

    public String  deleteByPrimaryKey(Long id) {
        int i=bookMapper.deleteByPrimaryKey(id);
        if(i>0){
            return "删除成功";
        }
        return "删除失败";
    }

    public String  updateByPrimaryKey(BooKInfo goodsBook) {
         int i= bookMapper.updateByPrimaryKey(goodsBook);
         if (i>0){
             return "修改成功";
         }
         return "修改失败";
    }

    public BooKInfo selectByPrimaryKey(Long id) {
        BooKInfo booKInfo=bookMapper.selectByPrimaryKey(id);
        if (null != booKInfo.getBookName() && ""!=booKInfo.getBookName()){
            return booKInfo;
        }
        return null;
    }
}
