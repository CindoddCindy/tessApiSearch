package springsearchtest.testsearchspring.controller;



import com.sipios.springsearch.anotation.SearchSpec;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import springsearchtest.testsearchspring.model.Car;
import springsearchtest.testsearchspring.repository.CarRepository;

import java.util.List;

@Controller
public class CarController {

    private final CarRepository carRepository;

    public CarController(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @GetMapping("/cars")
    public ResponseEntity<List<Car>> searchForCars(@SearchSpec Specification<Car> specs) {
        return new ResponseEntity<>(carRepository.findAll(Specification.where(specs)), HttpStatus.OK);

}
}
