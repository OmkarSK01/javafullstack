package com.codekul.javafullstack.opd.domain;

import javax.persistence.*;

@Entity
@Table(name = "srvice")
public class Srvice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    Integer id;
    String action;
    String serviceDesc;
    String qty;
    String rate;
    String disc;
    String discRs;
    String total;
    String doctor;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getServiceDesc() {
        return serviceDesc;
    }

    public void setServiceDesc(String serviceDesc) {
        this.serviceDesc = serviceDesc;
    }

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getDisc() {
        return disc;
    }

    public void setDisc(String disc) {
        this.disc = disc;
    }

    public String getDiscRs() {
        return discRs;
    }

    public void setDiscRs(String discRs) {
        this.discRs = discRs;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }
}
