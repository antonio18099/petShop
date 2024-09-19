package com.petShop.persistance.mapper;

import com.petShop.domain.dto.SuppliersDTO;
import com.petShop.persistance.entity.Products;
import com.petShop.persistance.entity.Suppliers;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

import java.util.List;
import java.util.stream.Collectors;

@Mapper(componentModel = "spring")
public interface SuppliersMapper {

    @Mapping(source = "productIds", target = "products")
    @Mapping(target = "quotes", ignore = true) // Ignora si no es necesario mapear
    SuppliersDTO toSuppliersDTO(Suppliers suppliers);

    @Mapping(source = "products", target = "productIds")
    Suppliers toSuppliers(SuppliersDTO suppliersDTO);

    default List<Object> mapProductsToIds(List<Products> products) {
        return products.stream().map(Products::getId).collect(Collectors.toList()).reversed();
    }

    default List<Products> mapIdsToProducts(List<Integer> productIds) {
        SimpleJpaRepository productRepositoty = null;
        return productRepositoty.findAllById(productIds);
    }
}
