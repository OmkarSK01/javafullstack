package com.codekul.javafullstack.manytomany.controller;


import com.codekul.javafullstack.manytomany.domain.Course;
import com.codekul.javafullstack.manytomany.domain.Student1;
import com.codekul.javafullstack.manytomany.repository.CourseRepo;
import com.codekul.javafullstack.manytomany.repository.Student1Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
//31may
@RestController
public class Student1Controller {

    @Autowired
    private CourseRepo courseRepo;

    @Autowired
    private Student1Repo student1Repo;

    @PostMapping("saveCourse")
    public String saveCourse(@RequestBody Course course) {
        courseRepo.save(course);
        return "course saved...";
    }

    @PostMapping("saveStudent1")
    public String saveStudent1(@RequestBody Student1 student1) {
        student1Repo.save(student1);
        return "student saved...";
    }


}

/*
{
        "id": "1",
        "name": "java",
        "courseCode": "001"
        } */ //he save course sathi postman la

/*
{
      "name": "Rahul",
      "address": "Pune",
      "courses": [
          {
              "id": 2
          },
          {
              "id": 3
          }
      ]
  }
 */ //he saveStudent1 sathi