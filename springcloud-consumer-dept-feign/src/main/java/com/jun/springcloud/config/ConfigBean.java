package com.jun.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {
    /**
     * //配置负载均衡实现RestTemplate ,Ribbon
     * IRule
     * AvailabilityFilteringRule:会先过滤掉 ，跳闸，访问故障的服务，对盛下的进行轮询
     * RandomRule:随机
     * RetryRule:先按照轮询，失败后再重试
     *
     * @return
     */
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }


}
