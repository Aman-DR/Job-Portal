package com.example.Dotworld.Job.Portal.service;

import com.example.Dotworld.Job.Portal.entity.Customer;
import com.example.Dotworld.Job.Portal.entity.Job;
import com.example.Dotworld.Job.Portal.repository.CustomerRepository;
import com.example.Dotworld.Job.Portal.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    JobRepository jobrepository;

    @Autowired
    CustomerRepository customerrepository;


    public List<Job> getJobs() {

        return jobrepository.findAll();
    }

    public List<Job>getJobById(Integer jobId) {


        return jobrepository.getJobByJobId(jobId);
    }

    public List<Job> getJobByCustomerId(Integer customerId) {

        return jobrepository.getJobByCustomerId(customerId);

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
            jobs.setCustomerId(customer);

            jobrepository.save(jobs);

            return "Job is Saved";
        }
        catch (RuntimeException e) {
            return "Customer ID is not found";
        }
    }

    public String updateJob(Integer jobId) {
        return "Working";
    }

    public String deleteJob(Integer jobId) {
        return "Working";
    }
}
