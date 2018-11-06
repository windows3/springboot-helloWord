package com.windows3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//@ComponentScan("com.windows3") 单包
//@EnableAutoConfiguration 和扫包一起用
//@ComponentScan(basePackages = {"com.windows3.controller","com.windows3.service"})  扫多包
@SpringBootApplication
public class HelloWordApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWordApplication.class, args);
	}
}
