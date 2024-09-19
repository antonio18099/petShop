package com.petShop.persistance.mapper;

import com.petShop.domain.dto.BillDTO;
import com.petShop.persistance.entity.Bill;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface BillMapper {

        @Mapping(source = "owner.ownerId", target = "ownerId")
        BillDTO toBillDTO(Bill bill);

        @Mapping(source = "ownerId", target = "owner.ownerId")
        Bill toBill(BillDTO billDTO);
    }





