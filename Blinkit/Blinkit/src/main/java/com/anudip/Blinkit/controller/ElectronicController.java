package com.anudip.Blinkit.controller;

import com.anudip.Blinkit.models.Electronic;
import com.anudip.Blinkit.service.ElectronicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/electronic")
public class ElectronicController {
    @Autowired
    private ElectronicService electronicService;

    @PostMapping("/add")
    public void addElectronic(@RequestBody Electronic electronic) {
        electronicService.add(electronic);
    }
    @PostMapping("/addAll")
    public void addAllElectronic(@RequestBody List<Electronic> electronics) {
        electronicService.addAll(electronics);
    }

    @GetMapping("/get/{id}")
    public Electronic getElectronic(@PathVariable int id) {
        return electronicService.get(id);
    }
    @GetMapping("/getAll")
    public List<Electronic> getAllElectronic() {
        return electronicService.getAll();
    }

    @DeleteMapping("/del/{id}")
    public void deleteElectronic(@PathVariable int id) {
        electronicService.delete(id);
    }
    @DeleteMapping("/delAll")
    public void deleteAllElectronic() {
        electronicService.deleteAll();
    }

    @PutMapping("/update/{id}")
    public void updateElectronic(@PathVariable int id, @RequestBody Electronic electronic) {
        electronicService.update(id, electronic);
    }
}
