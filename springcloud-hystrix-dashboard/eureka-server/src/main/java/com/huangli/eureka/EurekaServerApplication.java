package com.huangli.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author huangli
 * @description 文档地址： http://cloud.spring.io/spring-cloud-static/Finchley.RELEASE/single/spring-cloud.html
 * @date 2019/5/7 10:11
 */

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run( EurekaServerApplication.class, args );
    }
}
