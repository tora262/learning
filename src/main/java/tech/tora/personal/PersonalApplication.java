package tech.tora.personal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tech.tora.personal.entity.Student;
import tech.tora.personal.repo.StudenRedisRepository;

@SpringBootApplication
public class PersonalApplication {
	@Autowired
	static StudenRedisRepository redisRepository;

	public static void main(String[] args) {
		SpringApplication.run(PersonalApplication.class, args);
	}

}
