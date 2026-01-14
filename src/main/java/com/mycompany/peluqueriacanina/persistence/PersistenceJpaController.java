package com.mycompany.peluqueriacanina.persistence;

import com.mycompany.peluqueriacanina.logic.Owner;
import com.mycompany.peluqueriacanina.logic.Pet;
import com.mycompany.peluqueriacanina.persistence.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;

public class PersistenceJpaController {
    OwnerJpaController owJpa = new OwnerJpaController();
    PetJpaController petJpa = new PetJpaController();

    
    //Owner.
    public void createOwner(Owner owner) {
        owJpa.create(owner);
    }

    public Owner readOwner(int id) {
        return owJpa.findOwner(id);
    }

    public ArrayList<Owner> readAllOwner() {
        List<Owner> list = owJpa.findOwnerEntities();
        ArrayList<Owner> arrayOwner = new ArrayList(list);
        return arrayOwner;
    }
    
    public void updateOwner(Owner owner) {
        try {
            owJpa.edit(owner);
        } catch (Exception ex) {
            System.getLogger(PersistenceJpaController.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }

    public void deleteOwner(int id) {
        try {
            owJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            System.getLogger(PersistenceJpaController.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }
    
    //Pet.
    public void createPet(Pet pet) {
        petJpa.create(pet);
    }

    public Pet readPet(int id) {
        return petJpa.findPet(id);
    }

    public ArrayList<Pet> readAllPet() {
        List<Pet> list = petJpa.findPetEntities();
        ArrayList<Pet> arrayPet = new ArrayList(list);
        return arrayPet;
    }
    
    public void updatePet(Pet pet) {
        try {
            petJpa.edit(pet);
        } catch (Exception ex) {
            System.getLogger(PersistenceJpaController.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }

    public void deletePet(int id) {
        try {
            petJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            System.getLogger(PersistenceJpaController.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }

    public void save(Owner owner, Pet pet) {
        owJpa.create(owner);
        
        petJpa.create(pet);
    }

    public void modifyPet(Pet pet) {
        
        try {
            petJpa.edit(pet);
        } catch (Exception ex) {
            System.getLogger(PersistenceJpaController.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }

    public void modifyOwner(Owner owner) {
        try {
            owJpa.edit(owner);
        } catch (Exception ex) {
            System.getLogger(PersistenceJpaController.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }
    
    

}
