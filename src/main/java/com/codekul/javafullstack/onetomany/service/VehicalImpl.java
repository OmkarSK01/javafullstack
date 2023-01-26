package com.codekul.javafullstack.onetomany.service;

import com.codekul.javafullstack.onetomany.domain.Vehical;
import com.codekul.javafullstack.onetomany.repository.VehicalRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//3june
@Service
public class VehicalImpl implements VehicalService{

    @Autowired
    private VehicalRepo vehicalRepo;

    @Override
    public String saveVehical(Vehical vehical) {
        if(vehical.getName().equals("TVS")){
            return "TVS vehical not allowed";
        }
        vehicalRepo.save(vehical);
        return "vehical saved..";
    }
}


//mothya proj mde service use hota
