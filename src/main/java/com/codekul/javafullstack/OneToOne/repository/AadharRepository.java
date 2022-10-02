package com.codekul.javafullstack.OneToOne.repository;

import com.codekul.javafullstack.OneToOne.domain.Aadhar;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AadharRepository extends JpaRepository<Aadhar,Integer> {
}