package com.order.service.impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.order.service.OrderService;

@Service(
        version = "1.0.0",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class OrderServiceImpl implements OrderService{

	public String test() {
		System.out.println("hello world");
		return "success";
	}

}
