package com.restaurant.foodWala.EmailConfiguration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.restaurant.foodWala.Constants;
import com.restaurant.foodWala.repository.OtpVerificationRepository;
import com.restaurant.foodWala.vo.CustomerDetailsModel;
import com.restaurant.foodWala.vo.OTPVerification;

@Service
public class EmailConfigurationImpl implements EmailConfigurationInterface {
	
	private static Logger logger = LogManager.getLogger(EmailConfigurationImpl.class);


	@Autowired
	private JavaMailSender javaMailSender;
	
	@Autowired
	private OtpVerificationRepository otpVerificationRepo;

	@Value("${spring.mail.username}")
	private String sender;

	@Override
	public void sendMailAccountCreationSuccess(CustomerDetailsModel details) {

		try {

			String messageBody = Constants.mailBodyAccountCreationSuccess;
			String mailSubject = Constants.mailSubjectAccountCreation;

			sendMail(details.getCustomerEmailId(), messageBody, mailSubject);
		}
		catch (Exception e) {
			logger.error("Error occurred while sending email for account creation success : [{}]",e);
		}
	}

	@Override
	public void sendOtpVerificationMail(OTPVerification details) {

		try {

			int randomPin = (int) (Math.random() * 9000) + 1000;

			String messageBody = Constants.otpMailBody + String.valueOf(randomPin);
			String mailSubject = Constants.otpMailSubject;

			sendMail(details.getCustomerEmailId(), messageBody, mailSubject);
			
			details.setOtp(randomPin);
			
			otpVerificationRepo.save(details);
		}
		catch (Exception e) {
			logger.error("Error occurred while sending email for OTP verification : [{}].", e);
		}

	}
	
	private void sendMail(String emailId, String messageBody, String mailSubject) {

		SimpleMailMessage mailMessage = new SimpleMailMessage();

		mailMessage.setFrom(sender);
		mailMessage.setTo(emailId);
		mailMessage.setText(messageBody);
		mailMessage.setSubject(mailSubject);

		javaMailSender.send(mailMessage);

	}

	// Will be implemented later.
	@Override
	public void sendMailWithAttachment(EmailConfigurationModel details) {
		// TODO Auto-generated method stub
		return;
	}

}
