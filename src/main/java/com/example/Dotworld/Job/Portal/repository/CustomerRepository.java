package com.example.Dotworld.Job.Portal.repository;

import com.example.Dotworld.Job.Portal.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
