package com.haohua.controller;

import com.haohua.pojo.Dept;
import com.haohua.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/dept")
@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;
    @Autowired
    private DiscoveryClient client; // 获取一些配置信息，得到具体的微服务

    @PostMapping("/add")
    public boolean addDept (@RequestBody Dept dept){
        return deptService.addDept(dept);
    }

    @GetMapping("/get/{id}")
    public Dept getDept(@PathVariable("id") Long id){
        return deptService.queryById(id);
    }

    @GetMapping("/list")
    public List<Dept> getAll(){
        return deptService.queryAll();
    }

    @GetMapping("/discovery")
    public Object discovery(){
        // 获取微服务列表的清单
        List<String> services = client.getServices();
        System.out.println("discovery=>services："+services);

        // 得到一个具体的微服务信息，通过具体的微服务id，appllicationName
        List<ServiceInstance> instances = client.getInstances("springcloud-provider-dept");
            for (ServiceInstance instance : instances) {
                System.out.println(instance.getHost()+"\t"+instance.getPort()+"\t"+instance.getUri()+"\t"+instance.getServiceId());
            }
        return this.client;
    }

}
