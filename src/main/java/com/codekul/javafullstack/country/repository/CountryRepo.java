package com.codekul.javafullstack.country.repository;


import com.codekul.javafullstack.country.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepo extends JpaRepository<Country,Integer> {
}
