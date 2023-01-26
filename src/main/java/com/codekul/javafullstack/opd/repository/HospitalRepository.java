package com.codekul.javafullstack.opd.repository;

import com.codekul.javafullstack.opd.domain.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HospitalRepository extends JpaRepository<Hospital,Integer> {

}
