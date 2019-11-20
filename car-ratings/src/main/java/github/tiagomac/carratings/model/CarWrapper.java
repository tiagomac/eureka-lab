package github.tiagomac.carratings.model;

import java.util.List;

public class CarWrapper {

    private List<Car> cars;
    private String port;

    public CarWrapper() {
    }

    public CarWrapper(List<Car> cars) {
        this.cars = cars;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }
}
