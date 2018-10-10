package br.edu.up.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("br.edu.ip.jpa.dominio")
public class Vendasv3 {

	public static void main(String[] args) {
		SpringApplication.run(Vendasv3.class, args);
	}
}
