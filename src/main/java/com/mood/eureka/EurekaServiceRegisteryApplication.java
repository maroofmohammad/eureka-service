package com.mood.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Nawed
 *
 */
@SpringBootApplication
@EnableEurekaServer
@RefreshScope
public class EurekaServiceRegisteryApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServiceRegisteryApplication.class, args);
	}

}
