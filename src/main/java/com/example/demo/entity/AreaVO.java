package com.example.demo.entity;

import io.swagger.annotations.ApiModelProperty;

/**
 * @author caochong
 * @date 2019/08/30
 */
public class AreaVO {
    @ApiModelProperty(value = "地区id")
    private Long districtId;
    @ApiModelProperty(value = "地区名称")
    private Long districtName;
    @ApiModelProperty(value = "地区编码")
    private Long districtCode;
    @ApiModelProperty(value = "城市id")
    private Long cityId;
    @ApiModelProperty(value = "城市名称")
    private Long cityName;
    @ApiModelProperty(value = "城市编码")
    private Long cityCode;
    @ApiModelProperty(value = "省份id")
    private Long provinceId;
    @ApiModelProperty(value = "省份名称")
    private Long provinceName;
    @ApiModelProperty(value = "省份编码")
    private Long provinceCode;
    @ApiModelProperty(value = "国家id")
    private Long countryId;
    @ApiModelProperty(value = "国家名称")
    private Long countryName;
    @ApiModelProperty(value = "国家编码")
    private Long countryCode;

    public Long getDistrictId() {
        return districtId;
    }

    public void setDistrictId(Long districtId) {
        this.districtId = districtId;
    }

    public Long getDistrictName() {
        return districtName;
    }

    public void setDistrictName(Long districtName) {
        this.districtName = districtName;
    }

    public Long getDistrictCode() {
        return districtCode;
    }

    public void setDistrictCode(Long districtCode) {
        this.districtCode = districtCode;
    }

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    public Long getCityName() {
        return cityName;
    }

    public void setCityName(Long cityName) {
        this.cityName = cityName;
    }

    public Long getCityCode() {
        return cityCode;
    }

    public void setCityCode(Long cityCode) {
        this.cityCode = cityCode;
    }

    public Long getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Long provinceId) {
        this.provinceId = provinceId;
    }

    public Long getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(Long provinceName) {
        this.provinceName = provinceName;
    }

    public Long getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(Long provinceCode) {
        this.provinceCode = provinceCode;
    }

    public Long getCountryId() {
        return countryId;
    }

    public void setCountryId(Long countryId) {
        this.countryId = countryId;
    }

    public Long getCountryName() {
        return countryName;
    }

    public void setCountryName(Long countryName) {
        this.countryName = countryName;
    }

    public Long getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(Long countryCode) {
        this.countryCode = countryCode;
    }
}
