package com.idwxy.clock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        // 启动内嵌的 Tomcat，并初始化 Spring 环境及其组件
        SpringApplication.run(Application.class, args);
    }
}
