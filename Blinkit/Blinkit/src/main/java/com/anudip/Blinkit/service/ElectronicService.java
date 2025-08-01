package com.anudip.Blinkit.service;

import com.anudip.Blinkit.models.Electronic;
import com.anudip.Blinkit.repo.ElectronicRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ElectronicService {
    @Autowired
    private ElectronicRepo electronicRepo;

    //Insert
    public void add(Electronic electronic) {
        electronicRepo.save(electronic);
    }
    //Insert Multiple
    public void addAll(List<Electronic> electronics) {
        electronicRepo.saveAll(electronics);
    }
    //Read by ID * select
    public Electronic get(Integer id) {
        return electronicRepo.findById(id).get();
    }
    //Read All
    public List<Electronic> getAll() {
        return electronicRepo.findAll();
    }
    //Delete by ID
    public void delete(Integer id) {
        electronicRepo.deleteById(id);
    }
    //Delete All *
    public void deleteAll() {
        electronicRepo.deleteAll();
    }
    //Update
    public void update(int id,Electronic electronic) {
        Optional<Electronic> oldData = electronicRepo.findById(id);
        oldData.get().setName(electronic.getName());
        oldData.get().setDescription(electronic.getDescription());
        oldData.get().setPrice(electronic.getPrice());
        oldData.get().setQuantity(electronic.getQuantity());
        electronicRepo.save(electronic);
    }
}
