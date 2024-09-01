package com.example.Dotworld.Job.Portal.controller;


import com.example.Dotworld.Job.Portal.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/worker")
public class WorkerController {

    @Autowired
    WorkerService workerservice;

    @GetMapping("/getjob")
    public String getJobs(){

        return workerservice.getJobs();
    }

    @GetMapping("/getjob/1")   // {jobId}
    public String getJobById(Integer jobId){  //@PathVariable
        return workerservice.getJobById(jobId);
    }

    @GetMapping("/getJob/1")  //{customerId}
    public String getJobByCustomerId(Integer customerId){  //@PathVariable
        return workerservice.getJobByCustomerId(customerId);
    }

    @PutMapping("/accept/1")
    public String acceptJob(Integer jobId){

        return  workerservice.acceptJob(jobId);
    }

    @PutMapping("/reject/1")
    public String rejectJob(Integer jobId){

        return workerservice.rejectJob(jobId);
    }


}
