package com.restaurant.foodWala.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restaurant.foodWala.repository.CustomerDetailsRepository;
import com.restaurant.foodWala.repository.MenuItemsRepository;
import com.restaurant.foodWala.service.CustomerInterface;
import com.restaurant.foodWala.vo.CustomerDetailsModel;

@SuppressWarnings("unused")
@RestController
@RequestMapping("/customer")
public class CustomerController {

	private static Logger logger = LogManager.getLogger(CustomerDetailsModel.class);

	@Autowired
	MenuItemsRepository menuitemsRepository;

	@Autowired
	CustomerInterface customerInterface;

	@Autowired
	ModelMapper modelMapper;

	@Autowired
	CustomerDetailsRepository customerDetailsRepository;

	@PostMapping("/addCustomer")
	public String addCustomer(@RequestBody CustomerDetailsModel details) {

		customerInterface.addCustomer(details);
		return "customer added";
	}

	@PutMapping("/updateCustomer")
	public String updateCustomer(@RequestBody CustomerDetailsModel details) {

		//CustomerDetailsModel customerEntity = modelMapper.map(details, CustomerDetailsModel.class);
		customerInterface.updateCustomer(details);

		return "customer details updated";
	}

	@GetMapping("/getAllCustomers")
	public List<CustomerDetailsModel> findall() {
		return customerDetailsRepository.findAll();
	}

}
