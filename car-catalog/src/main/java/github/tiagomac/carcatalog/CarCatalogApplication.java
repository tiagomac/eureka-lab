package github.tiagomac.carcatalog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CarCatalogApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarCatalogApplication.class, args);
	}

}
