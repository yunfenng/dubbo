package com.lagou.bean;

import com.lagou.service.HelloService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;

/**
 * @Author Jaa
 * @Date 2022/3/24 7:53
 * @Description
 */
@Component
public class ConsumerComponent {

    @Reference
    private HelloService helloService;

    public String sayHello(String name) {
        return helloService.sayHello(name);
    }
}
