package com.codekul.javafullstack.country.controller;

import com.codekul.javafullstack.country.model.State;
import com.codekul.javafullstack.country.service.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class StateController {

    @Autowired
    private StateService stateService;

    @PostMapping("saveState")
    public String saveState(@RequestBody State state){

        return stateService.saveState(state);
    }


//@GetMapping("/getStateByPincode")
//    public Map<String,Object> getStateByPincode(@RequestParam String pincode){
//        return stateService.getStateByPincode(pincode);
//    }


}





/*
{
  "district": [
    {

      "name": "pune"
    },
{

      "name": "mumbai"
    }
  ],

  "name": "maharashtra"
}
 */
