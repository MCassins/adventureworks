package br.edu.up.jpa;

import org.hibernate.HibernateException;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Programa {

    public static void main(String[] args) {
    	try {
        SpringApplication.run(Programa.class, args);
    	}catch(HibernateException exception){
    	     System.out.println("Problem creating session factory");
    	     exception.printStackTrace();
    	}
    }
}
