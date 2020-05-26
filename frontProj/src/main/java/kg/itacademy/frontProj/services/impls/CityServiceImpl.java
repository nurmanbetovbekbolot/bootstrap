package kg.itacademy.frontProj.services.impls;

import kg.itacademy.frontProj.entities.City;
import kg.itacademy.frontProj.repositories.CityRepository;
import kg.itacademy.frontProj.services.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CityServiceImpl implements CityService {
    @Autowired
    CityRepository cityRepository;

    @Override
    public List<City> getAll() {
        return cityRepository.findAll();
    }

    @Override
    public City getCityById(Long id) {
        Optional<City> account = cityRepository.findById(id);
        return account.orElse(new City());
    }

    @Override
    public void putById(Long id, City city) {

    }

    @Override
    public City save(City city) {
        return cityRepository.save(city);
    }

    @Override
    public void deleteById(Long id) {
        cityRepository.deleteById(id);
        System.out.println("Customer with id " + id + " has been deleted");
    }
}
