package com.example.tp11;

import com.example.tp11.entities.Compte;
import com.example.tp11.entities.TypeCompte;
import com.example.tp11.repositories.CompteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import java.util.Date;

@SpringBootApplication
public class MsBanqueApplication {
	public static void main(String[] args) {
		SpringApplication.run(MsBanqueApplication.class, args);
	}


}

