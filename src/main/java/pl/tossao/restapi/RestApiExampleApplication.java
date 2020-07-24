package pl.tossao.restapi;

import com.github.javafaker.Faker;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pl.tossao.restapi.model.Hero;
import pl.tossao.restapi.repository.HeroRepository;

import java.util.stream.IntStream;

@SpringBootApplication
public class RestApiExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApiExampleApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(HeroRepository heroRepository) {
		Faker faker = new Faker();
		return args -> IntStream.range(0,100).forEach(i->heroRepository.save(new Hero(faker.superhero().name())));

	}
}
