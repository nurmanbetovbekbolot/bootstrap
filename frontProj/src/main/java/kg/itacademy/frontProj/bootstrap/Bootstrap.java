package kg.itacademy.frontProj.bootstrap;

import kg.itacademy.frontProj.entities.City;
import kg.itacademy.frontProj.repositories.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Bootstrap implements CommandLineRunner {
    @Autowired
    private CityRepository cityRepository;
    @Override
    public void run(String... args) throws Exception {
        City cityBishkek = City.builder()
                .title("Bishkek")
                .build();
        cityRepository.save(cityBishkek);

        City cityOsh = City.builder()
                .title("Osh")
                .build();
        cityRepository.save(cityOsh);

        City cityKarakol = City.builder()
                .title("Karakol")
                .build();
        cityRepository.save(cityKarakol);

    }
}
