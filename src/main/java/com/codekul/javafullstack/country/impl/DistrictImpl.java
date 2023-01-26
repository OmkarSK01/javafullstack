package com.codekul.javafullstack.country.impl;

import com.codekul.javafullstack.country.model.District;
import com.codekul.javafullstack.country.repository.DistrictRepo;
import com.codekul.javafullstack.country.service.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DistrictImpl implements DistrictService {

@Autowired
    private DistrictRepo districtRepo;

    @Override
    public String saveDistrict(District district) {
//        if(district.getName().equals("Pune")){
//            return "Pune district not allowed";
//        }
        districtRepo.save(district);
        return "district saved..";
    }

}
