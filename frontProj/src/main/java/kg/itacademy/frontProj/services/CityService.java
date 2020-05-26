package kg.itacademy.frontProj.services;

import kg.itacademy.frontProj.entities.City;

import java.util.List;

public interface CityService {
    List<City> getAll();

    City getCityById(Long id);

    void putById(Long id, City city);

    City save(City city);

    void deleteById(Long id);
}
