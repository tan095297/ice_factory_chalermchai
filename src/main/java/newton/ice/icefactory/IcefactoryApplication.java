package newton.ice.icefactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@SpringBootApplication
@EnableMongoAuditing
public class IcefactoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(IcefactoryApplication.class, args);
	}

}
