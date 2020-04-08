package com.example.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sky-long
 * @data 2020/4/810:02
 * class description:
 * 轮播接口 访问地址http://localhost:8080/swagger-ui.html#/
 */
@RestController
@RequestMapping("/transformInterface")
@Api(value = "轮播Api",tags="轮播Api增删该查询")
public class TransformInterface {


    @PostMapping("/add")
    @ApiOperation(value = "轮播添加接口",notes = "轮播添加接口",httpMethod = "POST")
    public int add(@ApiParam(value = "标题", required = true)String title){
        return 0;
    }

}
