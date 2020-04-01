package com.example.demo.dao;


import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.example.demo.entity.Area;
import com.example.demo.entity.AreaVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 区域DAO
 *
 * @author Silas
 * @email tsh721@126.com
 * @date 2019-07-22 18:04:24
 */
public interface AreaDAO extends BaseMapper<Area> {

    List<AreaVO> selectVOList(@Param(Constants.WRAPPER) Wrapper<Area> wrapper);

}
