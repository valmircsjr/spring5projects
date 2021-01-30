package com.vcsjr.SpringProfileExample.config;

import com.vcsjr.SpringProfileExample.services.HelloWorldFactory;
import com.vcsjr.SpringProfileExample.services.HelloWorldService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class HelloConfig {

    @Bean
    public HelloWorldFactory helloWorldFactory() {
        return new HelloWorldFactory();
    }

    @Bean
    @Profile({"english", "default"})
    @Primary
    public HelloWorldService HelloWorldServiceEnglishImpl(HelloWorldFactory factory) {
        return factory.createHelloService("en");
    }

    @Bean
    @Profile("spanish")
    @Primary
    public HelloWorldService HelloWorldServiceSpanishImpl(HelloWorldFactory factory) {
        return factory.createHelloService("es");
    }

    @Bean
    public HelloWorldService HelloWorldServiceGermanImpl(HelloWorldFactory factory) {
        return factory.createHelloService("ge");
    }

    @Bean(name = "french")
    public HelloWorldService HelloWorldServiceFranchImpl(HelloWorldFactory factory) {
        return factory.createHelloService("fh");
    }
}
