package com.vcsjr.SpringProfileExample.services;

public class HelloWorldFactory {

    public HelloWorldService createHelloService (String language) {
        HelloWorldService helloWorldService = null;
        switch (language) {
            case "es":
                helloWorldService = new HelloWorldServiceSpanishImpl();
                break;
            case "ge":
                helloWorldService = new HelloWorldServiceGermanImpl();
                break;
            case "fh":
                helloWorldService = new HelloWorldServiceFrenchImpl();
                break;
            default:
                helloWorldService = new HelloWorldServiceEnglishImpl();
        }

        return helloWorldService;
    }
}
