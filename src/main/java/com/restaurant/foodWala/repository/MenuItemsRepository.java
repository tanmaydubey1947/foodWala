package com.restaurant.foodWala.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restaurant.foodWala.model.MenuItemsModel;

public interface MenuItemsRepository extends JpaRepository <MenuItemsModel,Integer> {
	
	MenuItemsModel findByfoodId(int foodId);
}
