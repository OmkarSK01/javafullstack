//package com.codekul.javafullstack.onetumany.domain;

//import com.codekul.javafullstack.onetomany.domain.Vehical;
//import com.fasterxml.jackson.annotation.JsonBackReference;
//
//import javax.persistence.*;
//
//@Entity
//public class Orders {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Integer id;
//    private String name;
//    private Long number;
//
//    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
//    @JoinColumn(name = "ordermangment_id")
//    @JsonBackReference
//    private Ordermangment ordermangment;
//
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
//    public Long getNumber() {
//        return number;
//    }
//
//    public void setNumber(Long number) {
//        this.number = number;
//    }
//
//    public Ordermangment getOrdermangment() {
//        return ordermangment;
//    }
//
//    public void setOrdermangment(Ordermangment ordermangment) {
//        this.ordermangment = ordermangment;
//    }
//
//}
//
