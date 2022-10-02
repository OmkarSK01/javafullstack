package com.codekul.javafullstack.jdbctemplate;

import com.codekul.javafullstack.onetomany.domain.Vehical;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//16june he repositpry la bgha
//@RestController
//public class JdbcExample {
//    @Autowired
//    private JdbcTemplate jdbcTemplate;
//
//    @GetMapping("getVehicleById")
//    public List<VehicalDto> getVehical() {
//        return jdbcTemplate.query()
//
//                    new Object[]{id}, new VehicalRowMapper());
//
//        }
//
//    }
//}
