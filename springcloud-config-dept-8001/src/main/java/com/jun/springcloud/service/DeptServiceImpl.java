package com.jun.springcloud.service;

import com.jun.springcloud.mapper.DeptDao;
import com.xiyao.springcloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 28591227@qq.com
 * @create 2020-02-21 17:27
 **/
@Service
public class DeptServiceImpl implements  DeptService {

    @Autowired
    private DeptDao deptDao;

    @Override
    public boolean addDept(Dept dept) {
        return deptDao.addDept(dept);
    }

    @Override
    public Dept queryId(Long id) {
        return deptDao.queryId(id);
    }

    @Override
    public List<Dept> queryAll() {
        return deptDao.queryAll();
    }
}
