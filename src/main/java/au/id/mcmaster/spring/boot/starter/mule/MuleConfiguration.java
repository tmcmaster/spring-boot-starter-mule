package au.id.mcmaster.spring.boot.starter.mule;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MuleConfiguration {
	
	@Bean
	public MuleComponent stuffOne() {
		System.out.println("Creating MuleComponent bean.");
		return new MuleComponent();
	}
}

