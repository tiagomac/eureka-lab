package github.tiagomac.carcatalog.resources;

import github.tiagomac.carcatalog.model.Car;
import github.tiagomac.carcatalog.model.CarWrapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@RequestMapping("/catalog")
public class CatalogResource {

    @Value("${server.port}")
    private String port;

    @GetMapping
    CarWrapper findCars() {
        CarWrapper carWrapper = new CarWrapper(
                Arrays.asList(
                        new Car("Mercedes"),
                        new Car("BMW"),
                        new Car("FORD")
                ));
        carWrapper.setPort(port);
        return carWrapper;
    }
}
