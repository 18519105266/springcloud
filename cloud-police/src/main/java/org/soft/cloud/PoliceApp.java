package org.soft.cloud;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PoliceApp {
	private static final Logger logger = LoggerFactory.getLogger(PoliceApp.class);

	public static void main(String[] args) {
		new SpringApplicationBuilder(PoliceApp.class).web(true).run(args);
		logger.info("police 服务平台已启动");
	}

}
