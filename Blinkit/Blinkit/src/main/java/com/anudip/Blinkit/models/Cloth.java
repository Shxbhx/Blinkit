package com.anudip.Blinkit.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.ToString;

@Entity
@ToString
@Data
public class Cloth {
    @Id
    private int id;
    private String name;
    private String description;
    private double price;
    private int quantity;
}
