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
 * @data 2020/4/8 14:15
 * class description:
 */
@RestController
@RequestMapping("/outreachWorkers")
@Api(value = "外联人员Api",tags="外联人员Api增删该查询")
@Slf4j
public class OutreachWorkers {

    @PostMapping("/add")
    @ApiOperation(value = "添加接口",notes = "添加接口",httpMethod = "POST")
    public int add(@ApiParam(value = "临时团名称", required = true)String groupName,
                   @ApiParam(value = "开始时间", required = true)String beginTime,
                   @ApiParam(value = "结束时间", required = true)String endTime,
                   @ApiParam(value = "联系人员信息id(开团人id)", required = true)String leadId,
                   @ApiParam(value = "添加日期", required = true)String addDate,
                   @ApiParam(value = "类型区分(分是否为正式或零时团)", required = true)String type){
        return 0;
    }

    @PostMapping("/modification")
    @ApiOperation(value = "修改接口",notes = "修改接口",httpMethod = "POST")
    public int modification(@ApiParam(value = "id", required = true)int id,
                            @ApiParam(value = "临时团名称", required = true)String groupName,
                            @ApiParam(value = "开始时间", required = true)String beginTime,
                            @ApiParam(value = "结束时间", required = true)String endTime,
                            @ApiParam(value = "联系人员信息id(开团人id)", required = true)String leadId,
                            @ApiParam(value = "添加日期", required = true)String addDate,
                            @ApiParam(value = "类型区分(分是否为正式或零时团)", required = true)String type){
        return 0;
    }

    @PostMapping("/applyFor")
    @ApiOperation(value = "申请为正式团接口",notes = "申请为正式团接口",httpMethod = "POST")
    public int applyFor(@ApiParam(value = "id", required = true)int id,
                        @ApiParam(value = "申请状态（1是2否申请为正式团）", required = true)String applyType){

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
    public List<ReturnDataModel> findByTitleAndBeginTimeAndEndTime(@ApiParam(value = "临时团名称", required = true)String groupName,
                                                                   @ApiParam(value = "开始时间", required = true) Date beginTime,
                                                                   @ApiParam(value = "结束时间", required = true) Date endTime){

        return null;
    }
}
