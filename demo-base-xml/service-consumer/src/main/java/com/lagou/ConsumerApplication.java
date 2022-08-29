package com.lagou;

import com.lagou.service.HelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author Jaa
 * @Date 2022/3/25 16:42
 * @Description
 */
public class ConsumerApplication {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:dubbo-consumer.xml");
        // applicationContext.start();
        HelloService helloService = applicationContext.getBean("helloService", HelloService.class);
        String res = helloService.sayHello("world");
        System.out.println("result: " + res);
    }
}
