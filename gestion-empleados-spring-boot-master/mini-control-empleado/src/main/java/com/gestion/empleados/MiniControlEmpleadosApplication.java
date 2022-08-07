package com.gestion.empleados;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.gestion.empleados.controlador"})
public class MiniControlEmpleadosApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiniControlEmpleadosApplication.class, args);
	}

}
