package com.lagou;

import com.lagou.bean.ConsumerComponent;
import com.lagou.service.HelloService;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.apache.dubbo.rpc.RpcContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.concurrent.Future;


public class XMLConsumerMain {
    public static void main(String[] args) throws IOException, InterruptedException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo-consumer.xml");
        HelloService service = context.getBean("helloService", HelloService.class);

        while (true) {
            System.in.read();
            try {
                String hello = service.sayHello("world", 100);
                System.out.println("result: " + hello);
                // 利用future模式获取
                Future<Object> future = RpcContext.getContext().getFuture();
                System.out.println("future result: " + future.get());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Configuration
    @PropertySource("classpath:/dubbo-consumer.properties")
    //@EnableDubbo(scanBasePackages = "com.lagou.bean")
    @ComponentScan("com.lagou.bean")
    @EnableDubbo
    static class ConsumerConfiguration {

    }
}
