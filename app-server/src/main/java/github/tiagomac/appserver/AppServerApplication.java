package github.tiagomac.appserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AppServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppServerApplication.class, args);
	}

}
