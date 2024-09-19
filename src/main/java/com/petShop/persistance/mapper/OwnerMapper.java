package com.petShop.persistance.mapper;

import com.petShop.domain.dto.OwnerDTO;
import com.petShop.persistance.entity.Owner;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface OwnerMapper {

    @Mapping(source = "id", target = "ownerId")
    @Mapping(source = "pets", target = "petIds")
    @Mapping(source = "invoices", target = "invoiceIds")
    OwnerDTO    toOwnerDTO(Owner owner);

    @Mapping(source = "ownerId", target = "id")
    @Mapping(source = "petIds", target = "pets")
    @Mapping(source = "invoiceIds", target = "invoices")
    Owner toOwner(OwnerDTO ownerDTO);
}