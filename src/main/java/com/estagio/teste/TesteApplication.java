package com.estagio.teste;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.estagio.teste.model.PessoaModel;
import com.estagio.teste.model.VendedorModel;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackageClasses= {PessoaModel.class, VendedorModel.class})
public class TesteApplication {

	public static void main(String[] args) {
		SpringApplication.run(TesteApplication.class, args);
	}

}
