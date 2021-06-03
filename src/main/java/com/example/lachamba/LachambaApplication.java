package com.example.lachamba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class LachambaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LachambaApplication.class, args);
	}

	@RequestMapping("/")
	public String home(){
		return "<h1>hola mundo</h1>";
	}

}
