package com.reamp.reamp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableFeignClients
public class ReampApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReampApplication.class, args);
	}

}
