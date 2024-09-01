package com.example.Dotworld.Job.Portal.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    private Integer addressId;
    private String state;
    private String suburb;
    private Integer postcode;





}
