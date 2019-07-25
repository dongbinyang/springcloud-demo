package com.github.dge1992.feignserver.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "ribbon-server", fallback = HelloServiceHystrix.class)
public interface HelloService {

    @GetMapping(value = "/hi")
    String helloRibbon(@RequestParam(value = "name") String name);
}
