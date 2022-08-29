package com.lagou;

import com.lagou.router.ReadyRestartInstances;

/**
 * @Author Jaa
 * @Date 2022/3/30 1:37
 * @Description
 */
public class ServerRestartMain {

    public static void main(String[] args) throws Exception {
        ReadyRestartInstances.create().addRestartingInstance("service-provider", "192.168.56.1");
    }
}
