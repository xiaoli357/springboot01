package com.lxy.controller;

import com.lxy.component.MyDataSource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/hello")
@Slf4j
public class HelloController {

    @Resource
    private MyDataSource dataSource;

    @RequestMapping("/hello3")
    public String Hello1(){
        return "Hello,SpringBoot!";
    }

    @RequestMapping("/hello2")
    public MyDataSource Hello2(){
        log.info("请求进来了。。。");
        return dataSource;
    }
}
