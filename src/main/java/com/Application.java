package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;

@SpringBootApplication
@DubboComponentScan(basePackages = { 
		"com.order.service.impl", 
		"com.manager.login.service.impl",
		"com.manager.client.service.impl" })
public class Application{

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
