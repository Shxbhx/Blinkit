package com.anudip.Blinkit.controller;

import com.anudip.Blinkit.models.Cloth;
import com.anudip.Blinkit.service.ClothService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cloth")
public class ClothController {
    @Autowired
    private ClothService clothService;

    @PostMapping("/add")
    public void addCloth(@RequestBody Cloth cloth) {
        clothService.add(cloth);
    }
    @PostMapping("addAll")
    public void addAllCloth(@RequestBody Cloth[] cloth) {
        clothService.addAll(List.of(cloth));
    }

    @GetMapping("/get/{id}")
    public Cloth getClothById(@PathVariable int id) {
        return clothService.get(id);
    }
    @GetMapping("/getAll")
    public List<Cloth> getAllCloth() {
        return clothService.getAll();
    }

    @DeleteMapping("/del/{id}")
    public void deleteCloth(@PathVariable int id) {
        clothService.delete(id);
    }
    @DeleteMapping("/delAll")
    public void deleteAllCloth() {
        clothService.deleteAll();
    }

    //Update
    @PutMapping("/update/{id}")
    public void updateCloth(@PathVariable int id, @RequestBody Cloth cloth) {
        clothService.update(id, cloth);
    }

}
