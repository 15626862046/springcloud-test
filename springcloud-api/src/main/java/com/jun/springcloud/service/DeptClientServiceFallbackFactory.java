package com.jun.springcloud.service;

import com.jun.springcloud.pojo.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory {

    @Override
    public DeptClientService create(Throwable throwable) {

        return new DeptClientService() {
            @Override
            public Dept queryById(long id) {
                return new Dept()
                        .setDeptno(id)
                        .setDb_source("id=>" + id + "没有对应的信息！；客户端提供了降级，这个服务现在关闭")
                        .setDb_source("no database ... 无数据；客户端提供了降级，这个服务现在关闭");
            }

            @Override
            public List<Dept> queryAll() {
                return null;
            }

            @Override
            public boolean addDept(Dept dept) {
                return false;
            }
        };
    }
}

