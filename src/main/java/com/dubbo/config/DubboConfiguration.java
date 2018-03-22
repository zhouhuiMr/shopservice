package com.dubbo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.RegistryConfig;

//@Configuration
public class DubboConfiguration {
	
//	@Bean
	public ApplicationConfig applictionConfig() {
		ApplicationConfig config = new ApplicationConfig();
		config.setName("shopservice");
		return config;
	}
	
//	@Bean
	public RegistryConfig registryConfig() {
		RegistryConfig config = new RegistryConfig();
		config.setAddress("zookeeper://192.168.31.102:2181");
		config.setClient("zkclient");
		return config;
	}
}
