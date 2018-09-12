package com.greencloud.configServer;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigApplication
{
    public static void main( String[] args ) {
        new SpringApplicationBuilder(ConfigApplication.class).web(true).run(args);
    }
}
