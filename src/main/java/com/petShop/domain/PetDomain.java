package com.petShop.domain;

import jakarta.persistence.Column;
import lombok.Data;

@Data

public class PetDomain {
    private Integer idPet;
    private String namePet;
    private String speciesPet;
    private String breedPet;
    private OwnerDomain ownerDomain;
}
