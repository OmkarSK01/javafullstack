package com.codekul.javafullstack.opd.controller;


import com.codekul.javafullstack.opd.domain.Srvice;
import com.codekul.javafullstack.opd.repository.SrviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SrviceController {
    @Autowired
    private SrviceRepository srviceRepository;

    @PostMapping("saveSrvice")
    public String saveHospital(@RequestBody Srvice srvice) {
        srviceRepository.save(srvice);
        return "Srvice saved...";
    }

}

