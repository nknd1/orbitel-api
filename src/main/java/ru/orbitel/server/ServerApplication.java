package ru.orbitel.server;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication(exclude = {JdbcTemplateAutoConfiguration.class})
public class ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);

	}
}

