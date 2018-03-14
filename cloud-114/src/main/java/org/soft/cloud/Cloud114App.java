package org.soft.cloud;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Cloud114App {
	private static final Logger logger = LoggerFactory.getLogger(Cloud114App.class);

	public static void main(String[] args) {
		new SpringApplicationBuilder(Cloud114App.class).web(true).run(args);
		logger.info("114 服务平台已启动");
	}

}
