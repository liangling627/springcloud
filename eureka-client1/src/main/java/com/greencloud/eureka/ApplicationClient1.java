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
public class ApplicationClient1 {
    public static void main(String[] args) {
        new SpringApplicationBuilder(ApplicationClient1.class).web(true).run(args);
    }
}
