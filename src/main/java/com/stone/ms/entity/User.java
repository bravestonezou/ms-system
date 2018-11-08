package com.stone.ms.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @author zou.shiyong
 * @Description
 * @date 2018/11/1 10:17
 * @Email zou.shiyong@frontsurf.com
 */
@Data
public class User {
    /**
     * 用户Id
     */
    @ApiModelProperty(value = "用户Id",dataType = "int",example = "1")
    private int id;
    /**
     * 用户名
     */
    @ApiModelProperty(value = "用户名")
    private String username;
    /**
     * 年龄
     */
    @ApiModelProperty(value = "年龄")
    private int age;
    /**
     * 创建日期
     */
    @ApiModelProperty(value = "创建日期")
    private Date ctm;
}
