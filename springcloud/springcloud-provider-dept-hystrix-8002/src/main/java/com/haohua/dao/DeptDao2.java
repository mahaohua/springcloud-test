package com.haohua.dao;

import com.haohua.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface DeptDao2 {

    boolean addDept2(Dept dept);

    Dept queryById2(Long id);

    List<Dept> queryAll2();

}
