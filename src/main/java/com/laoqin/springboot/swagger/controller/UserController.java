package com.laoqin.springboot.swagger.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author QinLing
 * @Date 2019/10/24 14:42
 **/
@Slf4j
@RestController("/user")
@Api("用户相关")
public class UserController {

    @ApiOperation("查询用户-根据id")
    @GetMapping("/{id}/get")
    public String getUserById(@PathVariable Integer id){
        return "xxx";
    }

    @ApiOperation("删除用户-根据id")
    @DeleteMapping("/{id}/delete")
    public String deleteUserById(@PathVariable Integer id){
        return "xxx";
    }
}
