package com.example.Dotworld.Job.Portal.repository;

import com.example.Dotworld.Job.Portal.entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobRepository extends JpaRepository<Job,Integer> {

    List<Job> getJobByJobId(Integer jobId);

    List<Job> getJobByCustomerId(Integer customerId);
}
