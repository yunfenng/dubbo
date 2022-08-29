package com.lagou;

import com.lagou.bean.ConsumerComponent;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.io.IOException;

/**
 * @Author Jaa
 * @Date 2022/3/24 8:13
 * @Description
 */
public class AnnotationConsumerMain {

    public static void main(String[] args) throws IOException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConsumerConfiguration.class);
        context.start();
        ConsumerComponent service = context.getBean(ConsumerComponent.class);
        while (true) {
            System.in.read();
            String res = service.sayHello("world");
            System.out.println("result: " + res);
        }
    }

    @Configuration
    @PropertySource("classpath:/dubbo-consumer.properties")
    @ComponentScan(basePackages = "com.lagou.bean")
    @EnableDubbo
    static class ConsumerConfiguration {

    }
}
