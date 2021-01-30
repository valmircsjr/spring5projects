package com.vcsjr.SpringProfileExample.springboot;

import com.vcsjr.SpringProfileExample.controllers.GreetingController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.vcsjr.SpringProfileExample") // identifica o pacote por completo
public class SpringProfileExampleApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SpringProfileExampleApplication.class, args);

		GreetingController greetingController = (GreetingController) ctx.getBean("greetingController");

		greetingController.sayHello();
	}
}
