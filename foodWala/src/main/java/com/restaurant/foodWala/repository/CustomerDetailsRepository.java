package com.restaurant.foodWala.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restaurant.foodWala.model.CustomerDetailsModel;

public interface CustomerDetailsRepository extends JpaRepository<CustomerDetailsModel,Integer> {

}
