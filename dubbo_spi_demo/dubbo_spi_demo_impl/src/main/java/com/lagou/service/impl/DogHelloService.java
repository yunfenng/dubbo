package com.lagou.service.impl;

import com.lagou.service.HelloService;
import org.apache.dubbo.common.URL;

/**
 * @Author Jaa
 * @Date 2022/3/26 21:56
 * @Description
 */
public class DogHelloService implements HelloService {
    @Override
    public String sayHello() {
        return "wang wang ~";
    }

    @Override
    public String sayHello(URL url) {
        return "wang url";
    }
}
