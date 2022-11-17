package com.restaurant.foodWala.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.restaurant.foodWala.vo.CustomerDetailsModel;

@Repository
public class CustomerDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	
	public void addCustomer (CustomerDetailsModel customerDetails) {
		
		String sql = "INSERT INTO  CUSTOMER_DETAILS_MODEL VALUES ()";
		
		
		
	}

}
