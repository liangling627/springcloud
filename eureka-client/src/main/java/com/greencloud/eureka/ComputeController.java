package com.greencloud.eureka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Mack
 * @Date 2017年03月07日
 */
@RestController
public class ComputeController {

    private static final Logger logger = LoggerFactory.getLogger(ComputeController.class);

    @Resource
    private DiscoveryClient client;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public User add(@RequestParam String name) {
        ServiceInstance instance = client.getLocalServiceInstance();
        User user = new User();
        user.setName(name);
        user.setId(1);
        return user;
    }

}
