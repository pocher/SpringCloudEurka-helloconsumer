package com.learning.pocher.helloconsumer.feignservice;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("hello-service1")
public interface ServiceClient {
    @RequestMapping("/callToXiaoAI")
    String getHelloService1();
}
