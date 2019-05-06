package com.huangli.xdf;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @uthor huangli
 * @description
 * @date 2019/4/29 18:15
 */

//@FeignClient("eureka-client")
@FeignClient(value = "eureka-client",fallback = HelloServiceHystric.class)//测试Feign的Hystric功能
//通过@FeginClient 来指定服务名，绑定服务
public interface  HelloService {
    @RequestMapping("/hello")  //通过spring mvc 注解来绑定服务提供的Rest接口
    String sayHello();
}
