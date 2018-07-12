package com.dmxiaoshen.a;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
/**
 * @ComponentScan  扫描包路径 包含spring注解的类都要加载进来
 * @MapperScan 扫描mybatis的接口层包路径
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan(basePackages = {"com.dmxiaoshen.a.dao"})
@ComponentScan({"com.dmxiaoshen"})
public class ServiceAApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceAApplication.class, args);
	}
}
