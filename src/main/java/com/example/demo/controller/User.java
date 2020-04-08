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
 * @data 2020/4/813:50
 * class description:
 */
@RestController
@RequestMapping("/user")
@Api(value = "用户和管理员Api",tags="用户和管理员Api增删该查询")
@Slf4j
public class User {


    @PostMapping("/add")
    @ApiOperation(value = "添加接口",notes = "添加接口",httpMethod = "POST")
    public int add(@ApiParam(value = "电话做账号", required = true)String tel,
                   @ApiParam(value = "账号", required = false)String user,
                   @ApiParam(value = "真实姓名", required = true)String name,
                   @ApiParam(value = "昵称", required = false)String nickName,
                   @ApiParam(value = "1超级管理员,2外联人员,3导游,4普通用户(可以浏览，加入团后才能成为团员)", required = true)String type,
                   @ApiParam(value = "密码", required = true)String pwd,
                   @ApiParam(value = "备注", required = true)String remark){
        return 0;
    }

    @PostMapping("/modification")
    @ApiOperation(value = "修改接口",notes = "修改接口",httpMethod = "POST")
    public int modification(@ApiParam(value = "id", required = true)int id,
                            @ApiParam(value = "电话做账号", required = true)String tel,
                            @ApiParam(value = "账号", required = false)String user,
                            @ApiParam(value = "真实姓名", required = true)String name,
                            @ApiParam(value = "昵称", required = false)String nickName,
                            @ApiParam(value = "1超级管理员,2外联人员,3导游,4普通用户(可以浏览，加入团后才能成为团员)", required = true)String type,
                            @ApiParam(value = "密码", required = true)String pwd,
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
    public List<ReturnDataModel> findByTitleAndBeginTimeAndEndTime(@ApiParam(value = "电话做账号", required = true)String tel,
                                                                   @ApiParam(value = "账号", required = false)String user,
                                                                   @ApiParam(value = "真实姓名", required = true)String name,
                                                                   @ApiParam(value = "昵称", required = false)String nickName,
                                                                   @ApiParam(value = "1超级管理员,2外联人员,3导游,4普通用户(可以浏览，加入团后才能成为团员)", required = true)String type){

        return null;
    }
}
