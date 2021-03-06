package com.huangli.xdf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


/**
 * @uthor huangli
 * @description
 * @date 2019/4/28 17:54
 */

@EnableEurekaServer
@SpringBootApplication
public class SpringcloudEureka02Application {
    public static void main(String[] args) {
        SpringApplication.run(SpringcloudEureka02Application.class, args);

    }

}
