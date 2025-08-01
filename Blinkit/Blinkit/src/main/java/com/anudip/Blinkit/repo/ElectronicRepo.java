package com.anudip.Blinkit.repo;

import com.anudip.Blinkit.models.Electronic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ElectronicRepo extends JpaRepository<Electronic, Integer> {
}
