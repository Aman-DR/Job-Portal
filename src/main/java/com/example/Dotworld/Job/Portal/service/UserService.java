package com.example.Dotworld.Job.Portal.service;


import com.example.Dotworld.Job.Portal.entity.Customer;
import com.example.Dotworld.Job.Portal.entity.User;
import com.example.Dotworld.Job.Portal.entity.Worker;
import com.example.Dotworld.Job.Portal.repository.CustomerRepository;
import com.example.Dotworld.Job.Portal.repository.UserRepository;
import com.example.Dotworld.Job.Portal.repository.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userrepository;

    @Autowired
    CustomerRepository customerrepository;

    @Autowired
    WorkerRepository workerrepository;

    public String createUser(User user) {

        userrepository.save(user);

        String stringUserType = user.getUserType().toString(); // converting the Object "Usertype" into String.

        if (stringUserType.equals("CUSTOMER")) {
            Customer customer = new Customer();
            customer.setName(user.getName());
            customer.setEmailId(user.getEmailId());
            customer.setMobile(user.getMobile());

            customerrepository.save(customer);  //Saving in customerRepo

            return "Customer user Added";


        } else if (stringUserType.equals("WORKER")) {
            Worker worker = new Worker();
            worker.setName(user.getName());
            worker.setEmailId(user.getEmailId());
            worker.setMobile(user.getMobile());

            workerrepository.save(worker);      //Saving in workerRepo

            return "Worker user Added";
        }

        else{
            return "Invalid User type, try to add WORKER or CUSTOMER in UserType";
        }


    }
}

