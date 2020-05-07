package com.jun.springcloud;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

/**
 * @author 28591227@qq.com
 * @create 2020-02-25 14:13
 **/

@SpringBootApplication
@EnableEurekaClient  //自动注册到服务中
@EnableDiscoveryClient    //服务发现
public class DeptProvider_Config_8001 {

    public static void main(String[] args) {
        SpringApplication.run(DeptProvider_Config_8001.class, args);
    }

    //增加一个Servlet
    @Bean
    public ServletRegistrationBean hystrixMetricsStreamServlet() {
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(new HystrixMetricsStreamServlet());
        registrationBean.addUrlMappings("/actuator/hystrix.stream");
        return registrationBean;
    }
}
