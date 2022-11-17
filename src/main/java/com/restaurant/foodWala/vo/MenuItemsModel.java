package com.restaurant.foodWala.vo;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table
public class MenuItemsModel {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int foodId;

	@Column
	public String foodName;

	@Column
	public int foodPrice;

//	@ManyToMany(mappedBy="customerToMenuMapping",cascade = {CascadeType.ALL})
//	public List<CustomerDetailsModel> menuToCustomerMapping;

	@OneToMany(mappedBy = "menuItems", cascade = CascadeType.ALL)
	@JsonIgnore
	public Collection<Count> count = new ArrayList<>();

	public MenuItemsModel(int foodId, String foodName, int foodPrice, Collection<Count> count) {
		super();
		this.foodId = foodId;
		this.foodName = foodName;
		this.foodPrice = foodPrice;
		this.count = count;
	}

	public MenuItemsModel() {
		super();
		// TODO Auto-generated constructor stub
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

	public Collection<Count> getCount() {
		return count;
	}

	public void setCount(Collection<Count> count) {
		this.count = count;
	}

}
