package com.huangli.xdf;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huangli
 * @description
 * @date 2019/4/30 17:34
 */

@SpringBootApplication
@RestController
public class ConfigClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication.class, args);
    }

//    @Value("${foo}")
    String foo;
    @Value("${democonfigclient.message}")
    @RequestMapping(value = "/hi")
    public String hi(){
        return foo;
    }
}
