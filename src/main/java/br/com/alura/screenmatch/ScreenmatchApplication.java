package br.com.alura.screenmatch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication {
	//jdbc:postgresql://${DB_HOST_SCREENMATCH}/${DB_DATABASE_SCREENMATCH}
	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);

	}

}
