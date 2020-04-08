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
 * @data 2020/4/813:34
 * class description:
 */
@RestController
@RequestMapping("/registrationList")
@Api(value = "报名列表Api",tags="报名列表Api增删该查询")
@Slf4j
public class RegistrationList {


    @PostMapping("/modification")
    @ApiOperation(value = "编辑接口",notes = "编辑接口",httpMethod = "POST")
    public int modification(@ApiParam(value = "id", required = true)int id,
                            @ApiParam(value = "用户id", required = true)int userId,
                            @ApiParam(value = "用户姓名", required = true)String userName,
                            @ApiParam(value = "用户电话", required = true)String tel,
                            @ApiParam(value = "线路名称", required = true)String lineName,
                            @ApiParam(value = "报名或注册时间", required = true)Date registrationTime,
                            @ApiParam(value = "价格", required = true)double price,
                            @ApiParam(value = "身份信息", required = true)double idCard){
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
    public List<ReturnDataModel> findByTitleAndBeginTimeAndEndTime(@ApiParam(value = "价格", required = true)double price,
                                                                   @ApiParam(value = "线路名称", required = true)String lineName,
                                                                   @ApiParam(value = "用户id", required = true)int userId,
                                                                   @ApiParam(value = "用户姓名", required = true)String userName,
                                                                   @ApiParam(value = "开始时间", required = true) Date beginTime,
                                                                   @ApiParam(value = "结束时间", required = true) Date endTime){

        return null;
    }
}
