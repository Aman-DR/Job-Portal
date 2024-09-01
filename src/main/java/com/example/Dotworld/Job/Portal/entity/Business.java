package com.example.Dotworld.Job.Portal.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Business {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "business_id")
    private Integer businessId;
    private String name;
    private String address;
    private Integer abn;
    private Integer acn;
}
