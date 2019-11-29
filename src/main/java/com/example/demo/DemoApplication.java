package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication
@EnableScheduling
public class DemoApplication {

	public static void main(String[] args) {
		Logger logger= LoggerFactory.getLogger(DemoApplication.class);
		logger.info("我们是一个测试的12");
		System.out.println("程序启动");
		SpringApplication.run(DemoApplication.class, args);
	}

}
