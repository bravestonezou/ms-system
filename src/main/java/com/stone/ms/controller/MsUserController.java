package com.stone.ms.controller;

import com.stone.ms.entity.MsUser;
import com.stone.ms.service.MsUserService;
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
 * @Description 用户控制类
 * @date 2018/11/12 21:20
 * @Email zou.shiyong@frontsurf.com
 */
@Controller
@RequestMapping(value = "msuser")
@Api(value = "系统用户模块")
@Log
public class MsUserController {

    @Autowired
    private MsUserService msUserService;

    /**
     * 跳转到新增页面
     * @return
     */
    @ApiIgnore
    @RequestMapping(value = "toadd", method = RequestMethod.GET)
    public String toadd(){
        log.info("请求新增用户页面");
        return "msuser/add";
    }

    /**
     * 添加用户
     * @param msUser
     */
    @ApiOperation(value="添加用户", notes="添加用户")
    @ApiImplicitParam(name = "msUser", value = "用户实体", required = true, dataType = "MsUser")
    @RequestMapping(value = "add", method = RequestMethod.POST)
    public void add(HttpServletRequest request,MsUser msUser){
        msUserService.insert(msUser);
        log.info("新增成功："+msUser);
        querybyvo(request);
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
        MsUser msUser = msUserService.findById(id);
        request.setAttribute("msUser", msUser);
        log.info("请求更新用户页面");
        return "msuser/update";
    }

    /**
     * 更新用户信息
     * @param msUser
     */
    @ApiOperation(value="更新用户信息", notes="更新用户信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "msUser", value = "用户实体", required = true, dataType = "MsUser")
    })
    @RequestMapping(value = "update", method = RequestMethod.POST)
    public void update(HttpServletRequest request,MsUser msUser){
        msUserService.update(msUser);
        log.info("用户信息更新成功："+msUser);
        querybyvo(request);
    }

    /**
     * 删除用户信息
     * @param id
     */
    @ApiOperation(value="删除用户信息", notes="根据id删除用户信息")
    @ApiImplicitParam(name = "id", value = "商家ID", required = true, dataType = "Long", paramType = "path")
    @RequestMapping(value = "del", method = RequestMethod.GET)
    public void del(HttpServletRequest request,int id){
        msUserService.deleteById(id);
        log.info("用户删除成功");
        querybyvo(request);
    }

    /**
     * 根据用户id获取用户信息
     * @param request
     * @param id
     * @return
     */
    @ApiOperation(value="根据用户id获取用户信息", notes="根据用户id获取用户信息")
    @ApiImplicitParam(name = "id", value = "用户id", required = true, dataType = "Integer")
    @RequestMapping(value = "querybyid", method = RequestMethod.GET)
    public String querybyid(HttpServletRequest request,int id){

        log.info("根据用户id获取用户信息");
        MsUser msUser = msUserService.findById(id);
        request.setAttribute("msUser", msUser);
        return "msuser/view";
    }

    /**
     * 获取用户列表
     * @param request
     * @return
     */
    @ApiOperation(value="获取用户列表", notes="获取用户列表")
    @RequestMapping(value = "querybyvo", method = RequestMethod.GET)
    public String querybyvo(HttpServletRequest request){
        log.info("获取用户列表");
        List<MsUser> list = msUserService.findAll();
        request.setAttribute("list", list);
        return "msuser/list";
    }
}
