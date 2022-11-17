package com.restaurant.foodWala.EmailConfiguration;

public interface EmailConfigurationInterface {

	String sendSimpleMail(EmailConfigurationModel details);

	String sendMailWithAttachment(EmailConfigurationModel details);

}
