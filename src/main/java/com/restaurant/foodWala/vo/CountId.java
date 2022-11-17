package com.restaurant.foodWala.vo;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;

@Embeddable
public class CountId implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public int customerId;
	public int foodId;
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public int getFoodId() {
		return foodId;
	}
	public void setFoodId(int foodId) {
		this.foodId = foodId;
	}
	@Override
	public int hashCode() {
		return Objects.hash(customerId, foodId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CountId other = (CountId) obj;
		return customerId == other.customerId && foodId == other.foodId;
	}
	
	
	
	
}
