package com.huangli.xdf;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @uthor huangli
 * @description
 * @date 2019/4/29 10:30
 */

@Service
public class HelloService {
    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")//使用hystic时，添加注解
    public String  sayHello(){
        String str= restTemplate.getForObject("http://eureka-client/hello", String.class);
        return str;
    }

    public String  getRegistered(){
        String str= restTemplate.getForObject("http://eureka-client/getRegistered", String.class);
        return str;
    }

    //hystic时使用方法
    public String hiError() {
        return "hi,"+",sorry,error!";
    }
}
