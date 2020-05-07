package com.jun.springcloud;

import com.jun.springcloud.myRule.JunRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient
//在微务启动时候就能去加载我们自己定义Ribbon类,不用这个的话，默认是轮询访问
@RibbonClient(name="SPRINGCLOUD-PROVIDER-DEPT",configuration = JunRule.class)
public class DeptConsumer_80 {
    public static void main(String[]  args) {
        SpringApplication.run(DeptConsumer_80.class,args);
    }
}
