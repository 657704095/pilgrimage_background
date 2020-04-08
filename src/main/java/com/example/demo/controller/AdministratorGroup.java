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
 * @data 2020/4/8 14:05
 * class description:
 */
@RestController
@RequestMapping("/transformInterface")
@Api(value = "轮播Api",tags="轮播Api增删该查询")
@Slf4j
public class AdministratorGroup {


    @PostMapping("/modification")
    @ApiOperation(value = "审核接口",notes = "审核接口",httpMethod = "POST")
    public int modification(@ApiParam(value = "id", required = true)int id,
                            @ApiParam(value = "待审核，1已审核，2不通过", required = true)int state){
        return 0;
    }

    @GetMapping("/findById")
    @ApiOperation(value = "查询接口",notes = "查询接口",httpMethod = "GET")
    public ReturnDataModel findById(@ApiParam(value = "id", required = true)int id){
        return null;
    }

    @PostMapping("/findByTitleAndBeginTimeAndEndTime")
    @ApiOperation(value = "查询列表接口",notes = "查询列表接口",httpMethod = "POST")
    public List<ReturnDataModel> findByTitleAndBeginTimeAndEndTime(@ApiParam(value = "标题", required = true)String title,
                                                                   @ApiParam(value = "团名称", required = true) String groupName,
                                                                   @ApiParam(value = "联系人员信息", required = true) String memberId,
                                                                   @ApiParam(value = "导游人员id", required = true) String tourId,
                                                                   @ApiParam(value = "司机id", required = true) String driverId,
                                                                   @ApiParam(value = "电话", required = true) String tel,
                                                                   @ApiParam(value = "车牌号", required = true) String licensePlateNumber,
                                                                   @ApiParam(value = "开始显示", required = true) Date beginTime,
                                                                   @ApiParam(value = "结束时间", required = true) Date endTime
                                                                   ){

        return null;
    }
}
