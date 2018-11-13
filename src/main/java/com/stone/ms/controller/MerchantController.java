package com.stone.ms.controller;

import com.stone.ms.entity.Merchant;
import com.stone.ms.service.MerchantService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author zou.shiyong
 * @Description
 * @date 2018/11/10 22:19
 * @Email zou.shiyong@frontsurf.com
 */
@Controller
@RequestMapping(value = "merchant")
@Api(value = "商家模块")
@Log
public class MerchantController {

    @Autowired
    MerchantService merchantService;

    /**
     * 跳转到新增页面
     * @return
     */
    @ApiIgnore
    @RequestMapping(value = "toadd", method = RequestMethod.GET)
    public String toadd(){
        log.info("请求新增商家页面");
        return "merchant/add";
    }

    /**
     * 添加商家
     * @param merchant
     */
    @ApiOperation(value="添加商家", notes="根据merchant对象添加商家")
    @ApiImplicitParam(name = "merchant", value = "商家实体", required = true, dataType = "Merchant")
    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String add(Merchant merchant){
        merchantService.insert(merchant);
        log.info("新增成功："+merchant);
        return "redirect:querybyvo";
    }

    /**
     * 跳转到更新页面
     * @param request
     * @param id
     * @return
     */
    @ApiIgnore
    @RequestMapping(value = "toupdate", method = RequestMethod.GET)
    public String toupdate(HttpServletRequest request, int id){
        Merchant merchant = merchantService.findById(id);
        request.setAttribute("msmerchant", merchant);
        log.info("请求更新商家信息页面");
        return "merchant/update";
    }

    /**
     * 更新商家信息
     * @param merchant
     */
    @ApiOperation(value="更新商家信息", notes="根据商家的id来更新商家信息")
    @ApiImplicitParams({
           @ApiImplicitParam(name = "merchant", value = "商家实体merchant", required = true, dataType = "Merchant")
    })
    @RequestMapping(value = "update", method = RequestMethod.POST)
    public String update(Merchant merchant){
        merchantService.update(merchant);
        log.info("商家信息更新成功："+merchant);
        return "redirect:querybyvo";
    }

    /**
     * 删除商家信息
     * @param id
     */
    @ApiOperation(value="删除商家信息", notes="根据id删除商家信息")
    @ApiImplicitParam(name = "id", value = "商家ID", required = true, dataType = "Long", paramType = "path")
    @RequestMapping(value = "del", method = RequestMethod.GET)
    public String del(int id){
        merchantService.deleteById(id);
        log.info("商家删除成功");
        return "redirect:querybyvo";
    }

    /**
     * 根据商家id获取商家信息
     * @param request
     * @param id
     * @return
     */
    @ApiOperation(value="获取商家信息", notes="根据id获取商家信息")
    @ApiImplicitParam(name = "id", value = "商家ID", required = true, dataType = "Integer", paramType = "path")
    @RequestMapping(value = "querybyid", method = RequestMethod.GET)
    public String querybyid(HttpServletRequest request,int id){

        log.info("根据商家id获取商家信息");
        Merchant msmerchant = merchantService.findById(id);
        request.setAttribute("msmerchant", msmerchant);
        return "merchant/view";
    }

    /**
     * 获取商家列表
     * @param request
     * @return
     */
    @ApiOperation(value="获取商家列表", notes="获取商家列表")
    @RequestMapping(value = "querybyvo", method = RequestMethod.GET)
    public String querybyvo(HttpServletRequest request){
        log.info("获取商家列表");
        List<Merchant> list = merchantService.findAll();
        request.setAttribute("msmerchantlist", list);
        return "merchant/list";
    }

}