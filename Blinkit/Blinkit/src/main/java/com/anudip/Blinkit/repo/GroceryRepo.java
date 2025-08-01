package com.anudip.Blinkit.repo;

import com.anudip.Blinkit.models.Grocery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroceryRepo extends JpaRepository<Grocery,Integer> {

}
