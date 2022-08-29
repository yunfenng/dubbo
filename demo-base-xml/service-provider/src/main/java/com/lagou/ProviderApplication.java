package com.lagou;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @Author Jaa
 * @Date 2022/3/25 16:18
 * @Description
 */
public class ProviderApplication {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:dubbo-provider.xml");
        applicationContext.start();
        System.in.read();
    }
}
