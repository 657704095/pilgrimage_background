package com.example.demo.dto;

import lombok.Data;

/**
 * @author sky-long
 * @data 2020/4/811:05
 * class description:
 */
@Data
public class ReturnDataModel <T> {

    /**
     * 消息
     */
    private String msg;

    /**
     * 错误代码
     */
    private int code;

    /**
     * 数据模型
     */
    private T data;

}
