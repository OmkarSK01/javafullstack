package com.codekul.javafullstack.country.controller;

import com.codekul.javafullstack.country.model.Country;
import com.codekul.javafullstack.country.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class CountryController {


    @Autowired
    private CountryService countryService;

    @PostMapping("saveCountry")
    public String saveCountry(@RequestBody Country country){

        return countryService.saveCountry(country);
    }

}





//swageer obj don'nt pass id postman la thoda vegla obj "Maharashtra" the comma ahe fkt
/*
{

        "name": "India",
        "state": [
        {

        "name": "Maharashtra"
        },
        {

        "name": "Gujrat"
        }
        ]
        }

 */




 /*


//trial
/*
{
  //country
  "name": "india",
  "state": [
    {
      "district": [
        {

          "name": "Satara"
        },
        {

          "name": "Thane"
        }
      ],

      "name": "Maharashtra"
    }
  ]
}
 */

/* //country-state-district-tahsil-pincode-area
{

  "name": "India",
  "state": [
    {
      "district": [
        {

          "name": "Pune",
          "tahsil": [
            {

              "name": "Haveli",
              "pincode": [
                {
                  "area": [
                    {

                      "name": "Kothrud"
                    },

                    {

                      "name": "NaviPeth"
                    }
                  ],

                  "pincode": "411030"
                }
              ]
            }
          ]
        }
      ],

      "name": "Maharashtra"
    }
  ]
}
 */

/*   //country-state-district-tahsil-city-pincode-area


{

  "name": "India",
  "state": [
    {
      "district": [
        {

          "name": "Pune",
          "tahsil": [
            {
              "city": [
                {

                  "name": "Pimpari",
                  "pincode": [
                    {
                      "area": [
                        {

                          "name": "Kothrud"
                        },
                        {

                          "name": "Navi Peth"
                        }
                      ],

                      "pincode": "411030"
                    }
                  ]
                }
              ],

              "name": "Haveli"
            }
          ]
        }
      ],

      "name": "Maharashtra"
    }
  ]
}

 */