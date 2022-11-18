package com.restaurant.foodWala.EmailConfiguration;

import com.restaurant.foodWala.vo.CustomerDetailsModel;
import com.restaurant.foodWala.vo.OTPVerification;

public interface EmailConfigurationInterface {

	public void sendMailAccountCreationSuccess(CustomerDetailsModel details);
	
	public void sendOtpVerificationMail(OTPVerification details);

	public void sendMailWithAttachment(EmailConfigurationModel details);

}
