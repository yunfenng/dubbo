package com.lagou.router;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.rpc.Invocation;
import org.apache.dubbo.rpc.Invoker;
import org.apache.dubbo.rpc.RpcException;
import org.apache.dubbo.rpc.cluster.Router;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author Jaa
 * @Date 2022/3/30 1:23
 * @Description
 */
public class RestartingInstanceRouter implements Router {
    private final ReadyRestartInstances instances;
    private final URL url;

    public RestartingInstanceRouter(URL url) {
        this.url = url;
        this.instances = ReadyRestartInstances.create();
    }

    @Override
    public URL getUrl() {
        return url;
    }

    @Override
    public <T> List<Invoker<T>> route(List<Invoker<T>> invokers, URL url, Invocation invocation) throws RpcException {
        // 如果没有在重启列表中，才会加入后续的调用列表
        return invokers.stream().filter(i -> !instances.hasRestartingInstance(i.getUrl().getParameter("remote.application"), i.getUrl().getIp()))
                .collect(Collectors.toList());
    }

    @Override
    public boolean isRuntime() {
        return false;
    }

    @Override
    public boolean isForce() {
        return false;
    }

    @Override
    public int getPriority() {
        return 0;
    }
}
