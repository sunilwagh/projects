package dattatreya.jyotish.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;



@SpringBootApplication
public class DemoApplication {
	
	private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);
	
	

	public static void main(String[] args) {
		
		try {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("Server started");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
		
		
		
	
}
