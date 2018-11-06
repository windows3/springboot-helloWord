package com.windows3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@ComponentScan("com.windows3") 单包
//@EnableAutoConfiguration 和扫包一起用
//@EnableJpaRepositories("com.windows3.dao")   jpa扫包 dao
//@ComponentScan(basePackages = {"com.windows3.controller","com.windows3.service"})  扫多包
//@EntityScan("com.windows3.entity")  找po

@SpringBootApplication
public class HelloWordApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWordApplication.class, args);
	}
}
