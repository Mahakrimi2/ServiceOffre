package com.SAOP.tp2_Soap;

import com.SAOP.tp2_Soap.entities.Offre;
import com.SAOP.tp2_Soap.repositories.OffreRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Tp2SoapApplication implements CommandLineRunner {

	@Autowired
	OffreRepo offreRepo;
	public static void main(String[] args) {
		SpringApplication.run(Tp2SoapApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		offreRepo.save(new Offre("Web Design","Informatique","AXA",2,"France")
		);
		offreRepo.save(new Offre("Developpeur",
				"informatique","Talys", 3, "Tunisie"));
		offreRepo.save(new Offre("Architecte",
				"informatique","SIS", 2, "Allemagne"));
	}
}
