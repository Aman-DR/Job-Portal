package com.example.Dotworld.Job.Portal.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer customerId;
    private String name;
    private String emailId;
    private Integer mobile;

    @OneToMany(mappedBy = "customer",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Job> jobs;
}
