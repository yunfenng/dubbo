package com.lagou.service;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Adaptive;
import org.apache.dubbo.common.extension.SPI;

/**
 * @Author Jaa
 * @Date 2022/3/26 21:47
 * @Description
 */
@SPI("dog")
public interface HelloService {
    String sayHello();

    @Adaptive
    String sayHello(URL url);

}
