package com.stone.ms.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

import java.util.Date;

/**
 * @author zou.shiyong
 * @Description
 * @date 2018/11/14 20:52
 * @Email zou.shiyong@frontsurf.com
 */
@Data
@ToString
public class MsProductInfo {

    /**
     * 主键id
     */
    @ApiModelProperty(value = "主键id",dataType = "int")
    private int id;
    /**
     * 商品id
     */
    @ApiModelProperty(value = "商品id",dataType = "int")
    private int productid;
    /**
     * 标题
     */
    @ApiModelProperty(value = "标题",dataType = "string")
    private String producttitle;
    /**
     * 商品图片
     */
    @ApiModelProperty(value = "商品图片",dataType = "string")
    private String productpicture;
    /**
     * 原价格
     */
    @ApiModelProperty(value = "原价格",dataType = "int")
    private int originalprice;
    /**
     * 秒杀价格
     */
    @ApiModelProperty(value = "秒杀价格",dataType = "int")
    private int miaoshaprice;
    /**
     * 商家id
     */
    @ApiModelProperty(value = "主键id",dataType = "int")
    private int merchantid;
    /**
     *添加日期
     */
    private Date applydate;
    /**
     *审核日期
     */
    private Date auditdate;
    /**
     *审核状态
     */
    private int aduitstatus;
    /**
     *开始时间
     */
    private Date starttime;
    /**
     *开始时间
     */
    @ApiModelProperty(value = "开始时间",dataType = "string")
    private String starttimestr;
    /**
     *结束时间
     */
    private Date endtime;

    /**
     *结束时间
     */
    @ApiModelProperty(value = "结束时间",dataType = "string")
    private String endtimestr;

    /**
     *秒杀商品数
     */
    @ApiModelProperty(value = "秒杀商品数",dataType = "int")
    private int productcount;
    /**
     *剩余库存数
     */
    @ApiModelProperty(value = "剩余库存数",dataType = "int")
    private int stockcount;
    /**
     *描述
     */
    @ApiModelProperty(value = "描述",dataType = "string")
    private String description;
}
