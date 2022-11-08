package com.carcenter.carcenter;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"com.carcenter.carcenter.controller", "com.carcenter.carcenter.repositories",
	"com.carcenter.carcenter.service"})//SE INSTANCIA TODOS NUESTROS OBJETOS 
@EntityScan("com.carcenter.carcenter.model")//se define para escaner diferentes entidades en distintos paquetes 
@SpringBootApplication
public class CarcenterApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(CarcenterApplication.class, args);
	}
}
