package com.codekul.javafullstack.country.impl;


import com.codekul.javafullstack.country.model.Country;
import com.codekul.javafullstack.country.repository.CountryRepo;
import com.codekul.javafullstack.country.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryImpl implements CountryService {
    @Autowired
    private CountryRepo countryRepo;

    @Override
    public String saveCountry(Country country) {
//        if(country.getName().equals("India")){
//            return "India country not allowed";
//        }
        countryRepo.save(country);
        return "country saved..";
    }


}
