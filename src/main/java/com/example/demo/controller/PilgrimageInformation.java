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
 * @data 2020/4/811:17
 * class description:
 */
@RestController
@RequestMapping("/pilgrimageInformation")
@Api(value = "朝圣信息Api",tags="朝圣信息Api增删该查询")
@Slf4j
public class PilgrimageInformation {

    @PostMapping("/add")
    @ApiOperation(value = "朝圣信息添加接口",notes = "朝圣信息添加接口",httpMethod = "POST")
    public int add(@ApiParam(value = "标题", required = true)String title,
                   @ApiParam(value = "缩略图url", required = true)String imgUrl,
                   @ApiParam(value = "简介", required = true)String intro,
                   @ApiParam(value = "Html介绍", required = true)String html,
                   @ApiParam(value = "顺序", required = true)String order){
        return 0;
    }

    @PostMapping("/modification")
    @ApiOperation(value = "朝圣信息修改接口",notes = "朝圣信息修改接口",httpMethod = "POST")
    public int modification(@ApiParam(value = "id", required = true)int id,
                            @ApiParam(value = "标题", required = true)String title,
                            @ApiParam(value = "缩略图url", required = true)String imgUrl,
                            @ApiParam(value = "简介", required = true)String intro,
                            @ApiParam(value = "Html介绍", required = true)String html,
                            @ApiParam(value = "顺序", required = true)String order){
        return 0;
    }

    @PostMapping("/del")
    @ApiOperation(value = "朝圣信息删除接口",notes = "朝圣信息删除接口",httpMethod = "POST")
    public int del(@ApiParam(value = "id", required = true)int id){
        return 0;
    }

    @GetMapping("/findById")
    @ApiOperation(value = "朝圣信息查询接口",notes = "朝圣信息查询接口",httpMethod = "GET")
    public ReturnDataModel findById(@ApiParam(value = "id", required = true)int id){
        return null;
    }

    @PostMapping("/findByTitleAndBeginTimeAndEndTime")
    @ApiOperation(value = "朝圣信息查询列表接口",notes = "朝圣信息查询列表接口",httpMethod = "POST")
    public List<ReturnDataModel> findByTitleAndBeginTimeAndEndTime(@ApiParam(value = "标题", required = true)String title,
                                                                   @ApiParam(value = "开始时间", required = true) Date beginTime,
                                                                   @ApiParam(value = "结束时间", required = true) Date endTime){

        return null;
    }


}