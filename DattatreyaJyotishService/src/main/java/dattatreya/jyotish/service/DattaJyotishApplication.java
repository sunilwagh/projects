package dattatreya.jyotish.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;



@SpringBootApplication
@ComponentScan("dattatreya.jyotish")
public class DattaJyotishApplication {
	
	private static final Logger log = LoggerFactory.getLogger(DattaJyotishApplication.class);
	
	

	public static void main(String[] args) {
		
		try {
		SpringApplication.run(DattaJyotishApplication.class, args);
		System.out.println("Server started");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
		
		
		
	
}
