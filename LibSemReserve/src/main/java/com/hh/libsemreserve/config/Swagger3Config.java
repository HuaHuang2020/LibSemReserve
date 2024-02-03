package com.hh.libsemreserve.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class Swagger3Config {
    @Bean
    public Docket createRestApi(Environment environment) {
//        // 设置要显示swagger的环境
//        Profiles of = Profiles.of("dev", "test");
//        // 判断当前是否处于该环境
//        boolean flag = environment.acceptsProfiles(of);
        return new Docket(DocumentationType.OAS_30)
                .apiInfo(apiInfo())
                // 通过 enable() 接收决定是否要显示
//                .enable()
                // 通过.select()方法，去配置扫描接口
                .select()
                // RequestHandlerSelectors 配置扫描接口的具体方式
                .apis(RequestHandlerSelectors.basePackage("com.hh.libsemreserve.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                //页面标题
                .title("高校图书馆研讨室预约系统API接口文档")
                //创建人
                .contact(new Contact("黄华", "https://github.com/HuaHuang2020",
                        "hh18.work@Gmail.com"))
                //版本号
                .version("1.0")
                //描述
                .description("系统API")
                .build();
    }
}
