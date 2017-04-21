# spring-boot-starter-mule
Spring Boot starter module for embedding MuleSoft in a Spring Boot app.

### Test

- run the au.id.mcmaster.spring.boot.starter.mule.TestSpringBootStarterMule test main class
- use PostMan to POST plain text to http://localhost:8087/test

### pom.xml

Add spring-boot-starter-mule to you pom.xml dependencies

```code
<dependency>
  <groupId>au.id.mcmaster.springboot.starter.mule</groupId>
  <artifactId>spring-boot-starter-mule</artifactId>
</dependency>

```

### Spring Boot main

Add a Spring Boot Main class to your Project

```code
@SpringBootApplication
@EnableMule
public class TestSpringBootStarterMule {
	public static void main(String[] args) {
        SpringApplication.run(TestSpringBootStarterMule.class, args);
    }
}
```

### MuleSoft Flow Configuration

Put the MuleSoft flow configuration files in the resources directory

### Package and Run

Run as a Spring Boot application, or wrap it up with Docker.
