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
		Scanner sc = new Scanner(System.in);
		String profiles = sc.nextLine();
		logger.info("加载配置文件：{}", profiles);
		new SpringApplicationBuilder(Cloud114App.class).profiles(profiles).web(true).run(args);
		logger.info("114 服务平台已启动");
	}

}
