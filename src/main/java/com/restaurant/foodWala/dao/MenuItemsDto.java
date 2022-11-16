package com.restaurant.foodWala.dao;

public class MenuItemsDto {

	public int foodId;
	public String foodName;
	public int foodPrice;
	public MenuItemsDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MenuItemsDto(int foodId, String foodName, int foodPrice) {
		super();
		this.foodId = foodId;
		this.foodName = foodName;
		this.foodPrice = foodPrice;
	}
	public int getFoodId() {
		return foodId;
	}
	public void setFoodId(int foodId) {
		this.foodId = foodId;
	}
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public int getFoodPrice() {
		return foodPrice;
	}
	public void setFoodPrice(int foodPrice) {
		this.foodPrice = foodPrice;
	}
	
	

}
