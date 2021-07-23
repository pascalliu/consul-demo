package com.pascal.consul.server2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Server2Controller {
    @RequestMapping("/add")
    public int test(@RequestParam("num") int num) {
        System.out.println("this is server2 that calculates " + num);
        return ++num;
    }
}