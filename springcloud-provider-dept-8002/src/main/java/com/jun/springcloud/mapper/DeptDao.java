package com.jun.springcloud.mapper;

import com.jun.springcloud.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface DeptDao {
    boolean addDept(Dept dept);

    Dept queryId(Long id);

    List<Dept> queryAll();
}
