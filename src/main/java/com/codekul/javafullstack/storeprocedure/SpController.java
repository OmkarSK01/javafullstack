package com.codekul.javafullstack.storeprocedure;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class SpController {
    @Autowired
    private SPRepository spRepository;

    @GetMapping("getData")
    public List<Map<String,String>> getData(){
    return spRepository.getVehical();
}
}
//select * from vehical;
//select * from parts;
/*
        mysql> delimiter /
        mysql> create procedure getVehicalData()
        -> BEGIN
        ->
        -> select * from vehical;
        -> END;
        -> /

        call getVehicalData();/
*/


/* postman obj get kra
[
    {
        "color": null,
        "name": null,
        "id": 1
    },
    {
        "color": "white",
        "name":"TVS",
        "id": 2
    }
]
 */

//op postman window la
/*[
        {
        "colour": "white",
        "name": "TVS",
        "id": 1
        },
        {
        "colour": "White",
        "name": "Bajaj",
        "id": 2
        }
        ]

 */