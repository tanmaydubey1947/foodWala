package com.restaurant.foodWala.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.tomcat.util.http.fileupload.RequestContext;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restaurant.foodWala.dao.CustomerDetailsDto;
import com.restaurant.foodWala.model.CustomerDetailsModel;
import com.restaurant.foodWala.repository.CustomerDetailsRepository;
import com.restaurant.foodWala.repository.MenuItemsRepository;
import com.restaurant.foodWala.service.CustomerInterface;

@SuppressWarnings("unused")
@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	private static Logger logger = LogManager.getLogger(CustomerDetailsModel.class);

	@Autowired
	MenuItemsRepository menrep;

	@Autowired
	CustomerInterface cusrep;

	@Autowired
	ModelMapper modelMapper;
	
	@Autowired
	CustomerDetailsRepository cusrep1;

//	@PostMapping("/addCustomer")
//	public String addCustomer(@RequestBody CustomerDetailsDto details )
//	{
//		CustomerDetailsModel customerEntity = modelMapper.map(details, CustomerDetailsModel.class);
//		cusrep.addCustomer(customerEntity);
//		return "customer added";
//	}

	@PostMapping("/addCustomer")
	public String addCustomer(@RequestBody CustomerDetailsModel details) {
		
		
		cusrep.addCustomer(details);
		return "customer added";
	}

	@PutMapping("/updateCustomer")
	public String updateCustomer(@RequestBody CustomerDetailsDto details) {
		CustomerDetailsModel customerEntity = modelMapper.map(details, CustomerDetailsModel.class);
		cusrep.addCustomer(customerEntity);
		
		return "customer details updated";
	}
	
	@GetMapping("/findAll")
	public List<CustomerDetailsModel> findall()
	{
		return cusrep1.findAll();
	}

//	@PostMapping("/addCustomerChecked")
//	public String addCustomerChecked(@RequestBody CustomerDetailsModel details) {
//		List<MenuItemsModel> validate = new ArrayList<MenuItemsModel>();
//		validate = menrep.findAll();
//		int count=0;
//		 List<Integer> serial = new ArrayList<Integer>();
//		
//		for(int i=0;i<validate.size();i++)
//		{
//			for(int j=0;j<details.customerToMenuMapping.size();j++)
//			{
//				if(validate.get(i).getFoodName().equals(details.customerToMenuMapping.get(j).getFoodName()))
//				{
//					count++;
//					serial.add(i);
//				}
//			}
//		}
//		
//		if(count!=details.getCustomerToMenuMapping().size())
//		{
//			return "please check menu again";
//		}
//			
//		else
//		{
//			details.customerToMenuMapping.clear();
//			for(int i=0;i<serial.size();i++)
//			{
//				int temp = serial.get(i);
//				details.customerToMenuMapping.add(validate.get(temp));
//			}
//			cusrep.addCustomer(details);
//			return "items added";
//		}
//		
//		
//	}

}
