package com.mycompany.peluqueriacanina.logic;

import com.mycompany.peluqueriacanina.persistence.PersistenceJpaController;
import java.util.ArrayList;

public class Controller {
    PersistenceJpaController control = new PersistenceJpaController();
    
    
    //Owner.
    
    public void createOwner(Owner owner){
        control.createOwner(owner);
    }
    
    public Owner readOwner(int id){
        return control.readOwner(id);
    }
    
    public ArrayList<Owner> readAllOwner(){
        return control.readAllOwner();
    }
    
    public void updateOwner(Owner owner){
        control.updateOwner(owner);
    }
    
    public void deleteOwner(int id){
        control.deleteOwner(id);
    }
    
    //Pet.
    
    public void createPet(Pet pet){
        control.createPet(pet);
    }
    
    public Pet readPet(int id){
        return control.readPet(id);
    }
    
    public ArrayList<Pet> readAllPet(){
        return control.readAllPet();
    }
    
    public void updatePet(Pet pet){
        control.updatePet(pet);
    }
    
    public void deletePet(int id){
        control.deletePet(id);
    }

    public void save(String name, String breed, String color, String allergic, String speAten, String nameOw, String phone, String address, String observation) {
        //Create owner
        Owner owner = new Owner();
        owner.setName(nameOw);
        owner.setPhone(phone);
        owner.setAddress(address);
        
        //Create pet
        Pet pet = new Pet();
        pet.setName_dog(name);
        pet.setBreed(breed);
        pet.setColor(color);
        pet.setAllergic(allergic);
        pet.setSpecial_atenttion(speAten);
        pet.setObservation(observation);
        pet.setOwner(owner);
        
        control.save(owner,pet);
    }
}
