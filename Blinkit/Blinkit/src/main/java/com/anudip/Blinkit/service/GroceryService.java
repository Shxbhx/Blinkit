package com.anudip.Blinkit.service;

import com.anudip.Blinkit.models.Grocery;
import com.anudip.Blinkit.repo.GroceryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GroceryService {
    @Autowired
    private GroceryRepo groceryRepo;

    //Insert
    public void add(Grocery grocery) {
        groceryRepo.save(grocery);
    }
    //Insert Multiple
    public void addAll(List<Grocery> groceries) {
        groceryRepo.saveAll(groceries);
    }
    //Read by ID * select
    public Grocery get(Integer id) {
        return groceryRepo.findById(id).get();
    }
    //Read All
    public List<Grocery> getAll() {
        return groceryRepo.findAll();
    }
    //Delete by ID
    public void delete(Integer id) {
        groceryRepo.deleteById(id);
    }
    //Delete All *
    public void deleteAll() {
        groceryRepo.deleteAll();
    }
    //Update
    public void update(int id,Grocery grocery) {
        Optional<Grocery> oldData = groceryRepo.findById(id);
        oldData.get().setName(grocery.getName());
        oldData.get().setDescription(grocery.getDescription());
        oldData.get().setPrice(grocery.getPrice());
        oldData.get().setQuantity(grocery.getQuantity());
        groceryRepo.save(grocery);
    }
}
