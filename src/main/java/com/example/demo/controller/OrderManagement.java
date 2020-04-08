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
 * @data 2020/4/811:59
 * class description:
 */
@RestController
@RequestMapping("/transformInterface")
@Api(value = "订单管理Api",tags="订单管理Api增删该查询")
@Slf4j
public class OrderManagement {


    @PostMapping("/modification")
    @ApiOperation(value = "编辑接口",notes = "编辑接口",httpMethod = "POST")
    public int modification(@ApiParam(value = "发货状态", required = true)int shippingStatus,
                            @ApiParam(value = "物流号", required = true)String orderNumber,
                            @ApiParam(value = "订单编号", required = true)String logisticsNumber
                            ){
        return 0;
    }

    @PostMapping("/modification")
    @ApiOperation(value = "取消接口",notes = "取消接口",httpMethod = "POST")
    public int cancel(@ApiParam(value = "订单状态", required = true)int orderState,
                      @ApiParam(value = "订单编号", required = true)String logisticsNumber
                            ){
        return 0;
    }

    @GetMapping("/findById")
    @ApiOperation(value = "查询接口",notes = "查询接口",httpMethod = "GET")
    public ReturnDataModel findById(@ApiParam(value = "订单编号", required = true)String logisticsNumber){
        return null;
    }

    @PostMapping("/findByTitleAndBeginTimeAndEndTime")
    @ApiOperation(value = "查询列表接口",notes = "查询列表接口",httpMethod = "POST")
    public List<ReturnDataModel> findByTitleAndBeginTimeAndEndTime(@ApiParam(value = "订单编号", required = true)String logisticsNumber,
                                                                   @ApiParam(value = "用户名", required = true)String userName,
                                                                   @ApiParam(value = "电话", required = true)String tel,
                                                                   @ApiParam(value = "商品名", required = true)String commodityName){

        return null;
    }
}
