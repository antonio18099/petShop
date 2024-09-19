package com.petShop.persistance.mapper;


import com.petShop.domain.dto.PetDTO;
import com.petShop.persistance.entity.Pet;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PetMapper {


    @Mapping(source = "id", target = "idPet")
    @Mapping(source = "name", target = "namePet")
    @Mapping(source = "species", target = "speciesPet")
    PetDTO toPetDTO(Pet pet);

    @Mapping(source = "idPet", target = "id")
    @Mapping(source = "namePet", target = "name")
    @Mapping(source = "speciesPet", target = "species")
    @Mapping(source = "breedPet", target = "breed") // Ajusta si es necesario
    Pet toPet(PetDTO petDTO);
}
