package com.jun.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author 28591227@qq.com
 * @create 2020-02-25 12:45
 **/
@SpringBootApplication
@EnableEurekaServer
public class EurekaService_Config_7001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaService_Config_7001.class, args);
    }

}
