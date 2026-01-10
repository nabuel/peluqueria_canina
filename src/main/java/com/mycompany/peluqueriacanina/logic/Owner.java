package com.mycompany.peluqueriacanina.logic;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Owner implements Serializable {
    
    //Attributies
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id_owner;
    
    @Basic
    private String name;
    private String phone;
    private String address;
            
    //Constructors.

    public Owner() {
    }

    public Owner(int id_owner, String name, String phone, String address) {
        this.id_owner = id_owner;
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    //Getters and setters.

    public int getId_owner() {
        return id_owner;
    }

    public void setId_owner(int id_owner) {
        this.id_owner = id_owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
}
