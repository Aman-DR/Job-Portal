package com.example.Dotworld.Job.Portal.controller;


import com.example.Dotworld.Job.Portal.entity.Job;
import com.example.Dotworld.Job.Portal.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	// To access the end-point ofCustomer

    @Autowired
    CustomerService customerservice;

    @GetMapping("/getjob")
    public List<Job> getJobs(){

        return customerservice.getJobs();
    }

    @GetMapping("/jobId/{jobId}")
    public Optional<Job> getJobById(@PathVariable Integer jobId){
        return customerservice.getJobById(jobId);
    }

    @GetMapping("/custId/{customerId}")
    public List<Job> getJobByCustomerId(@PathVariable Integer customerId){
        return customerservice.getJobByCustomerId(customerId);
    }

    @PostMapping("/create/{customerId}")
    public String createJob(@PathVariable Integer customerId, @RequestBody Job job){
        return customerservice.createJob(customerId,job);
    }

    @PutMapping("/update/{jobId}")   //{jobId}
    public String updateJob(@PathVariable Integer jobId, @RequestBody Job job){
        return customerservice.updateJob(jobId,job);
    }

    @DeleteMapping("/delete/{jobId}")
        public String deleteJob(@PathVariable Integer jobId){
            return customerservice.deleteJob(jobId);
        }







}
