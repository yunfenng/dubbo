package com.lagou.service.impl;

import com.lagou.service.HelloService;

/**
 * @Author Jaa
 * @Date 2022/3/26 16:51
 * @Description
 */
public class HumanHelloService implements HelloService {
    @Override
    public String sayHello() {
        return "Hello 你好";
    }
}
