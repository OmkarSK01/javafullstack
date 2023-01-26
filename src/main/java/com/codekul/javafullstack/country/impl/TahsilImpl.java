package com.codekul.javafullstack.country.impl;


import com.codekul.javafullstack.country.model.Tahsil;
import com.codekul.javafullstack.country.repository.TahsilRepo;
import com.codekul.javafullstack.country.service.TahsilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

import static com.codekul.javafullstack.util.Constants.*;

@Service
public class TahsilImpl implements TahsilService {


@Autowired
    private TahsilRepo tahsilRepo;

    @Override
    public String saveTahsil(Tahsil tahsil) {
//        if(tahsil.getName().equals("Haveli")){
//            return "Haveli tahsil not allowed";
//        }
        tahsilRepo.save(tahsil);


        return "tahsil saved..";
    }




}
