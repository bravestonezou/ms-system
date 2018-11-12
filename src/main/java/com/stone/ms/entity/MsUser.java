package com.stone.ms.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

/**
 * @author zou.shiyong
 * @Description
 * @date 2018/11/12 20:30
 * @Email zou.shiyong@frontsurf.com
 */
@Data
@ToString
public class MsUser {

    /**
     * 主键
     */
    @ApiModelProperty(value = "主键",dataType = "int")
    private int id;
    @ApiModelProperty(value = "用户名",dataType = "string")
    private String username;
    @ApiModelProperty(value = "用户账号",dataType = "string")
    private String useraccount;
    @ApiModelProperty(value = "用户密码",dataType = "string")
    private String userpassword;
    @ApiModelProperty(value = "用户性别",dataType = "int")
    private int usersex;
    @ApiModelProperty(value = "用户年龄",dataType = "int")
    private int userage;
    @ApiModelProperty(value = "用户地址",dataType = "string")
    private String useraddress;
    @ApiModelProperty(value = "用户邮箱",dataType = "string")
    private String useremail;


}
