package jyotish;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("jyotish")
public class AppConfig {
	
	  @Bean(name = "horoscopeProcessor")
	  public HoroscopeProcessor getHoroscopeProcessor() {
	    return new HoroscopeProcessor();
	  }

	 
	
	
}
