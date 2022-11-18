package com.restaurant.foodWala.service;


import com.restaurant.foodWala.vo.CustomerDetailsModel;
import com.restaurant.foodWala.vo.OTPVerification;

public interface CustomerInterface {
	
	public void customerEnrollment(OTPVerification details);
	
	public void updateCustomer(CustomerDetailsModel details);
	
	public void customerOTPVerification(OTPVerification otpVerification);

}
