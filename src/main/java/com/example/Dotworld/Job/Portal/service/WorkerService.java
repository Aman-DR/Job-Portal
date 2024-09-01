package com.example.Dotworld.Job.Portal.service;

import org.springframework.stereotype.Service;

@Service
public class WorkerService {

    public String getJobs() {

        return "Working";
    }

    public String getJobById(Integer jobId) {

        return "Working";
    }

    public String getJobByCustomerId(Integer customerId) {

        return "Working";

    }

    public String acceptJob(Integer jobId) {

        return "Working";
    }

    public String rejectJob(Integer jobId) {
        return "Working";
    }
}
