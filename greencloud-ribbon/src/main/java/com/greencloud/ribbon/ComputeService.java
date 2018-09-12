package com.greencloud.ribbon;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author Mack
 * @Date 2017年03月08日
 */
@Service
public class ComputeService {

    @Resource
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "addServiceFallback")
    public String addService() {
        User user = restTemplate.getForEntity("http://COMPUTE-SERVICE/add?name=lisa", User.class).getBody();
        return user.getName() + "===" + user.getId();
    }

    public String addServiceFallback() {
        return "error";
    }
}
