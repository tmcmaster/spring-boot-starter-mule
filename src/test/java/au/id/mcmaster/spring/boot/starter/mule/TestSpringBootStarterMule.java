package au.id.mcmaster.spring.boot.starter.mule;

import javax.ws.rs.core.Application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableMule
public class TestSpringBootStarterMule {
	public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
