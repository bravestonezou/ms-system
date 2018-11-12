package com.stone.ms.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

/**
 * @author zou.shiyong
 * @Description 商家实体类
 * @date 2018/11/10 21:10
 * @Email zou.shiyong@frontsurf.com
 */
@Data
@ToString
public class Merchant {

    /**
     * 主键
     */
    @ApiModelProperty(value = "主键",dataType = "int")
    private int id;
    /**
     * 商家姓名
     */
    @ApiModelProperty(value = "商家姓名",dataType = "string")
    private String merchantname;
    /**
     * 商家店铺名称
     */
    @ApiModelProperty(value = "商家店铺名称",dataType = "string")
    private String merchantshopname;
    /**
     * 商家账号
     */
    @ApiModelProperty(value = "商家账号",dataType = "string")
    private String merchantaccount;
    /**
     * 商家密码
     */
    @ApiModelProperty(value = "商家密码",dataType = "string")
    private String merchantpassword;
    /**
     * 商家经营范围
     */
    @ApiModelProperty(value = "商家经营范围",dataType = "string")
    private String merchantscope;
}
