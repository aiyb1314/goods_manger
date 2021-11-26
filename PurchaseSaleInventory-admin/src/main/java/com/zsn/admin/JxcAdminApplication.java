package com.zsn.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zsn.admin.mapper")
public class JxcAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(JxcAdminApplication.class, args);
    }
}
