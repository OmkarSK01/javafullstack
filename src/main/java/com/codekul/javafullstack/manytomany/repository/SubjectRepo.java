package com.codekul.javafullstack.manytomany.repository;

import com.codekul.javafullstack.manytomany.domain.Subjects;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepo extends JpaRepository<Subjects,Integer> {
}