package com.pascal.consul.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ClientController {

    int num = 0;

    @Autowired
    private LoadBalancerClient loadBalancer;

    @RequestMapping("/balance/service")
    public String balanceService() {
        return  loadBalancer.choose("service").getUri().toString();
    }

    @RequestMapping("/calculate")
    public int calculate() {
        ServiceInstance serviceInstance = loadBalancer.choose("service");
        num = new RestTemplate().getForObject(serviceInstance.getUri().toString() + "/add?num=" + num, Integer.class);
        return num;
    }

}
