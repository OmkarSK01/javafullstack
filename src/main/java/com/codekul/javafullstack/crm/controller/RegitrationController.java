package com.codekul.javafullstack.crm.controller;


import com.codekul.javafullstack.crm.domain.Registration;
import com.codekul.javafullstack.crm.repository.RegistrationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class RegitrationController {

    @Autowired
    private RegistrationRepo registrationRepo;

    @PostMapping("registration")
    public String registration(@RequestBody Registration registration) {
        registrationRepo.save(registration);
        return "Registration successful....";
    }

    @GetMapping("login")
    public String login(@RequestParam String username, @RequestParam String password) {
        try {
            Registration registration = registrationRepo.findByNameAndPassword(username, password);
            if (registration != null) {
                return "Login successfully....";
            } else {
                return "Login Failed";
            }
        } catch (Exception e) {
            return e.getMessage();
        }
    }
}