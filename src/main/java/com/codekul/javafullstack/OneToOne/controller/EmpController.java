package com.codekul.javafullstack.OneToOne.controller;


import com.codekul.javafullstack.OneToOne.domain.Employee;
import com.codekul.javafullstack.OneToOne.repository.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpController {

    @Autowired
    private EmpRepo empRepo;

    @PostMapping("saveEmp")
    public String  saveEmp(@RequestBody Employee employee){
        empRepo.save(employee);
        return "emp saved..";
    }
}