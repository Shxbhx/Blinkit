package com.anudip.Blinkit.service;

import com.anudip.Blinkit.models.Cloth;
import com.anudip.Blinkit.repo.ClothRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClothService {
    @Autowired
    private ClothRepo clothRepo;

    //Add
    public void add(Cloth cloth) {
        clothRepo.save(cloth);
    }
    //Add data multiple
    public void addAll(List<Cloth> cloths) {
        clothRepo.saveAll(cloths);
    }
    //Get by id
    public Cloth get(int id) {
        return clothRepo.findById(id).get();
    }
    //Get All data
    public List<Cloth> getAll() {
        return clothRepo.findAll();
    }
    //Delete by id
    public void delete(int id) {
        clothRepo.deleteById(id);
    }
    //Delete All data
    public void deleteAll() {
        clothRepo.deleteAll();
    }
    //Update by ID
    public void update(int id,Cloth cloth) {
        Optional<Cloth> oldData = clothRepo.findById(id);
        oldData.get().setName(cloth.getName());
        oldData.get().setDescription(cloth.getDescription());
        oldData.get().setPrice(cloth.getPrice());
        oldData.get().setQuantity(cloth.getQuantity());
        clothRepo.save(cloth);
    }
}
