//package com.codekul.javafullstack.onetumany.domain;

//import com.fasterxml.jackson.annotation.JsonBackReference;
//
//import javax.persistence.*;
//
//public class District {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Integer id;
//
//    private String name;
//
//
//    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
//    @JoinColumn(name = "state_id")
//    @JsonBackReference
//    private State state;
//
//
//}
