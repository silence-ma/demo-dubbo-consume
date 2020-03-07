package com.ustc.demo.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ustc.demo.provider.DemoService;

public class Consumer {
	public static void main(String[] args) throws Exception {
	        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"META-INF/spring/dubbo-demo-consumer.xml"});
	        context.start();
	        DemoService demoService = (DemoService)context.getBean("demoService"); // 获取远程服务代理
	        String hello = demoService.sayHello("mjj"); // 执行远程方法
	        System.out.println( hello ); // 显示调用结果
	    }
}

