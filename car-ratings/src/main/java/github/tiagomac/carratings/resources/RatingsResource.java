package github.tiagomac.carratings.resources;

import com.netflix.discovery.converters.Auto;
import github.tiagomac.carratings.model.Car;
import github.tiagomac.carratings.model.CarWrapper;
import github.tiagomac.carratings.model.Rating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingsResource {

    @Autowired
    private WebClient.Builder webClient;

    @Autowired
    private RestTemplate restTemplate;

    @Value("${server.port}")
    private String port;

    @GetMapping
    public CarWrapper findRatings(){
        CarWrapper carWrapper = restTemplate.getForObject("http://CAR-CATALOG/catalog", CarWrapper.class);
//       Car carMono = webClient
//                .build().get().uri("http://CAR-CATALOG/catalog")
//                .retrieve()
//                .bodyToMono(Car.class)
//                .block();
//        carWrapper.setPort(port);
        return carWrapper;
    }

}
