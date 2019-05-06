package com.huangli.xdf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author huangli
 * @description
 * @date 2019/4/30 10:38
 */

@SpringBootApplication
@EnableDiscoveryClient
public class ConsulProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsulProviderApplication.class, args);
    }
}
