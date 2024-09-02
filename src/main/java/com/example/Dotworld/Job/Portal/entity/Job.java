package com.example.Dotworld.Job.Portal.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer jobId;
    private String jobCategory;
    private String description;
    private String dueDate;
    private String paymentMethod;
    private Integer price;

    private String jobStatus = "PENDING";

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id")
    private Customer customer;

}
