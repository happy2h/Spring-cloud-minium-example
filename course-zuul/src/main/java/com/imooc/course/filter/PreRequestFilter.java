package com.imooc.course.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

/**
 * 记录请求的时间
 */
@Component
public class PreRequestFilter extends ZuulFilter {
    @Override
    public String filterType() {
        // 过滤器类型
        return FilterConstants.PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        // 是否启用过滤器 - 业务的逻辑
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        // 核心业务处理逻辑代码
        // 获取到上下文
        RequestContext currentContext = RequestContext.getCurrentContext();
        currentContext.set("startTime", System.currentTimeMillis());
        System.out.println("过滤器已经记录时间");
        return null;
    }
}
