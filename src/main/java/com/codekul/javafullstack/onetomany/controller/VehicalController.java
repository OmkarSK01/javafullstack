package com.codekul.javafullstack.onetomany.controller;

/*import com.codekul.javafullstack.onetomany.domain.Vehical;
import com.codekul.javafullstack.onetomany.repository.VehicalRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
//30 May
@RestController
public class VehicalController {

    @Autowired
    private VehicalRepo vehicalRepo;

    @PostMapping("saveVehical")
    public String saveVehical(@RequestBody Vehical vehical){
        vehicalRepo.save(vehical);
        return "vehical saved..";
    }
}*/



/*  {
        *     "name": "TVS",      //he star-* nka taku json la // ethun managed reference ahe
        *     "colour": "white",
        *     "parts": [
        *         {
        *             "name": "light",
        *             "number": 90977
        *         },
        *         {                          // ethun backed refernce ahe
        *             "name": "seat",
        *             "number": 9666
        *         }
        *     ]
        * }  */








import com.codekul.javafullstack.onetomany.domain.Vehical;

import com.codekul.javafullstack.onetomany.service.VehicalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//3june
@RestController
//@RequestMapping("api/") //he repository la dily pn nka taku v4ra sirna
public class VehicalController {


    @Autowired
    private VehicalService vehicalService;

    @PostMapping("saveVehical")
    public String saveVehical(@RequestBody Vehical vehical){

        return vehicalService.saveVehical(vehical);
    }
}

//postman la small p dya parts capital deu nka Parts karan table parts mhnun hoto jri class name Parts asla tri

/*
{"name": "Bajaj",
        "colour": "White",
        "parts": [
        {
        "name": "light",
        "number": 90977
        },
        {
        "name": "seat",
        "number": 9666
        }
        ]
        } */
