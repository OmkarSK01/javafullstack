package com.codekul.javafullstack.opd.controller;


import com.codekul.javafullstack.opd.domain.Discount;
import com.codekul.javafullstack.opd.repository.DiscountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiscountController {

    @Autowired
    private DiscountRepository discountRepository;

    @PostMapping("saveDiscount")
    public String saveDiscount(@RequestBody Discount discount) {
        discountRepository.save(discount);
        return "Discount saved...";
    }
}
