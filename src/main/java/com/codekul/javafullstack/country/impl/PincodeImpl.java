package com.codekul.javafullstack.country.impl;

import com.codekul.javafullstack.country.model.Pincode;
import com.codekul.javafullstack.country.repository.PincodeRepo;
import com.codekul.javafullstack.country.service.PincodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;


import static com.codekul.javafullstack.util.Constants.RESULT;
import static com.codekul.javafullstack.util.Constants.STATUS;
import static org.hibernate.validator.internal.metadata.core.ConstraintHelper.MESSAGE;


@Service
public class PincodeImpl implements PincodeService {


@Autowired
    private PincodeRepo pincodeRepo;

    @Override
    public String savePincode(Pincode pincode) {
//        if(pincode.getPincode().equals("411030")){
//            return "411030 pincode not allowed";
//        }
        pincodeRepo.save(pincode);
        return "pincode saved..";
    }



@Override
    public Map<String, Object> getAreaByPincode(Long pincode ) {
        Map<String,Object> map = new HashMap<>();
        map.put(MESSAGE,"Get All ");
        map.put(STATUS, HttpStatus.CREATED.value());
        map.put(RESULT,pincodeRepo.getAreaByPincode(pincode));
        return map;
    }


//    @Override
//    public Map<String, Object> getStateByPincode(Long pincode ) {
//        Map<String,Object> map = new HashMap<>();
//        map.put(MESSAGE,"Get All ");
//        map.put(STATUS, HttpStatus.CREATED.value());
//        map.put(RESULT,pincodeRepo.getStateByPincode(pincode));
//        return map;
//    }


    @Override
    public Map<String, Object> getTahsilByPincode(Long pincode ) {
        Map<String,Object> map = new HashMap<>();
        map.put(MESSAGE,"Get All ");
        map.put(STATUS, HttpStatus.CREATED.value());
        map.put(RESULT,pincodeRepo.getTahsilWithPincode());
        return map;
    }
//
//
//
//    @Override
//    public Map<String, Object> getAllByPincode(Long pincode ) {
//        Map<String,Object> map = new HashMap<>();
//        map.put(MESSAGE,"Get All ");
//        map.put(STATUS, HttpStatus.CREATED.value());
//        map.put(RESULT,pincodeRepo.getAllByPincode(pincode));
//        return map;
//    }



}
