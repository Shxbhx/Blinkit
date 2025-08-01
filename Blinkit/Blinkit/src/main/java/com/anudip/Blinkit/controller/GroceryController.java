package com.anudip.Blinkit.controller;
import com.anudip.Blinkit.models.Grocery;
import com.anudip.Blinkit.service.GroceryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController       //Create Web layer
@RequestMapping("/grocery")
public class GroceryController {
    @Autowired
    private GroceryService groceryService;

    @PostMapping("/add")
    public void addGrocery(@RequestBody Grocery grocery) {
        groceryService.add(grocery);
    }
    @PostMapping("addAll")
    public void addAllGrocery(@RequestBody Grocery[] grocery) {
       groceryService.addAll(List.of(grocery));
    }

    @GetMapping("/get/{id}")
    public Grocery getGroceryById(@PathVariable int id) {
        return groceryService.get(id);
    }
    @GetMapping("/getAll")
    public List<Grocery> getAllGrocery() {
        return groceryService.getAll();
    }

    @DeleteMapping("/del/{id}")
    public void deleteGrocery(@PathVariable int id) {
        groceryService.delete(id);
    }
    @DeleteMapping("/delAll")
    public void deleteAllGrocery() {
        groceryService.deleteAll();
    }

    //Update
    @PutMapping("/update/{id}")
    public void updateGrocery(@PathVariable int id, @RequestBody Grocery grocery) {
        groceryService.update(id, grocery);
    }
}
