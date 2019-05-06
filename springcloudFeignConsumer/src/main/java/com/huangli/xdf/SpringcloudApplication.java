package com.huangli.xdf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @uthor huangli
 * @description
 * @date 2019/4/29 18:14
 */

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class SpringcloudApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringcloudApplication.class, args);
    }
}
