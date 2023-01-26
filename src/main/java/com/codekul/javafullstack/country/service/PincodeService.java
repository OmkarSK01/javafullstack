package com.codekul.javafullstack.country.service;

import com.codekul.javafullstack.country.model.Pincode;

import java.util.Map;

public interface PincodeService {
    String savePincode(Pincode pincode);


    Map<String, Object> getAreaByPincode(Long pincode);

    // Map<String, Object> getStateByPincode(Long pincode);

   // Map<String, Object> getAllByPincode(Long pincode);

      Map<String, Object> getTahsilByPincode(Long pincode);

}
