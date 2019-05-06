package com.huangli.xdf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @uthor huangli
 * @description
 * @date 2019/4/29 18:16
 */

@RestController
public class ConsumerController {
    @Autowired
    HelloService helloService;

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String helloConsumer(){
        return  helloService.sayHello();
    }

}
