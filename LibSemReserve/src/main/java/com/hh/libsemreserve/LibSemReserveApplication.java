package com.hh.libsemreserve;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;

@SpringBootApplication
@EnableOpenApi
public class LibSemReserveApplication {

    public static void main(String[] args) {
        SpringApplication.run(LibSemReserveApplication.class, args);
    }

}
