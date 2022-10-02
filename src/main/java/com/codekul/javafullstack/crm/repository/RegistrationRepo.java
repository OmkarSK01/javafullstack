package com.codekul.javafullstack.crm.repository;


import com.codekul.javafullstack.crm.domain.Registration;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RegistrationRepo extends JpaRepository<Registration,Integer> {

    Registration findByNameAndPassword(String name, String password);

}