package com.codekul.javafullstack.country.repository;

import com.codekul.javafullstack.country.model.Pincode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Map;

public interface PincodeRepo extends JpaRepository<Pincode, Long> {
    //@Query(value = "select t.id,t.name,p.pincode,p.tahsil_id from pincode p inner join area t on p.id = pincode_id", nativeQuery = true)
    // @Query(value = "select t.id,t.name,s.name,s.country_id from state s inner join district t on s.id = t.state_id",nativeQuery = true)
    //@Query(value = "select t.id,t.pincode,s.name,s.district-id from tahsil s inner join pincode t on s.id = t.tahsil_id",inner join  t.id,t.name,p.pincode,p.tahsil_id from pincode p inner join area t on p.id = pincode_id", nativeQuery = true)



   @Query(value = "select st.name as stateName,dt.name as districtName,th.name as tahsilName,ct.name as cityName,ar.name as areaName from country as c inner join state as st on c.id = st.country_id inner join district as dt  on st.id = dt.state_id inner join tahsil as th on dt.id=th.district_id inner join city as ct on th.id = ct.tahsil_id inner join pincode as pn on ct.id = pn.city_id inner join area as ar on pn.id = ar.pincode_id where pincode = 411030", nativeQuery = true)

   List<Map<String, Object>> getTahsilWithPincode();

    Object getAreaByPincode(Long pincode);

    Object getTahsilByPincode(Long pincode);


//  List<PincodeResponse> getAllWithPincode();
    // List<Map<String,Object>> getAllWithPincode();
//
//    Object getStateByPincode(Long pincode);
//
    //  Object getAllByPincode(Long pincode);
//


}
