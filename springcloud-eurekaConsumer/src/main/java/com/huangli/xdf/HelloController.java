package com.huangli.xdf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @uthor huangli
 * @description
 * @date 2019/4/29 10:38
 */


@RestController
public class HelloController {
@Autowired
private  HelloService helloService;

@RequestMapping("/hi")
public  String hello(){
        String str=  helloService.sayHello();
        System.out.println("call  hello service："+str);
        return str;

        }

@RequestMapping("/getRegistered")
public  String getRegistered(){
        String str=  helloService.getRegistered();
        System.out.println("call  hello service："+str);
        return str;

        }
}