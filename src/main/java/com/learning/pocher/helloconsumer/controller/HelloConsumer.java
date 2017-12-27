package com.learning.pocher.helloconsumer.controller;

import com.learning.pocher.helloconsumer.feignservice.ServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloConsumer {
    @Autowired
    ServiceClient serviceClient;

    @RequestMapping("/feign-consumer")
    public String helloConsumer(){
        String returnMessage = serviceClient.getHelloService1();
        System.out.println(returnMessage);
        return returnMessage;
    }
}
