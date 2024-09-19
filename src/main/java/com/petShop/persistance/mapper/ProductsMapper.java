package com.petShop.persistance.mapper;

import com.petShop.domain.dto.ProductsDTO;
import com.petShop.persistance.entity.Pet;
import com.petShop.persistance.entity.Products;
import com.petShop.persistance.entity.Suppliers;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

import java.util.List;
import java.util.stream.Collectors;

@Mapper(componentModel = "spring")
public interface ProductsMapper {
    @Mapping(source = "id", target = "productId") // Ajusta si es necesario
    @Mapping(source = "pets", target = "petIds")
    @Mapping(source = "providers", target = "providerIds")
    ProductsDTO toProductsDTO(Products products);

    @Mapping(source = "productId", target = "id") // Ajusta si es necesario
    @Mapping(source = "petIds", target = "pets")
    @Mapping(source = "providerIds", target = "providers")
    Products toProducts(ProductsDTO productsDTO);

    // Métodos auxiliares para mapear listas de Pets
    default List<Integer> mapPetsToIds(List<Pet> pets) {
        return pets.stream().map(Pet::getId).collect(Collectors.toList());
    }

    default List<Pet> mapIdsToPets(List<Integer> petIds) {
        // Aquí debes implementar cómo recuperar las entidades Pet a partir de los IDs
        SimpleJpaRepository petRepository = null;
        return petRepository.findAllById(petIds);
    }

    // Métodos auxiliares para mapear listas de Suppliers
    default List<Integer> mapProvidersToIds(List<Suppliers> providers) {
        return providers.stream().map(Suppliers::getId).collect(Collectors.toList());
    }

    default List<Suppliers> mapIdsToProviders(List<Integer> providerIds) {
        // Aquí debes implementar cómo recuperar las entidades Suppliers a partir de los IDs
        SimpleJpaRepository supplierRepository = null;
        return supplierRepository.findAllById(providerIds);
    }
}