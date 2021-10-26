package com.haohua.controller;

import com.haohua.pojo.Dept;
import com.haohua.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/dept")
@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @GetMapping("/get/{id}")
    @HystrixCommand(fallbackMethod = "hystrixGet")
    public Dept get(@PathVariable Long id){
        Dept dept = deptService.queryById(id);
        if(dept==null){
            throw new RuntimeException("id=>"+id+"，不存在该用户，或者信息无法找到");
        }
        return dept;
    }

    // 备选方案
    public Dept hystrixGet(@PathVariable Long id){
        Dept dept = new Dept();
        dept.setDeptno(id);
        dept.setDname("id=>"+id+"，不存在该用户，或者信息无法找到（Hystrix）");
        dept.setDb_source("no this database in MYSQL");
        return dept;
    }

}
