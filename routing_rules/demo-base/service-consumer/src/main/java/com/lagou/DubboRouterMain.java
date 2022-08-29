package com.lagou;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;
import org.apache.dubbo.registry.Registry;
import org.apache.dubbo.registry.RegistryFactory;

/**
 * @Author Jaa
 * @Date 2022/3/29 18:26
 * @Description
 */
public class DubboRouterMain {

    public static void main(String[] args) {
        RegistryFactory registryFactory = ExtensionLoader.getExtensionLoader(RegistryFactory.class).getAdaptiveExtension();
        Registry registry = registryFactory.getRegistry(URL.valueOf("zookeeper://139.224.227.87:2181?timeout=10000"));
        registry.register(URL.valueOf("condition://0.0.0.0/com.lagou.service.HelloService?category=router&force=true&dynamic=true&rule="
                + URL.encode("=> host != 127.0.0.1")));
    }
}
