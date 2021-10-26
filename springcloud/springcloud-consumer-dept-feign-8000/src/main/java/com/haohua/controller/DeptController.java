package com.haohua.controller;

import com.haohua.pojo.Dept;
import com.haohua.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/consumer")
@RestController
public class DeptController {

    @Autowired
    private DeptClientService deptClientService;    // 在公共模块springcloud-api中

    @RequestMapping("/dept/add")
    public boolean add(Dept dept){
        return this.deptClientService.addDept(dept);
    }

    @RequestMapping("/dept/get/{id}")
    public Dept get(@PathVariable Long id){
        return deptClientService.queryById(id);
    }

    @RequestMapping("/dept/list")
    public List<Dept> queryAll(){
        return deptClientService.queryAll();
    }
}
