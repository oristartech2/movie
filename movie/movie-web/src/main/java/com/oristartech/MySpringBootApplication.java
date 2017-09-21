package com.oristartech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MySpringBootApplication {
	public static void main(String[] args) {
		//入口，加载tomcat插件，加载spring配置文件，扫描包结构
		SpringApplication.run(MySpringBootApplication.class, args);
}
}
