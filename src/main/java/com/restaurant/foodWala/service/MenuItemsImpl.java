package com.restaurant.foodWala.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.restaurant.foodWala.repository.MenuItemsRepository;
import com.restaurant.foodWala.vo.MenuItemsModel;

@Service
public class MenuItemsImpl implements MenuItemsInterface {

	
	@Autowired
	MenuItemsRepository menurep;
	
	
	@Override
	public void addFoodItems(MenuItemsModel food)
	{
		menurep.save(food);
	}
	
	@Override
	public void addAllFoodItems(List<MenuItemsModel> foods)
	{
		menurep.saveAll(foods);
	}
	
	@Override
	public MenuItemsModel fetchById(int id)
	{
		return menurep.findById(id).get();
	}
	
	
	@Override
	public List<MenuItemsModel> pagination (int a, int b)
	{
		PageRequest p = PageRequest.of(a, b);
		Page<MenuItemsModel> pagedResult = menurep.findAll(p);
		return pagedResult.toList();
	}
	
	MenuItemsModel findByfoodId(int foodId)
	{
		return menurep.findByfoodId(foodId);
	}
}
