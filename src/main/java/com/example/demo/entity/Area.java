package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * 区域
 *
 * @author Silas
 * @email tsh721@126.com
 * @date 2019-07-22 18:04:24
 */
@TableName("sys_area")
public class Area implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId
    private Long id;
    /**
     * 区域Name
     */
    private String name;
    /**
     * 区域编码
     */
    private String code;
    /**
     * 区域级别: 1->国家;2->州省级;3->市级;4->区县级;
     */
    /**
     * 上级区域(国家的上级区域为0)
     */
    private Long parentId;
    /**
     * 分支列表
     */
    private String ancestors;
    /**
     * Delete标志: false->正常;true->已Delete;
     */
    @TableLogic
    @TableField(value = "is_deleted", fill = FieldFill.INSERT)
    private Boolean deleted;

    /**
     * 设置：ID
     *
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取：ID
     *
     * @return
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置：区域Name
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取：区域Name
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * 设置：区域编码
     *
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 获取：区域编码
     *
     * @return
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置：区域级别: 1->国家;2->州省级;3->市级;4->区县级;
     *
     * @param areaType
     */


    /**
     * 获取：区域级别: 1->国家;2->州省级;3->市级;4->区县级;
     *
     * @return
     */


    /**
     * 设置：上级区域(国家的上级区域为0)
     *
     * @param parentId
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取：上级区域(国家的上级区域为0)
     *
     * @return
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * 设置：分支列表
     *
     * @param ancestors
     */
    public void setAncestors(String ancestors) {
        this.ancestors = ancestors;
    }

    /**
     * 获取：分支列表
     *
     * @return
     */
    public String getAncestors() {
        return ancestors;
    }

    /**
     * 设置：Delete标志: false->正常;true->已Delete;
     *
     * @param deleted
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    /**
     * 获取：Delete标志: false->正常;true->已Delete;
     *
     * @return
     */
    public Boolean getDeleted() {
        return deleted;
    }

}
