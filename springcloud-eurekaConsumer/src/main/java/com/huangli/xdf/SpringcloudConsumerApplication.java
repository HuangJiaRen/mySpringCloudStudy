package com.huangli.xdf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @uthor huangli
 * @description
 * @date 2019/4/29 10:40
 */

@SpringBootApplication
@EnableDiscoveryClient  //向服务中心注册
@EnableHystrix
public class SpringcloudConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringcloudConsumerApplication.class, args);
    }
    @Bean
    @LoadBalanced //表示下列方法开启负载均衡
    RestTemplate restApiHello(){
        return new RestTemplate ();
    }
}
