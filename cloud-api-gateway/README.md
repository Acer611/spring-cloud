

由于Spring Cloud Zuul在整合了Eureka之后，  
具备默认的服务路由功能，即：当我们这里构建的api-gateway应用启动并注册到eureka之后，    
服务网关会发现上面我们启动的两个服务eureka-client和eureka-consumer，这时候Zuul就会创建两个路由规则。  
每个路由规则都包含两部分，一部分是外部请求的匹配规则，另一部分是路由的服务ID。  
针对当前示例的情况，Zuul会创建下面的两个路由规则：

转发到eureka-client服务的请求规则为：/eureka-client/**
转发到eureka-consumer服务的请求规则为：/eureka-consumer/**
最后，我们可以通过访问1101端口的服务网关来验证上述路由的正确性：
  
  
比如访问：http://localhost:4444/eureka-consumer/consumer/add  ，该请求将最终被路由到eureka-consumer的/dc接口上。  

http://localhost:4444/api-a/consumer/add   通过api-a 路由到eureka-consumer  类似nginx  

Zuul加入过滤器后必须满足过滤器的过滤条件才能通过请求，目前代码中是过滤请求中必须含有accessToken  
所以当访问上面的请求  http://localhost:4444/api-a/consumer/add  会提提示run方法中的示没有权限访问的提示  
只能加入accessToken的参数如下面的链接  
http://localhost:4444/api-a/consumer/add?accessToken=a

