package springsearchtest.testsearchspring.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import springsearchtest.testsearchspring.model.Car;

@RepositoryRestResource
public interface CarRepository extends JpaRepository<Car, Integer>, JpaSpecificationExecutor<Car> {
}
