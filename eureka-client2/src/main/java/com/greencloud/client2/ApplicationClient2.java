package com.greencloud.client2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Mack
 * @Date 2018年09月04日
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ApplicationClient2 {
	public static void main(String args) {
		SpringApplication.run(ApplicationClient2.class, args);
	}
}
