package com.stone.ms.controller;

import com.stone.ms.entity.MsProductInfo;
import com.stone.ms.service.MsProductInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import springfox.documentation.annotations.ApiIgnore;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author zou.shiyong
 * @Description
 * @date 2018/11/14 22:19
 * @Email zou.shiyong@frontsurf.com
 */
@Controller
@RequestMapping(value = "product")
@Api(value = "秒杀商品模块")
@Slf4j
public class MsProductInfoController {

    @Autowired
    private MsProductInfoService msProductInfoService;

    /**
     * 跳转到秒杀商品添加页面
     * @return
     */
    @ApiIgnore
    @RequestMapping(value="toApplymsproduct")
    public String toApplymsproduct(){
        return "product/applymsproduct";
    }

    /**
     * 添加秒杀商品
     * @param msProductInfo
     */
    @ApiOperation(value="添加秒杀商品", notes="添加秒杀商品")
    @ApiImplicitParam(name = "msProductInfo", value = "秒杀商品实体", required = true, dataType = "MsProductInfo")
    @RequestMapping(value="applymsproduct",method= RequestMethod.POST)
    public void applymsproduct(MsProductInfo msProductInfo){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        try {
            msProductInfo.setApplydate(new Date());
            msProductInfo.setAduitstatus(0);
            msProductInfo.setStarttime(sdf.parse(msProductInfo.getStarttimestr()));
            msProductInfo.setEndtime(sdf.parse(msProductInfo.getEndtimestr()));
            msProductInfoService.applyMsProduct(msProductInfo);
        } catch (ParseException e) {
            log.error("日期格式异常："+e);
        }
    }
}
