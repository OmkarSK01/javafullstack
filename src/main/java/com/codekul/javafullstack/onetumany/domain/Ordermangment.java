//package com.codekul.javafullstack.onetumany.domain;


//import com.fasterxml.jackson.annotation.JsonManagedReference;
//
//import javax.persistence.*;
//import java.util.List;
//
//@Entity
//public class Ordermangment {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Integer id;
//
//    private String name;
//
//    private String address;
//    private Long contact;
//    private String email;
//    private String password;
//
//    @OneToMany(mappedBy = "ordermangment", cascade = {CascadeType.PERSIST, CascadeType.REMOVE}, fetch = FetchType.LAZY)
//    @JsonManagedReference
//    private List<Orders> orders;
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
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    public Long getContact() {
//        return contact;
//    }
//
//    public void setContact(Long contact) {
//        this.contact = contact;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public List<Orders> getOrders() {
//        return orders;
//    }
//
//    public void setOrders(List<Orders> orders) {
//        this.orders = orders;
//    }
//}
