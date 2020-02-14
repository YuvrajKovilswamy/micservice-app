package com.howtodoinjava.example.springconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Profile;

@EnableConfigServer
@SpringBootApplication
//@Profile("development")
public class SpringConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringConfigServerApplication.class, args);
		
		System.out.println("lets make some changes");

		System.out.println("first change");
		
		System.out.println("some one committed this change");

	}

}
