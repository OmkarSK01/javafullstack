package com.codekul.javafullstack.country.impl;

import com.codekul.javafullstack.country.model.State;
import com.codekul.javafullstack.country.repository.StateRepo;
import com.codekul.javafullstack.country.service.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

import static com.codekul.javafullstack.util.Constants.*;

@Service
public class StateImpl implements StateService {

    @Autowired
    private StateRepo stateRepo;

    @Override
    public String saveState(State state) {
//        if(state.getName().equals("Maharashtra")){
//            return "Maharashtra state not allowed";
//        }
        stateRepo.save(state);

        return "state saved..";
    }

//    @Override
//    public Map<String, Object> getStateByPincode(String pincode) {
//        return null;
//    }

//    @Override
//    public Map<String, Object> getStateByPincode(String pincode ) {
//        Map<String,Object> map = new HashMap<>();
//        map.put(MESSAGE,"Get All ");
//        map.put(STATUS, HttpStatus.CREATED.value());
//        map.put(RESULT,stateRepo.getStateByPincode(pincode));
//        return map;
//    }


}
