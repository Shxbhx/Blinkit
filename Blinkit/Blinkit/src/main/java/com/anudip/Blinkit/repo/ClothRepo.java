package com.anudip.Blinkit.repo;

import com.anudip.Blinkit.models.Cloth;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClothRepo extends JpaRepository<Cloth, Integer> {
}
