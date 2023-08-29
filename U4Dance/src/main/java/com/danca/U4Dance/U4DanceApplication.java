package com.danca.U4Dance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class U4DanceApplication {

	public static void main(String[] args) {
		Database.init();
		SpringApplication.run(U4DanceApplication.class, args);
	}

}
