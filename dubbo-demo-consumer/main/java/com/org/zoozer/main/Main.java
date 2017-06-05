package com.org.zoozer.main;

import com.org.zoozer.service.GreetingService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author chenzhongqiang
 * @version 1.0
 * @created 2017/6/2 0002.
 */

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        context.start();
        GreetingService greetingService = (GreetingService) context.getBean("greetingService");
        String result = greetingService.sayHello("zoozer");
        System.out.println("Consumer==>" + result);
        context.destroy();
    }
}
