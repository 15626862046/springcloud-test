package com.jun.springcloud.mapper;

import com.xiyao.springcloud.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 28591227@qq.com
 * @create 2020-02-21 17:01
 **/

@Mapper     //将dao交给spring管理    不用写mapper.xml了      自动注册一个接口实现类
@Repository //将dao类声明为bean
public interface DeptDao {

    boolean addDept(Dept dept);

    Dept queryId(Long id);

    List<Dept> queryAll();
}
