package com.petShop.domain.repository;

import com.petShop.domain.PetDomain;
import com.petShop.persistance.entity.Pet;

import java.util.List;

public interface PetDomainRepository {

    List<PetDomain> getALL();
    PetDomain save(PetDomain petDomain);
    void delete(int idPet);
    boolean existsPet(int idPet);
    long countALL();
}
