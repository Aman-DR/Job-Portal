package com.example.Dotworld.Job.Portal.repository;

import com.example.Dotworld.Job.Portal.entity.Worker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkerRepository extends JpaRepository<Worker, Integer> {


}
