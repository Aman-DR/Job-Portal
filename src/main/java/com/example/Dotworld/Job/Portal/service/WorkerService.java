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

        return jobRepository.findAll();
    }

    public Optional<Job> getJobById(Integer jobId) {

        return jobRepository.findById(jobId);
    }

    public List<Job> getJobByCustomerId(Integer customerId) {

        return jobRepository.getJobByCustomer_CustomerId(customerId);

    }

    public String acceptJob(Integer jobId) {

        try {

            Job jobs = jobRepository.findById(jobId)
                    .orElseThrow(() -> new RuntimeException("Job not found with ID: " + jobId));

            jobs.setJobStatus("ACCEPTED");

            jobRepository.save(jobs);

            return "Job Status updated";
        } catch (RuntimeException e) {
            return "Job ID is not found";
        }
    }

        public String rejectJob (Integer jobId){
            try {

                Job jobs = jobRepository.findById(jobId)
                        .orElseThrow(() -> new RuntimeException("Job not found with ID: " + jobId));

                jobs.setJobStatus("REJECTED");

                jobRepository.save(jobs);

                return "Job Status updated";
            } catch (RuntimeException e) {
                return "Job ID is not found";
            }
        }

}


