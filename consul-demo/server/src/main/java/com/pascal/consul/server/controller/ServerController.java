package com.pascal.consul.server.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServerController {
    @RequestMapping("/add")
    public int test(@RequestParam("num") int num) {
        System.out.println("this is server1 that calculates " + num);
        return ++num;
    }
}