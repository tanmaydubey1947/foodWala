package com.restaurant.foodWala.EmailConfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/triggerEmail")
public class EmailTriggerController {

	@Autowired
	private EmailConfigurationInterface emailService;

	@PostMapping("/sendMail")
	public String sendMail(@RequestBody EmailConfigurationModel details) {
		String status = emailService.sendSimpleMail(details);

		return status;
	}

}
