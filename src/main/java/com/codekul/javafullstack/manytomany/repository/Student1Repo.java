package com.codekul.javafullstack.manytomany.repository;

import com.codekul.javafullstack.manytomany.domain.Student1;
import com.codekul.javafullstack.onetomany.domain.Vehical;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Student1Repo extends JpaRepository<Student1,Integer> {
}
