package com.example.Dotworld.Job.Portal.repository;

import com.example.Dotworld.Job.Portal.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

}
