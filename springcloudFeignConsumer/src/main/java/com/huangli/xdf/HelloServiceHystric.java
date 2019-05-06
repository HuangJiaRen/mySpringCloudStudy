package com.huangli.xdf;

import org.springframework.stereotype.Component;

/**
 * @uthor huangli
 * @description  测试Feign的Hystric功能，此时需要有实现类
 * @date 2019/4/30 14:12
 */

@Component
public class HelloServiceHystric implements HelloService{
    @Override
    public String sayHello() {
        return "sorry , i am hystric!";
    }
}
