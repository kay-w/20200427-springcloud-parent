package com.aaa.kay.springcloud.mapper;

import com.aaa.kay.springcloud.model.BooKInfo;

import java.util.List;

public interface BookMapper {
    int deleteByPrimaryKey(Long id);

    int insert(BooKInfo record);

    BooKInfo selectByPrimaryKey(Long id);

    List<BooKInfo> selectAll();

    int updateByPrimaryKey(BooKInfo record);

}