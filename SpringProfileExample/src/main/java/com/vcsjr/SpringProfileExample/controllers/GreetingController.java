package com.vcsjr.SpringProfileExample.controllers;

import com.vcsjr.SpringProfileExample.services.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class GreetingController {

    private HelloWorldService helloWorldService;

    private HelloWorldService helloWorldServiceGerman;

    private HelloWorldService helloWorldServiceFrench;

    @Autowired // injecao de dependencia e inversao de controle (Spring)
    public void setHelloWorldService(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    @Autowired
    @Qualifier("HelloWorldServiceGermanImpl") // config pelo nome do metodo
    public void setHelloWorldServiceGerman(HelloWorldService helloWorldServiceGerman) {
        this.helloWorldServiceGerman = helloWorldServiceGerman;
    }

    @Autowired
    @Qualifier("french") // config pelo nome do bean
    public void setHelloWorldServiceFrench(HelloWorldService helloWorldServiceFrench) {
        this.helloWorldServiceFrench = helloWorldServiceFrench;
    }

    public void sayHello() {
        String greeting = helloWorldService.getHelloWorld();

        System.out.println(greeting);
        System.out.println(helloWorldServiceGerman.getHelloWorld());
        System.out.println(helloWorldServiceFrench.getHelloWorld());
    }
}
