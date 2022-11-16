package com.restaurant.foodWala.service;

import java.util.List;

import com.restaurant.foodWala.model.MenuItemsModel;

public interface MenuItemsInterface {
	
	public void addFoodItems(MenuItemsModel food);
	
	public void addAllFoodItems(List<MenuItemsModel> foods);
	
	public MenuItemsModel fetchById(int id);
	
	public List<MenuItemsModel> pagination (int a, int b);

}
