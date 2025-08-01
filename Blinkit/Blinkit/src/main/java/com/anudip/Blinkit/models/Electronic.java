package com.anudip.Blinkit.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.ToString;

@Entity
@Data
@ToString
public class Electronic {
    @Id
    private int id;
    private String name;
    private String description;
    private double price;
    private int quantity;
}
