package com.example.Dotworld.Job.Portal.controller;


import com.example.Dotworld.Job.Portal.entity.Job;
import com.example.Dotworld.Job.Portal.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/worker")
public class WorkerController {

    @Autowired
    WorkerService workerservice;



    @GetMapping("/getjob")
    public List<Job> getJobs(){

        return workerservice.getJobs();
    }

    @GetMapping("/jobId/{jobId}")
    public Optional<Job> getJobById(@PathVariable Integer jobId){
        return workerservice.getJobById(jobId);
    }

    @GetMapping("/custId/{jobId}")
    public List<Job> getJobByCustomerId(@PathVariable Integer customerId){
        return workerservice.getJobByCustomerId(customerId);
    }

    @PutMapping("/accept/{jobId}")
    public String acceptJob(@PathVariable Integer jobId){

        return  workerservice.acceptJob(jobId);
    }

    @PutMapping("/reject/{jobId}")
    public String rejectJob(@PathVariable Integer jobId){


        return workerservice.rejectJob(jobId);
    }


}
