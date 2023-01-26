package com.codekul.javafullstack.country.controller;

import com.codekul.javafullstack.country.model.District;
import com.codekul.javafullstack.country.service.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DistrictController {

    @Autowired
    private DistrictService districtService;

    @PostMapping("saveDistrict")
    public String saveDistrict(@RequestBody District district){

        return districtService.saveDistrict(district);
    }


}
