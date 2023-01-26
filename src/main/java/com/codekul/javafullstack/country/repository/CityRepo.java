package com.codekul.javafullstack.country.repository;

import com.codekul.javafullstack.country.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Map;

public interface CityRepo extends JpaRepository<City,Integer> {
}
