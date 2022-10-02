package com.codekul.javafullstack.manytomany.domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter //lombok 2 jun la zala ani response class sathi github repository paha 2 jun
@Setter
public class Subjects {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String subCode;

//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getSubCode() {
//        return subCode;
//    }
//
//    public void setSubCode(String subCode) {
//        this.subCode = subCode;
//    } //he getter setter use 1 jun la zal
}