package com.codekul.javafullstack.country.controller;

import com.codekul.javafullstack.country.model.Pincode;
import com.codekul.javafullstack.country.repository.CountryRepo;
import com.codekul.javafullstack.country.repository.PincodeRepo;

import com.codekul.javafullstack.country.service.PincodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class PincodeController {


     @Autowired
    private PincodeService pincodeService;

     @PostMapping("savePincode")
      public String savePincode(@RequestBody Pincode pincode){

        return pincodeService.savePincode(pincode);
    }


    @GetMapping("/getAreaByPincode")
    public Map<String,Object> getAreaByPincode(@RequestParam Long pincode){
        return pincodeService.getAreaByPincode(pincode);
    }

@GetMapping("/getTahsilByPincode")
    public Map<String,Object> getTahsilByPincode(@RequestParam Long pincode){
        return pincodeService.getTahsilByPincode(pincode);
    }


//    @GetMapping("/getStateByPincode")
//    public Map<String,Object> getStateByPincode(@RequestParam Long pincode){
//        return pincodeService.getStateByPincode(pincode);
//    }


//         @GetMapping("/getAllByPincode")
//    public Map<String,Object> getAllByPincode(@RequestParam Long pincode){
//        return pincodeRepo.getAllTahsilWithPincode(pincode);
//    }




}
