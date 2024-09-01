package com.example.Dotworld.Job.Portal.controller;


import com.example.Dotworld.Job.Portal.entity.Job;
import com.example.Dotworld.Job.Portal.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerService customerservice;

    @GetMapping("/getjob")
    public List<Job> getJobs(){

        return customerservice.getJobs();
    }

    @GetMapping("/getjob/{jobId}")   // {jobId}
    public List<Job> getJobById(@PathVariable Integer jobId){  //@PathVariable
        return customerservice.getJobById(jobId);
    }

    @GetMapping("/getJob/1")  //{customerId}
    public List<Job> getJobByCustomerId(Integer customerId){  //@PathVariable
        return customerservice.getJobByCustomerId(customerId);
    }

    @PostMapping("/create/{customerId}")
    public String createJob(@PathVariable Integer customerId, @RequestBody Job job){


        return customerservice.createJob(customerId,job);
    }

    @PutMapping("/update/{jobId}")   //{jobId}
    public String updateJob(@PathVariable Integer jobId){
        return customerservice.updateJob(jobId);
    }

    @DeleteMapping("/delete/1")
        public String deleteJob(Integer jobId){
            return customerservice.deleteJob(jobId);
        }







}
