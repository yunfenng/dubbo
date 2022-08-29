package com.lagou.test;

import com.lagou.service.HelloService;

import java.util.ServiceLoader;

/**
 * @Author Jaa
 * @Date 2022/3/26 16:55
 * @Description
 */
public class JavaSpiMain {

    public static void main(String[] args) {
        final ServiceLoader<HelloService> helloServices = ServiceLoader.load(HelloService.class);
        for (HelloService helloService : helloServices) {
            System.out.println(helloService.getClass().getName() +": "+ helloService.sayHello());
        }
    }
}
