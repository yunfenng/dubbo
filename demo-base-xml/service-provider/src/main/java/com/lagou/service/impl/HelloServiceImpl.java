package com.lagou.service.impl;

import com.lagou.service.HelloService;

import java.util.concurrent.TimeUnit;

/**
 * @Author Jaa
 * @Date 2022/3/25 15:22
 * @Description
 */
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Hello " + name;
    }
}
