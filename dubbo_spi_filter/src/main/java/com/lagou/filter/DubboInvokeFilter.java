package com.lagou.filter;

import org.apache.dubbo.common.constants.CommonConstants;
import org.apache.dubbo.common.extension.Activate;
import org.apache.dubbo.rpc.*;

/**
 * @Author Jaa
 * @Date 2022/3/26 22:53
 * @Description
 */
@Activate(group = {CommonConstants.CONSUMER, CommonConstants.PROVIDER})
public class DubboInvokeFilter implements Filter {
    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        long startTime = System.currentTimeMillis();

        try {
            return invoker.invoke(invocation);
        } finally {
            System.out.println("invoke time: " + (System.currentTimeMillis() - startTime) + "毫秒");
        }
    }
}
