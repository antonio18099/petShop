package com.petShop.persistance;

import com.petShop.persistance.crud.OwnerCrudRepository;
import com.petShop.persistance.entity.Owner;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public class OwnerRepository {
    private OwnerCrudRepository OwnerCrudRepository;

    public List<Owner>getALL(){
        return (List<Owner>) OwnerCrudRepository.findAll();
    }

    public Optional<Owner> getPetById(int id) {
        return OwnerCrudRepository.findById(id);
    }


    public Owner save(Owner owner) {
        return OwnerCrudRepository.save(owner);
    }

    public void delete(int id) {
        OwnerCrudRepository.deleteById(id);
    }

    public boolean existsOwner (int id){
        return OwnerCrudRepository.existsById(id);
    }

    public  long countALL(){
        return OwnerCrudRepository.count();
    }
}
