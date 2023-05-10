package com.foodrecipie.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.foodrecipie.entity.Review;

@Repository
public interface ReviewRepository extends JpaRepository<Review, String>{
	

}
