package com.codekul.javafullstack.country.controller;

import com.codekul.javafullstack.country.model.Tahsil;
import com.codekul.javafullstack.country.service.TahsilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class TahsilController {

    @Autowired
    private TahsilService tahsilService;

    @PostMapping("saveTahsil")
    public String saveTahsil(@RequestBody Tahsil tahsil){

        return tahsilService.saveTahsil(tahsil);
    }


}




/* country-state-district

{

"name": "India",
  "state": [
    {
      "district": [
        {

          "name": "satara"
          },
          {

          "name": "sangli"
          }
          ],
          "name": "Maharashtra"
    }
  ]
}

*/

/*  tahsil-pincode-area 3 table created
       {
          "name": "Haveli",

            "pincode": [
            {
            "area": [
            {
             "name": "Navi Peth"
             },
             {
             "name": "Kothrud"
             }
            ],
            "pincode": "411030"
                }
              ]
            }



 */