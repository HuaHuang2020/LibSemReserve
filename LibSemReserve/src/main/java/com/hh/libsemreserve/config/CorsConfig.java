package com.hh.libsemreserve.config;

/**
 * @Author HH
 * @Date 2024/3/10 16:13
 */
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration // 一定不要忽略此注解
@CrossOrigin(origins = "http://localhost:8081/",allowCredentials = "true")
public class CorsConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // 所有接口
                .allowedOrigins("http://localhost:8081") // 前端服务器地址
                .allowCredentials(true) // 是否发送 Cookie
                .allowedMethods("GET", "POST", "PUT", "DELETE") // 支持方法
                .allowedHeaders("*")
                .exposedHeaders("*")
                .maxAge(3600); // 预检请求的有效期;

    }
}
