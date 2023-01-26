package com.codekul.javafullstack.country.repository;


import com.codekul.javafullstack.country.model.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepo extends JpaRepository<State,Integer> {
    //Object getStateByPincode(String pincode);

}
