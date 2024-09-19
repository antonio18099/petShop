package com.petShop.persistance;

import com.petShop.persistance.crud.BillCrudRepository;
import com.petShop.persistance.entity.Bill;
import com.petShop.persistance.entity.Pet;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public class BillRepository {

    private BillCrudRepository BillCrudRepository;


    public List<Bill>getALL(){
        return (List<Bill>) BillCrudRepository.findAll();
    }

    public Optional<Bill> getPetById(int id) {
        return BillCrudRepository.findById(id);
    }


    public Bill save(Bill bill) {
        return BillCrudRepository.save(bill);
    }

    public void delete(int id) {
        BillCrudRepository.deleteById(id);
    }
    public boolean existsProducts(int id) {
        return BillCrudRepository.existsById(id);
    }

    public long countALL(){
        return BillCrudRepository.count();
    }
}
