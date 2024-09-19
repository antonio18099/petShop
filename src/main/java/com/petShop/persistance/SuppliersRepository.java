package com.petShop.persistance;

import com.petShop.persistance.crud.SuppliersCrudRepository;
import com.petShop.persistance.entity.Pet;
import com.petShop.persistance.entity.Suppliers;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public class SuppliersRepository {

    private SuppliersCrudRepository SuppliersCrudRepository;

    public List<Suppliers>getALL(){
        return (List<Suppliers>) SuppliersCrudRepository.findAll();
    }

    public Optional<Suppliers> getPetById(int id) {
        return SuppliersCrudRepository.findById(id);
    }


    public Suppliers save(Suppliers suppliers) {
        return SuppliersCrudRepository.save(suppliers);
    }

    public void delete(int id) {
        SuppliersCrudRepository.deleteById(id);
    }

    public boolean existsSuppliers(int id) {
        return SuppliersCrudRepository.existsById(id);
    }

    public long countALL(){
        return SuppliersCrudRepository.count();
    }
}
