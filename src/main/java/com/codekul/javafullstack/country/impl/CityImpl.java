package com.codekul.javafullstack.country.impl;


import com.codekul.javafullstack.country.model.City;
import com.codekul.javafullstack.country.repository.CityRepo;
import com.codekul.javafullstack.country.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

import static com.codekul.javafullstack.util.Constants.*;

@Service
public class CityImpl implements CityService {

    @Autowired
    private CityRepo cityRepo;

    @Override
    public String saveCity(City city) {
//        if(city.getName().equals("pimpari")){
//            return "pimpari city not allowed";
//        }
        cityRepo.save(city);
        return "city saved..";
    }

}
