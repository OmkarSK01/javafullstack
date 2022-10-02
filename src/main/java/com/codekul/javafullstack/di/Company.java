package com.codekul.javafullstack.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
/*@Component
public class Company {
    private Employee employee;
    @Autowired
    public void setEmployee(Employee employee){
        this.employee = employee;
    }
    public void display(){
        employee.show();
    }

}*/


@Component
public class Company {
    //field based injection or wiring
    @Autowired
    private Employee employee;

    //setter based injection
    /*@Autowired
    public void setEmployee(Employee employee){
        this.employee = employee;
    }
    */
    //constructor based injection
    /*@Autowired
    public Company(Employee employee){ //he as pn lihu shkto
    this.employee = employee;
    }
     */
    public void display(){
       employee.show();
    }

}
