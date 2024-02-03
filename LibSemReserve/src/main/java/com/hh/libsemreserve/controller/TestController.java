package com.hh.libsemreserve.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author HH
 * @Date 2024/1/30 16:48
 */
@RestController
@Api(tags = "测试接口")
@RequestMapping("/test")
public class TestController {
    @GetMapping("")
    public String testwork(){
        return "oh yes";
    }
}
