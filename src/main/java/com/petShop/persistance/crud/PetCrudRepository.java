package com.petShop.persistance.crud;

import com.petShop.persistance.entity.Pet;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface PetCrudRepository extends CrudRepository<Pet,Integer> {

    List<Pet> findBySpeciesOrderByIdAsc( String species);

    Optional<Pet> findById (Integer id);

}
