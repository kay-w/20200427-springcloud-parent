package com.aaa.kay.springcloud.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @MethodName:
 * @Description: TODO
 * @Param:
 * @Return:
 * @Author: 59983
 * @Date: 2020/4/27
**/
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class BooKInfo {
    private Long id;

    private String bookName;

    private Double bookPrice;




}
