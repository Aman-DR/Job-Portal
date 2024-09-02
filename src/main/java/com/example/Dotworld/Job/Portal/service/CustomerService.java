package com.example.Dotworld.Job.Portal.service;

import com.example.Dotworld.Job.Portal.entity.Customer;
import com.example.Dotworld.Job.Portal.entity.Job;
import com.example.Dotworld.Job.Portal.repository.CustomerRepository;
import com.example.Dotworld.Job.Portal.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    JobRepository jobrepository;

    @Autowired
    CustomerRepository customerrepository;


    public List<Job> getJobs() {

        return jobrepository.findAll();
    }

    public Optional<Job> getJobById(Integer jobId) {


        return jobrepository.findById(jobId);
    }

    public List<Job> getJobByCustomerId(Integer customerId) {

        return jobrepository.getJobByCustomer_CustomerId(customerId);

    }

    public String createJob(Integer customerId, Job job) {

        try {

            Customer customer = customerrepository.findById(customerId)
                    .orElseThrow(() -> new RuntimeException("Customer not found with ID: " + customerId));

            Job jobs = new Job();
            jobs.setJobId(job.getJobId());
            jobs.setJobCategory(job.getJobCategory());
            jobs.setDescription(job.getDescription());
            jobs.setDueDate(job.getDueDate());
            jobs.setPaymentMethod(job.getPaymentMethod());
            jobs.setPrice(job.getPrice());
            jobs.setCustomer(customer);

            jobrepository.save(jobs);

            return "Job is Saved";
        }
        catch (RuntimeException e) {
            return "Customer ID is not found";
        }
    }


    public String updateJob(Integer jobId, Job job) {

        try{

        Job jobss = jobrepository.findById(jobId)
                .orElseThrow(() -> new RuntimeException("Job not found with ID: " + jobId));

        Job jobs = new Job();

        jobs.setJobCategory(job.getJobCategory());
        jobs.setDescription(job.getDescription());
        jobs.setDueDate(job.getDueDate());
        jobs.setPaymentMethod(job.getPaymentMethod());
        jobs.setPrice(job.getPrice());
        jobs.setCustomer(job.getCustomer());

        jobrepository.save(jobs);

        return "Updated the Job Properly";
    }
         catch (RuntimeException e) {
            return "Job ID is not found";
        }
    }

    public String deleteJob(Integer jobId) {

        try{
            Job jobss = jobrepository.findById(jobId)
                    .orElseThrow(() -> new RuntimeException("Job not found with ID: " + jobId));

            jobrepository.deleteById(jobId);

            return "Job deleted";

        }
        catch (RuntimeException e) {
            return "Job ID is not found";
        }
    }
}
