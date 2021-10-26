package com.haohua.service.impl;

import com.haohua.dao.DeptDao2;
import com.haohua.pojo.Dept;
import com.haohua.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao2 deptDao;

    @Override
    public boolean addDept(Dept dept) {
        return deptDao.addDept2(dept);
    }

    @Override
    public Dept queryById(Long id) {
        return deptDao.queryById2(id);
    }

    @Override
    public List<Dept> queryAll() {
        return deptDao.queryAll2();
    }
}
