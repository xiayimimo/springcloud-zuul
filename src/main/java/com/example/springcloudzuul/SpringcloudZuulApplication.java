package com.example.springcloudzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
/**
 * @RefreshScope这个注解是当application.yml配置文件发生变化的时候，
 * 不需要手动的进行重启，调用localhost:8400/refresh,就会加载新的配置文件，
 * 当然正在访问的客户并不影响还是使用旧的配置文件，因为不是重启，后来的用户会使用新的配置文件。
 * 注意这块的刷新要用post请求。
 * @author luliang
 *
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
@RefreshScope
public class SpringcloudZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudZuulApplication.class, args);
	}

}

