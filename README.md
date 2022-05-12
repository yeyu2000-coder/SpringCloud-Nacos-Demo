Spring Cloud-version:2020.0.1

Spring Boot-version:2.4.2

Spring Cloud alibaba-version:2021.1

RestTemplate调用服务时，方法路径正确，却请求页面404问题：

高版本的Spring Cloud(2020)不再使用netflix，也就没有了netflix自带的ribbon

添加以下依赖

    <dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-loadbalancer</artifactId>
    <version>3.0.3</version>
    </dependency>

