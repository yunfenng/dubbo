package com.lagou.service.impl;

import com.lagou.service.HelloService;

/**
 * @Author Jaa
 * @Date 2022/3/26 16:57
 * @Description
 */
public class DogHelloService implements HelloService {
    @Override
    public String sayHello() {
        return "wang wang ~";
    }
}
