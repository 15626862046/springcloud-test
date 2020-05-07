package com.jun.springcloud.service;

import com.xiyao.springcloud.pojo.Dept;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 28591227@qq.com
 * @create 2020-02-21 17:02
 **/
@Service
public interface DeptService {
     boolean addDept(Dept dept);

     Dept queryId(Long id);

     List<Dept> queryAll();
}
