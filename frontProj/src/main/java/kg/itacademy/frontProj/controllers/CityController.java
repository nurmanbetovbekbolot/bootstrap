package kg.itacademy.frontProj.controllers;

import kg.itacademy.frontProj.entities.City;
import kg.itacademy.frontProj.services.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@RestController
public class CityController {

    @Autowired
    private CityService cityService;

    @CrossOrigin
    @GetMapping("/all")
    public List<City> getAll() {
        return cityService.getAll();
    }

    @CrossOrigin
    @GetMapping(value = "/{id}")
    public City getById(@PathVariable("id") Long id) {
        return cityService.getCityById(id);
    }

    @CrossOrigin
    @PostMapping
    public City save(@RequestBody City city) {
        return cityService.save(city);
    }

    @CrossOrigin
    @DeleteMapping
    public void deleteById(Long id) {
        cityService.deleteById(id);
    }

    @PostMapping("/image")
    public String uploadFile(@RequestParam MultipartFile file) throws IOException {
        String fileName = addImage(file);
        return fileName;
    }

    private String addImage(MultipartFile file) throws IOException {
        byte[] bytes = file.getBytes();
        String modifiedFileName = System.currentTimeMillis() +
                file.getOriginalFilename();
//                        .substring(file.getOriginalFilename().length() - 4);
        Path path = Paths.get("D:\\nginx\\pics\\"+modifiedFileName);
        Files.write(path, bytes);
        return modifiedFileName;
    }
}
