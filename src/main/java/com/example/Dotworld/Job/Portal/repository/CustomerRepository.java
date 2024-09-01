package com.example.Dotworld.Job.Portal.repository;

import com.example.Dotworld.Job.Portal.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
