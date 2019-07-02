package com.huangli.xdf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * @uthor huangli
 * @description
 * @date 2019/4/29 9:51
 */

@EnableEurekaClient
@SpringBootApplication
@RestController
public class SpringcloudEkCliApplication {
    @Autowired
    private DiscoveryClient discoveryClient;

    @Value("${server.port}")
    String port;


    @RequestMapping("/hello")
    String sayHello() {
        String ha = "Hello World!" + "I am calling from "+"port:"+port;
        System.out.println(ha);
        return ha;
    }

    @RequestMapping("/getRegistered")
    public String getRegistered(){
        String rst="";
        List<ServiceInstance> list = discoveryClient.getInstances("STORES");
        System.out.println( "discoveryClient.getInstances().size()=" + list.size());
        if (list != null && list.size() > 0 ) {
            System.out.println( list.get(0).getUri()  );
        }

        for( String s :  discoveryClient.getServices()){
            System.out.println("services " + s);
            List<ServiceInstance> serviceInstances =  discoveryClient.getInstances(s);
            for(ServiceInstance si : serviceInstances){

                rst=rst + "    services:" + s + ":getHost()=" + si.getHost()+":getPort()=" + si.getPort()+":getServiceId()=" + si.getServiceId()   ;
                System.out.println("    services:" + s + ":getHost()=" + si.getHost());
                System.out.println("    services:" + s + ":getPort()=" + si.getPort());
                System.out.println("    services:" + s + ":getServiceId()=" + si.getServiceId());
                System.out.println("    services:" + s + ":getUri()=" + si.getUri());
                System.out.println("    services:" + s + ":getMetadata()=" + si.getMetadata());
            }

        }


        return rst;
    }

    //这是一个注册客户端，向注册中心进行注册一个服务
    public static void main(String[] args) {
        SpringApplication.run(SpringcloudEkCliApplication.class, args);
    }

    }
