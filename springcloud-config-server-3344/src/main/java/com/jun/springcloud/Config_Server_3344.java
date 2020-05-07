package com.jun.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author 28591227@qq.com
 * @create 2020-02-24 20:32
 **/

@SpringBootApplication
@EnableConfigServer //开启配置的服务
public class Config_Server_3344 {
    public static void main(String[] args) {
        SpringApplication.run(Config_Server_3344.class, args);
    }
}
