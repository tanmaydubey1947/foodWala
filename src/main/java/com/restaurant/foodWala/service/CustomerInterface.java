package com.restaurant.foodWala.service;


import com.restaurant.foodWala.vo.CustomerDetailsModel;

public interface CustomerInterface {
	
	public void addCustomer(CustomerDetailsModel details);
	
	public void updateCustomer(CustomerDetailsModel details);

}
