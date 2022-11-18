package com.restaurant.foodWala.EmailConfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restaurant.foodWala.vo.CustomerDetailsModel;

@RestController
@RequestMapping("/triggerEmail")
public class EmailTriggerController {

	@Autowired
	private EmailConfigurationInterface emailService;

	@PostMapping("/sendMail")
	public String sendMail(@RequestBody CustomerDetailsModel details) {
		emailService.sendMailAccountCreationSuccess(details);

		return "Mail Sent Successfully";
	}

}
