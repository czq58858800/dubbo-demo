package com.org.zoozer.service.impl;

import com.org.zoozer.service.GreetingService;

import java.util.Date;

/**
 * @author chenzhongqiang
 * @version 1.0
 * @created 2017/6/2 0002.
 */

public class GreetingServiceImpl implements GreetingService {
    public String sayHello(String name) {
        System.out.println("Hello Service is calling : " + new Date());
        String greetMessage = "Hello, " + name;
        return greetMessage;
    }
}
