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
 * @data 2020/4/813:20
 * class description:
 */
@RestController
@RequestMapping("/transformInterface")
@Api(value = "朝圣景点Api",tags="朝圣景点Api增删该查询")
@Slf4j
public class PilgrimageSites {


    @PostMapping("/add")
    @ApiOperation(value = "添加接口",notes = "添加接口",httpMethod = "POST")
    public int add(@ApiParam(value = "标题", required = true)String title,
                   @ApiParam(value = "缩略图url", required = true)String imgUrl,
                   @ApiParam(value = "图片/视频", required = true)String type,
                   @ApiParam(value = "Html介绍", required = true)String html,
                   @ApiParam(value = "顺序", required = true)String order){
        return 0;
    }

    @PostMapping("/modification")
    @ApiOperation(value = "修改接口",notes = "修改接口",httpMethod = "POST")
    public int modification(@ApiParam(value = "id", required = true)int id,
                            @ApiParam(value = "标题", required = true)String title,
                            @ApiParam(value = "缩略图url", required = true)String imgUrl,
                            @ApiParam(value = "图片/视频", required = true)String type,
                            @ApiParam(value = "Html介绍", required = true)String html,
                            @ApiParam(value = "顺序", required = true)String order){
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
    public List<ReturnDataModel> findByTitleAndBeginTimeAndEndTime(@ApiParam(value = "标题", required = true)String title){
        return null;
    }

}
