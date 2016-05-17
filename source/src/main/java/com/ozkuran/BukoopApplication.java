package com.ozkuran;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class BukoopApplication {

	public static void main(String[] args) {
		SpringApplication.run(BukoopApplication.class, args);
	}
}
