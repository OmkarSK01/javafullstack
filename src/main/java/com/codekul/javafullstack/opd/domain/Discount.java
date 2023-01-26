package com.codekul.javafullstack.opd.domain;

import javax.persistence.*;

@Entity
@Table(name = "discount")
public class Discount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    Integer id;
    String discount;
    String discountAmt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getDiscountAmt() {
        return discountAmt;
    }

    public void setDiscountAmt(String discountAmt) {
        this.discountAmt = discountAmt;
    }
}
