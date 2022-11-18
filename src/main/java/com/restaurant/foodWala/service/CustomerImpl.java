package com.restaurant.foodWala.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restaurant.foodWala.EmailConfiguration.EmailConfigurationInterface;
import com.restaurant.foodWala.repository.CustomerDetailsRepository;
import com.restaurant.foodWala.repository.MenuItemsRepository;
import com.restaurant.foodWala.repository.OtpVerificationRepository;
import com.restaurant.foodWala.vo.CustomerDetailsModel;
import com.restaurant.foodWala.vo.OTPVerification;

@Service
public class CustomerImpl implements CustomerInterface {
	
	@Autowired
	CustomerDetailsRepository cusrep;
	
	@Autowired
	MenuItemsRepository menurep;
	
	@Autowired
	MenuItemsImpl menuimpl;
	
	@Autowired
	private EmailConfigurationInterface emailService;
	
	@Autowired
	private OtpVerificationRepository otpVerificationRepo;
	
	@Override
	public void customerEnrollment(OTPVerification details)
	{
		
		emailService.sendOtpVerificationMail(details);
	}
	
	@Override
	public void updateCustomer(CustomerDetailsModel details)
	{
		cusrep.save(details);
	}

	@Override
	public void customerOTPVerification(OTPVerification otpVerification) {
		
		OTPVerification otpVerificationEnrollment = otpVerificationRepo.getById(otpVerification.getCustomerEmailId()); 
		
		if(otpVerificationEnrollment.getOtp() == otpVerification.getOtp()) {
			
			CustomerDetailsModel customerEnrollment = new CustomerDetailsModel();
			customerEnrollment.setCustomerEmailId(otpVerificationEnrollment.getCustomerEmailId());
			customerEnrollment.setCustomerFirstName(otpVerificationEnrollment.getCustomerFirstName());
			customerEnrollment.setCustomerLastName(otpVerificationEnrollment.getCustomerLastName());
			customerEnrollment.setCustomerMobileNumber(otpVerificationEnrollment.getCustomerMobileNumber());
			
			cusrep.save(customerEnrollment);
			otpVerificationRepo.deleteById(otpVerificationEnrollment.getCustomerEmailId());
			emailService.sendMailAccountCreationSuccess(customerEnrollment);
		}
		
	}

}
