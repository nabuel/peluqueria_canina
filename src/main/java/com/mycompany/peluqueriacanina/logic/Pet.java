package com.mycompany.peluqueriacanina.logic;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Pet implements Serializable {
    
    //Attributies.
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    int num_customer;
    
    @Basic
    String name_dog;
    String breed;
    String color;
    String allergic;
    String special_atenttion;
    String observation;
    
    @OneToOne
    Owner owner;
    
    //Constructors.

    public Pet() {
    }

    public Pet(int num_customer, String name_dog, String breed, String color, String allergic, String special_atenttion, String observation, Owner owner) {
        this.num_customer = num_customer;
        this.name_dog = name_dog;
        this.breed = breed;
        this.color = color;
        this.allergic = allergic;
        this.special_atenttion = special_atenttion;
        this.observation = observation;
        this.owner = owner;
    }

    
    
    //Getters and setters.

    public int getNum_customer() {
        return num_customer;
    }

    public void setNum_customer(int num_customer) {
        this.num_customer = num_customer;
    }

    public String getName_dog() {
        return name_dog;
    }

    public void setName_dog(String name_dog) {
        this.name_dog = name_dog;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAllergic() {
        return allergic;
    }

    public void setAllergic(String allergic) {
        this.allergic = allergic;
    }

    public String getSpecial_atenttion() {
        return special_atenttion;
    }

    public void setSpecial_atenttion(String special_atenttion) {
        this.special_atenttion = special_atenttion;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
    
}
