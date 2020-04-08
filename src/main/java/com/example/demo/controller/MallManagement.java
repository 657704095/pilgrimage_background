package com.example.demo.controller;

import com.example.demo.dto.ReturnDataModel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * @author sky-long
 * @data 2020/4/811:52
 * class description:
 */
@RestController
@RequestMapping("/mallManagement")
@Api(value = "商城管理Api",tags="商城管理Api增删该查询")
@Slf4j
public class MallManagement {


    @PostMapping("/add")
    @ApiOperation(value = "添加接口",notes = "添加接口",httpMethod = "POST")
    public int add(@ApiParam(value = "商品图片url", required = true)String commodityUrl,
                   @ApiParam(value = "商品名称", required = true)String name,
                   @ApiParam(value = "商品介绍", required = true)String intro,
                   @ApiParam(value = "价格", required = true)double price,
                   @ApiParam(value = "html", required = true)String html,
                   @ApiParam(value = "顺序", required = true)String order,
                   @ApiParam(value = "上下架标签", required = true)String tag,
                   @ApiParam(value = "货号", required = true)String artNo){
        return 0;
    }

    @PostMapping("/modification")
    @ApiOperation(value = "修改接口",notes = "修改接口",httpMethod = "POST")
    public int modification(@ApiParam(value = "商品图片url", required = true)String commodityUrl,
                            @ApiParam(value = "商品名称", required = true)String name,
                            @ApiParam(value = "商品介绍", required = true)String intro,
                            @ApiParam(value = "价格", required = true)double price,
                            @ApiParam(value = "html", required = true)String html,
                            @ApiParam(value = "顺序", required = true)String order,
                            @ApiParam(value = "上下架标签", required = true)String tag,
                            @ApiParam(value = "货号", required = true)String artNo){
        return 0;
    }

    @PostMapping("/del")
    @ApiOperation(value = "删除接口",notes = "删除接口",httpMethod = "POST")
    public int del(@ApiParam(value = "id", required = true)int id){
        return 0;
    }

    @GetMapping("/findById")
    @ApiOperation(value = "查询接口",notes = "查询接口",httpMethod = "GET")
    public ReturnDataModel findById(@ApiParam(value = "id", required = true)int id){
        return null;
    }

    @PostMapping("/findByTitleAndBeginTimeAndEndTime")
    @ApiOperation(value = "查询列表接口",notes = "查询列表接口",httpMethod = "POST")
    public List<ReturnDataModel> findByTitleAndBeginTimeAndEndTime(@ApiParam(value = "商品名称", required = true)String name,
                                                                   @ApiParam(value = "价格最小值", required = true)double priceMin,
                                                                   @ApiParam(value = "价格最大值", required = true)double priceMax,
                                                                   @ApiParam(value = "开始时间", required = true) Date beginTime,
                                                                   @ApiParam(value = "结束时间", required = true) Date endTime){

        return null;
    }
}
