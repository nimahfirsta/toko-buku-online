package id.aegyo.SCL_Project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SclProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SclProjectApplication.class, args);
	}

}
