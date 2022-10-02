package com.codekul.javafullstack.manytomany.repository;

import com.codekul.javafullstack.manytomany.domain.Course;
import com.codekul.javafullstack.manytomany.domain.Student1;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepo extends JpaRepository<Course,Integer> {
}
