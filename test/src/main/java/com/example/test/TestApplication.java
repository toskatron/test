package com.example.test;

import com.example.test.factory.CreaturaFactory;
import com.example.test.model.Creatura;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestApplication {

	public static void main(String[] args) {


		Creatura elf1 = CreaturaFactory.getCreatura(CreaturaFactory.ELF, "Legolas");
		Creatura gnom1 = CreaturaFactory.getCreatura(CreaturaFactory.GNOM, "Gimli");
		Creatura ent1 = CreaturaFactory.getCreatura(CreaturaFactory.ENTI, "Treebeard");



		SpringApplication.run(TestApplication.class, args);
	}

}
