package com.codekul.javafullstack.country.controller;

import com.codekul.javafullstack.country.model.City;
import com.codekul.javafullstack.country.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class CityController {

    @Autowired
    private CityService cityService;

    @PostMapping("saveCity")
    public String saveCity(@RequestBody City city){

        return cityService.saveCity(city);
    }


}
