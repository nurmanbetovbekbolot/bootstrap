package kg.itacademy.frontProj.repositories;

import kg.itacademy.frontProj.entities.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<City,Long> {
}
