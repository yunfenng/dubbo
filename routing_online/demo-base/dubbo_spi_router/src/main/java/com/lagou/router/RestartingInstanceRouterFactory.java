package com.lagou.router;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Activate;
import org.apache.dubbo.rpc.cluster.Router;
import org.apache.dubbo.rpc.cluster.RouterFactory;

/**
 * @Author Jaa
 * @Date 2022/3/30 1:29
 * @Description
 */
@Activate
public class RestartingInstanceRouterFactory implements RouterFactory {
    @Override
    public Router getRouter(URL url) {
        return new RestartingInstanceRouter(url);
    }
}
