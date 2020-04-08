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
 * @data 2020/4/8 14:29
 * class description:
 */
@RestController
@RequestMapping("/groupMembers")
@Api(value = "团成员Api",tags="团成员Api增删该查询")
@Slf4j
public class GroupMembers {


    @PostMapping("/add")
    @ApiOperation(value = "添加接口",notes = "添加接口",httpMethod = "POST")
    public int add(@ApiParam(value = "所属团id", required = true)String groupId,
                   @ApiParam(value = "用户电话（app上的注册账号）", required = true)String tel,
                   @ApiParam(value = "用户账号", required = true)String user,
                   @ApiParam(value = "用户姓名", required = true)String userName,
                   @ApiParam(value = "签证", required = true)String visaStatus,
                   @ApiParam(value = "性别", required = true)String gender,
                   @ApiParam(value = "出生年月", required = true)String birthday,
                   @ApiParam(value = "健康状况id", required = true)String physicalConditionId,
                   @ApiParam(value = "备注", required = true)String remark){
        return 0;
    }

    @PostMapping("/modification")
    @ApiOperation(value = "修改接口",notes = "修改接口",httpMethod = "POST")
    public int modification(@ApiParam(value = "id", required = true)int id,
                            @ApiParam(value = "所属团id", required = true)String groupId,
                            @ApiParam(value = "用户电话（app上的注册账号）", required = true)String tel,
                            @ApiParam(value = "用户账号", required = true)String user,
                            @ApiParam(value = "用户姓名", required = true)String userName,
                            @ApiParam(value = "签证", required = true)String visaStatus,
                            @ApiParam(value = "性别", required = true)String gender,
                            @ApiParam(value = "出生年月", required = true)String birthday,
                            @ApiParam(value = "健康状况id", required = true)String physicalConditionId,
                            @ApiParam(value = "备注", required = true)String remark){
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
    public List<ReturnDataModel> findByTitleAndBeginTimeAndEndTime(@ApiParam(value = "id", required = true)int id,
                                                                   @ApiParam(value = "所属团id", required = true)String groupId,
                                                                   @ApiParam(value = "用户电话（app上的注册账号）", required = true)String tel,
                                                                   @ApiParam(value = "用户账号", required = true)String user,
                                                                   @ApiParam(value = "用户姓名", required = true)String userName){

        return null;
    }

}
