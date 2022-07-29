package com.agrotis.propriedade;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.agrotis.propriedade.model.Laboratorio;
import com.agrotis.propriedade.repository.*;

@SpringBootApplication
public class PropriedadeApplication {

	public static void main(String[] args) {
		SpringApplication.run(PropriedadeApplication.class, args);
	}
	
}
