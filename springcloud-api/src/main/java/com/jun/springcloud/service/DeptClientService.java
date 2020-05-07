package com.jun.springcloud.service;

import com.jun.springcloud.pojo.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Component
@FeignClient(value = "SPRINGCLOUD-PROVIDER-DEPT",fallbackFactory =DeptClientServiceFallbackFactory.class )
//@FeignClient("SPRINGCLOUD-PROVIDER-DEPT")
public interface DeptClientService {

    @GetMapping("/det/get/{id}")
    Dept queryById(long id);


    @GetMapping("/dept/list")
    List<Dept> queryAll();


    @PostMapping("/deptadd")
    boolean addDept(Dept dept);

}