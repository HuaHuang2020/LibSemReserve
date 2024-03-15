package com.hh.libsemreserve;

import cn.dev33.satoken.SaManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author HH
 * @Date 2024/2/8 13:43
 */

@SpringBootApplication
public class SaTokenDemoApplication{
    public static void main(String[] args) {
        SpringApplication.run(SaTokenDemoApplication.class, args);
        System.out.println("启动成功，Sa-Token 配置如下：" + SaManager.getConfig());
    }
}
