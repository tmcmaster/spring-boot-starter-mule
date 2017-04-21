package au.id.mcmaster.spring.boot.starter.mule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableMule
public class TestSpringBootStarterMule {
	public static void main(String[] args) {
        SpringApplication.run(TestSpringBootStarterMule.class, args);
    }
}
