package com.example.Dotworld.Job.Portal.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
@Entity
public class Address {

    @Id
    @Column(name = "address_id")
    private Integer addressId;
    private String state;
    private String suburb;
    private Integer postcode;





}
