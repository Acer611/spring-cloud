# spring-cloud
spring cloud的学习练手工程
目前有三个工程  
eureka-service为注册中心  
eureka-client充当prvider的角色，注册到注册中心  
eureka-consumer充当consumer的角色 已注册到注册中心 
cloud-api-gateway   网关服务    
  
网关服务中加入swagger2可以抓取Provider和consumer的已有接口  
当四个服务都启动后，可以通过访问 http://localhost:4444/swagger-ui.html#/   
查看eureka-client和eureka-consumer的接口  
  
网关服务中已加入过滤器，访问时请务必加入参数accessstToken否侧将提示没有权限  
也可自行注释掉过滤器的代码运行 


springcloud 成功能列表

1.服务之间调用              ------------- 	DONE
2.分布式配置中心(spring config)----------   TODO  
3.服务器容错保护(hystrix)  --------------	DONE (高级功能待研究)
4.服务网关(Zuul)   			-------------   DONE  已实现简单路由和过滤器功能
5.消息驱动(RabbbitMQ)  		-------------   (Has some issue)
6.分布式服务跟踪()  		-------------	TODO


