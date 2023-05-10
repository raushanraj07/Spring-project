package com.foodrecipie.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodrecipie.entity.Review;
import com.foodrecipie.repo.ReviewRepository;

@Service
public class ReviewService {

	@Autowired
	ReviewRepository reviewrepo;
	
	public Review save(Review review){
		return reviewrepo.save(review);
		
	}
	public List<Review> getAllreview() {
		return reviewrepo.findAll();
	}

	
}
