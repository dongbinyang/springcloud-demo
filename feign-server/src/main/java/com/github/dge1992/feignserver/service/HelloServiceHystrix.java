package com.github.dge1992.feignserver.service;

import org.springframework.stereotype.Component;

/**
 * @Author 小眼睛带鱼
 * @Description
 * @Date 2019/7/16
 **/
@Component
public class HelloServiceHystrix implements HelloService{

    @Override
    public String hello(String name) {
        return "服务挂了";
    }
}
