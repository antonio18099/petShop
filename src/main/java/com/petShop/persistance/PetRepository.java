package com.petShop.persistance;

import com.petShop.persistance.crud.PetCrudRepository;
import com.petShop.persistance.entity.Pet;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class PetRepository {
    private PetCrudRepository PetCrudRepository;


    public Optional<Pet> getPetById(int id) {
        return PetCrudRepository.findById(id);
    }

    public List<Pet> getBySpecies(String species){
        return PetCrudRepository.findBySpeciesOrderByIdAsc(species);
    }
    public Optional<Pet> getById(Integer id){
        return PetCrudRepository.findById(id);
    }

    public List<Pet>getALL(){
        return (List<Pet>) PetCrudRepository.findAll();
    }
    public Pet save(Pet pet) {
        return PetCrudRepository.save(pet);
    }

    public void delete(int id){
        PetCrudRepository.deleteById(id);
    }

    public boolean existsPet(int id){
        return PetCrudRepository.existsById(id);
    }

    public long countALL(){
        return PetCrudRepository.count();
    }
}
