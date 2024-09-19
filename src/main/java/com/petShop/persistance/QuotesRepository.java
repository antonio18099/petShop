package com.petShop.persistance;

import com.petShop.persistance.crud.QuotesCrudRepository;
import com.petShop.persistance.entity.Pet;
import com.petShop.persistance.entity.Quotes;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public class QuotesRepository {

    private QuotesCrudRepository QuotesCrudRepository;


    public List<Quotes>getALL(){
        return (List<Quotes>) QuotesCrudRepository.findAll();
    }

    public Optional<Quotes> getPetById(int id) {
        return QuotesCrudRepository.findById(id);
    }


    public Quotes save(Quotes quotes) {
        return QuotesCrudRepository.save(quotes);
    }

    public void delete(int id) {
        QuotesCrudRepository.deleteById(id);
    }

    public boolean existsBill(int id) {
        return QuotesCrudRepository.existsById(id);
    }

    public long countALL(){
        return QuotesCrudRepository.count();
    }
}
