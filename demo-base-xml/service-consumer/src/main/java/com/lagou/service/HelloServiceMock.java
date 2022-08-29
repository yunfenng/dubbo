package com.lagou.service;

/**
 * @Author Jaa
 * @Date 2022/3/26 1:56
 * @Description
 */
public class HelloServiceMock implements HelloService{
    @Override
    public String sayHello(String name) {
        return "Hello Mock";
    }
}
