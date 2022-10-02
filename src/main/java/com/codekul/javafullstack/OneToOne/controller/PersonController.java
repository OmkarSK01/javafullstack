package com.codekul.javafullstack.OneToOne.controller;

import com.codekul.javafullstack.OneToOne.domain.Aadhar;
import com.codekul.javafullstack.OneToOne.domain.Person;

import com.codekul.javafullstack.OneToOne.repository.AadharRepository;
import com.codekul.javafullstack.OneToOne.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private AadharRepository aadharRepository;


    @PostMapping("savePerson")
    public String savePerson(){
        Person person = new Person();

        person.setName("Prakash");
        person.setAddress("Pune");

        Aadhar aadhar = new Aadhar();
        aadhar.setNumber(2434342343445L);
        aadhar.setPerson(person);

        person.setAadhar(aadhar);

        personRepository.save(person);
        aadharRepository.save(aadhar);

        return "saved person";

    }

}