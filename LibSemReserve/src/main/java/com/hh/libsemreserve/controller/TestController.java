package com.hh.libsemreserve.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author HH
 * @Date 2024/1/30 16:48
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @RequestMapping("")
    public String test1(){
        return "oh yes";
    }
}
