package com.codekul.javafullstack.OneToOne.repository;


import com.codekul.javafullstack.OneToOne.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person,Integer> {
}
