package com.lagou.router;

import org.apache.curator.RetryPolicy;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.ExponentialBackoffRetry;

/**
 * @Author Jaa
 * @Date 2022/3/29 23:52
 * @Description
 */
public class ZookeeperClients {
    private final CuratorFramework client;
    private static ZookeeperClients INSTANCE;

    static {
        RetryPolicy retryPolicy = new ExponentialBackoffRetry(1000, 3);
        CuratorFramework client = CuratorFrameworkFactory.newClient("139.224.227.87:2181", retryPolicy);
        INSTANCE = new ZookeeperClients(client);
        client.start();
    }

    private ZookeeperClients(CuratorFramework client) {
        this.client = client;
    }

    public static CuratorFramework client() {
        return INSTANCE.client;
    }

}
