package com.jun.springcloud.myRule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JunRule {
    @Bean
    public IRule myRule(){
        //return new JunRandomRule();
        return new RandomRule();
    }
}
