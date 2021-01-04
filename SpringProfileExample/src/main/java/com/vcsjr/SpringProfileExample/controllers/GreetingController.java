package com.vcsjr.SpringProfileExample.controllers;

import com.vcsjr.SpringProfileExample.services.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class GreetingController {

    private HelloWorldService helloWorldService;

    @Autowired // injecao de dependencia e inversao de controle (Spring)
    public void setHelloWorldService(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    public String sayHello() {
        String greeting = helloWorldService.getHelloWorld();

        return greeting;
    }
}
