package com.example.NeoPay.Repo;

import com.example.NeoPay.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {
    User findByUserName(String userName);
}
