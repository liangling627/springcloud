package com.greencloud.eureka;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Mack
 * @Date 2017年03月07日
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ApplicationClient {
    public static void main(String[] args) {
        new SpringApplicationBuilder(ApplicationClient.class).web(true).run(args);
    }
}
