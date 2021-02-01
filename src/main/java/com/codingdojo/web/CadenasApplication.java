package com.codingdojo.web;

import java.util.Random;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

@RestController
public class CadenasApplication {

	public static void main(String[] args) {
		SpringApplication.run(CadenasApplication.class, args);
	}

	@RequestMapping("/")
	public String hola() {
		return "Hola. ¿ Qué necesita ?";
	}
	
	@RequestMapping("/random")
	public String random() {
		Random r= new Random();
		
		String[] msg = new String[5];
		msg[0] = "Un gran día";
		msg[1] = "Hoy es un gran día.";
		msg[2] = "Tu puedes ";
		msg[3] = "Vamos que se puede.";
		msg[4] = "Que tengas un feliz día ";
		
		int index = r.nextInt(5); 
		
	
		return msg[index];
	}
}
