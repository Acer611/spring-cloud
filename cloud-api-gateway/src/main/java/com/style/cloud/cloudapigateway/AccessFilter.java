
package com.style.cloud.cloudapigateway;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * 路由器设置
 * @Auth Gaofei
 * @Date 2018-07-12
 */
@Component
public class AccessFilter extends ZuulFilter {


    //filterType：过滤器的类型，它决定过滤器在请求的哪个生命周期中执行。这里定义为pre，代表会在请求被路由之前执行
    @Override
    public String filterType() {
        return "pre";
    }


    //过滤器的执行顺序。当请求在一个阶段中存在多个过滤器时，需要根据该方法返回的值来依次执行。
    @Override
    public int filterOrder() {
        return 0;
    }

    //判断该过滤器是否需要被执行。这里我们直接返回了true，因此该过滤器对所有请求都会生效。实际运用中我们可以利用该函数来指定过滤器的有效范围
    @Override
    public boolean shouldFilter() {
        return true;
    }


    /**
     * 过滤器的具体逻辑 ,这里我们通过ctx.setSendZuulResponse(false)令zuul过滤该请求，不对其进行路由，
     * 然后通过ctx.setResponseStatusCode(401)设置了其返回的错误码，当然我们也可以进一步优化我们的返回，
     * 比如，通过ctx.setResponseBody(body)对返回body内容进行编辑等。
     * @return
     * @throws ZuulException
     */
    @Override
    public Object run() throws ZuulException {

        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();

        System.out.println("send {} request to {}"+request.getMethod()+ request.getRequestURL().toString());

        Object accessToken = request.getParameter("accessToken");
        if(accessToken == null) {
            System.out.println("access token is empty");
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(401);
            ctx.setResponseBody("You don't have permission to access this URL");
            return null;
        }
        System.out.println("access token ok");
        return null;
    }
}

