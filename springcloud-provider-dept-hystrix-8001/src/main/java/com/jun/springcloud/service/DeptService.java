package com.jun.springcloud.service;

import com.jun.springcloud.pojo.Dept;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DeptService {
    boolean addDept(Dept dept);

    Dept queryId(Long id);

    List<Dept> queryAll();
}
