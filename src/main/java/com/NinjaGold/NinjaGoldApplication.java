package com.NinjaGold;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.controlador")
public class NinjaGoldApplication {

	public static void main(String[] args) {
		SpringApplication.run(NinjaGoldApplication.class, args);
	}

}
