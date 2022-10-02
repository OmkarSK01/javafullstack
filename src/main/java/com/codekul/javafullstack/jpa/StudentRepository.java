package com.codekul.javafullstack.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {


   Student findByName(String name);         //18 may
   Student findByNameAndAddress(String name,String address);     //18 may
   Student findByNameOrAddress(String name,String address);


   Student findDistinctByName(String name);

   List<Student> findByBirthDateBetween(LocalDate localDate1, LocalDate localDate2);

   List<Student> findByIdLessThanEqual(Integer id);

   List<Student> findByBirthDateAfter(LocalDate localDate);
   List<Student> findByNameNotNull();
   List<Student> findByNameContaining(String name);
   List<Student> findByNameIn(List<String> list);

}