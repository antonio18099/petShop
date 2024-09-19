package com.petShop.persistance.mapper;

import com.petShop.domain.dto.QuotesDTO;
import com.petShop.persistance.entity.Quotes;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface QuotesMapper {

    @Mapping(source = "pet.id", target = "petId")
    QuotesDTO toQuotesDTO(Quotes quotes);

    @Mapping(source = "petId", target = "pet.id")
    Quotes toQuotes(QuotesDTO quotesDTO);
}