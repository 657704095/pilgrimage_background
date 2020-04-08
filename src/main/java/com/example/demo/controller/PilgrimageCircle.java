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
 * @data 2020/4/813:24
 * class description:
 */
@RestController
@RequestMapping("/transformInterface")
@Api(value = "朝圣圈Api",tags="朝圣圈Api增删该查询")
@Slf4j
public class PilgrimageCircle {


    @PostMapping("/modification")
    @ApiOperation(value = "审核接口",notes = "审核接口",httpMethod = "POST")
    public int modification(@ApiParam(value = "id", required = true)int id,
                            @ApiParam(value = "审核状态（1未通过、2待审核、3通过）", required = true)int audit){
        return 0;
    }

    @PostMapping("/del")
    @ApiOperation(value = "删除接口",notes = "删除接口",httpMethod = "POST")
    public int del(@ApiParam(value = "id", required = true)int id,
                   @ApiParam(value = "userId", required = true)int userId){
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
                                                                   @ApiParam(value = "userId", required = true)int userId,
                                                                   @ApiParam(value = "审核状态（1未通过、2待审核、3通过）", required = true)int audit){

        return null;
    }
}
