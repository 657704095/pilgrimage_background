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
 * @data 2020/4/811:22
 * class description:
 */
@RestController
@RequestMapping("/transformInterface")
@Api(value = "朝圣视频Api",tags="朝圣视频Api增删该查询")
@Slf4j
public class PilgrimageVideo {

    @PostMapping("/add")
    @ApiOperation(value = "朝圣视频添加接口",notes = "朝圣视频添加接口",httpMethod = "POST")
    public int add(@ApiParam(value = "标题", required = true)String title,
                   @ApiParam(value = "缩略图url", required = true)String imgUrl,
                   @ApiParam(value = "Html介绍", required = true)String html,
                   @ApiParam(value = "顺序", required = true)String order){
        return 0;
    }

    @PostMapping("/modification")
    @ApiOperation(value = "朝圣视频修改接口",notes = "朝圣视频修改接口",httpMethod = "POST")
    public int modification(@ApiParam(value = "id", required = true)int id,
                            @ApiParam(value = "标题", required = true)String title,
                            @ApiParam(value = "缩略图url", required = true)String imgUrl,
                            @ApiParam(value = "Html介绍", required = true)String html,
                            @ApiParam(value = "顺序", required = true)String order){
        return 0;
    }

    @PostMapping("/del")
    @ApiOperation(value = "朝圣视频删除接口",notes = "朝圣视频删除接口",httpMethod = "POST")
    public int del(@ApiParam(value = "id", required = true)int id){
        return 0;
    }

    @GetMapping("/findById")
    @ApiOperation(value = "朝圣视频查询接口",notes = "朝圣视频查询接口",httpMethod = "GET")
    public ReturnDataModel findById(@ApiParam(value = "id", required = true)int id){
        return null;
    }

    @PostMapping("/findByTitleAndBeginTimeAndEndTime")
    @ApiOperation(value = "朝圣视频查询列表接口",notes = "朝圣视频查询列表接口",httpMethod = "POST")
    public List<ReturnDataModel> findByTitleAndBeginTimeAndEndTime(@ApiParam(value = "标题", required = true)String title,
                                                                   @ApiParam(value = "开始时间", required = true) Date beginTime,
                                                                   @ApiParam(value = "结束时间", required = true) Date endTime){

        return null;
    }

}
