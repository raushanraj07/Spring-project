package com.foodrecipie.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodrecipie.entity.User;


public interface UserRepository extends JpaRepository<User, Integer> {

    User findUserByEmail(String email);

}
