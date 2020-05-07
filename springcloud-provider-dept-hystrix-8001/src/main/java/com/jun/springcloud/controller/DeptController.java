package com.jun.springcloud.controller;

import com.jun.springcloud.pojo.Dept;
import com.jun.springcloud.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DeptController {
    @Autowired
    private DeptService deptService;

    @GetMapping("/dept/get/{id}")
    @HystrixCommand(fallbackMethod = "hystrixGet")  //Hystrix
    public Dept get(@PathVariable("id") long id) {

        Dept dept = deptService.queryId(id);

        if (dept == null) {
            throw new RuntimeException("id=>" + id + ".不存在该用户，或无法访问!");
        }

        return dept;
    }

    /**
     * 备选方未能
     * @param id
     * @return
     */
    public Dept hystrixGet(@PathVariable("id") long id) {
        return new Dept()
                .setDeptno(id)
                .setDname("id=>" + id + ".不存在该用户，为null")
                .setDb_source("no database");
    }

}
