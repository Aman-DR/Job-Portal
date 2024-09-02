package com.example.Dotworld.Job.Portal.service;

import com.example.Dotworld.Job.Portal.entity.Job;
import com.example.Dotworld.Job.Portal.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WorkerService {

    @Autowired
    JobRepository jobRepository;

    public List<Job> getJobs() {

        return jobRepository.findAll() ;
    }

    public Optional<Job> getJobById(Integer jobId) {

        return jobRepository.findById(jobId);
    }

    public List<Job> getJobByCustomerId(Integer customerId) {

        return jobRepository.getJobByCustomer_CustomerId(customerId);

    }

    public String acceptJob(Integer jobId) {


        return "Working";
    }

    public String rejectJob(Integer jobId) {
        return "Working";
    }
}
