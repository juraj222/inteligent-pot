package inteligentpot.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {
		"inteligentpot.com.core.service,inteligentpot.com.core.config, inteligentpot.com.controller" })
public class InteligentPotApplication {

	public static void main(String[] args) {
		SpringApplication.run(InteligentPotApplication.class, args);
	}
}
