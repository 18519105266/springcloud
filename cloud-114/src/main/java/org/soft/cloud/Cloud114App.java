package org.soft.cloud;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Cloud114App {
	private static final Logger logger = LoggerFactory.getLogger(Cloud114App.class);

	public static void main(String[] args) {
		SpringApplication.run(Cloud114App.class, args);
		logger.info("114 服务平台已启动~~~"); 
	}

}
