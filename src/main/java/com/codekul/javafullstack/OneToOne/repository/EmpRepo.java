package com.codekul.javafullstack.OneToOne.repository;


import com.codekul.javafullstack.OneToOne.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpRepo extends JpaRepository<Employee,Integer> {
}