package com.petShop.persistance;

import com.petShop.persistance.crud.ProductsCrudRepository;
import com.petShop.persistance.entity.Pet;
import com.petShop.persistance.entity.Products;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public class ProductsRepository {

    private ProductsCrudRepository ProductsCrudRepository;


    public List<Products> getALL() {
        return (List<Products>) ProductsCrudRepository.findAll();
    }

    public Optional<Products> getPetById(int id) {
        return ProductsCrudRepository.findById(id);
    }


    public Products save(Products products) {
        return ProductsCrudRepository.save(products);
    }

    public void delete(int id) {
        ProductsCrudRepository.deleteById(id);
    }

    public boolean existsProducts(int id) {
       return ProductsCrudRepository.existsById(id);
    }

    public long countALL(){
        return ProductsCrudRepository.count();
    }
}
