package siarhei.pashkou.SimpleStart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("siarhei.pashkou.repository") 
@EntityScan("siarhei.pashkou.persistence")
@ComponentScan("siarhei.pashkou.controller")
@SpringBootApplication
public class SimpleStartApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleStartApplication.class, args);
	}
}
