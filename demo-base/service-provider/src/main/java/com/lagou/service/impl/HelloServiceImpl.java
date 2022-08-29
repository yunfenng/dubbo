package com.lagou.service.impl;

import com.lagou.service.HelloService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @Author Jaa
 * @Date 2022/3/23 16:43
 * @Description
 */
@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return "hello " + name;
    }
}
