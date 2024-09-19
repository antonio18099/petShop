package com.petShop.domain.dto;

import lombok.Data;

@Data
public class PetDTO {

    private Integer idPet;
    private String namePet;
    private String speciesPet;
    private int agePet;
    private String genderPet;
    private Integer ownerId;


}
