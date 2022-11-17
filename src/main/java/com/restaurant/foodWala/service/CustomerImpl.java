package com.restaurant.foodWala.service;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restaurant.foodWala.repository.CustomerDetailsRepository;
import com.restaurant.foodWala.repository.MenuItemsRepository;
import com.restaurant.foodWala.vo.Count;
import com.restaurant.foodWala.vo.CustomerDetailsModel;
import com.restaurant.foodWala.vo.MenuItemsModel;

@Service
public class CustomerImpl implements CustomerInterface {
	
	@Autowired
	CustomerDetailsRepository cusrep;
	
	@Autowired
	MenuItemsRepository menurep;
	
	@Autowired
	MenuItemsImpl menuimpl;
	
	@Override
	public void addCustomer(CustomerDetailsModel details)
	{
		CustomerDetailsModel newCustomer = new CustomerDetailsModel();
		newCustomer.setCustomerName(details.getCustomerName());
		
		newCustomer.getCount().addAll((details.getCount()
				.stream()
				.map(count ->{
					MenuItemsModel menuitems = menuimpl.findByfoodId(count.getMenuItems().getFoodId());
					Count newCount = new Count();
					newCount.setMenuItems(menuitems);
					newCount.setCustomer(newCustomer);
					newCount.setCountvalue(count.getCountvalue());
					return newCount;
					
				})
				.collect(Collectors.toList())
				));
		
		cusrep.save(newCustomer);
	}
	
	@Override
	public void updateCustomer(CustomerDetailsModel details)
	{
		cusrep.save(details);
	}

}
