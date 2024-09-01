package com.example.Dotworld.Job.Portal.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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

  //  private Business businessId;

    //private String JobStatus;

//    private User userId;

}
