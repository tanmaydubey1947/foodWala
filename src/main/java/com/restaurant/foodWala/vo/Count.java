package com.restaurant.foodWala.vo;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Count {
    
	@EmbeddedId
	public CountId countId = new CountId();
	 
	
		@ManyToOne
	    @MapsId("customerId")
	    @JoinColumn(name = "customer_id")
	    @JsonIgnore
	    public CustomerDetailsModel customer;
		
		@ManyToOne
	    @MapsId("foodId")
	    @JoinColumn(name = "food_id")
	    public MenuItemsModel menuItems;
		
		public int countvalue;

		public Count() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Count(CountId countId, CustomerDetailsModel customer, MenuItemsModel menuItems, int countvalue) {
			super();
			this.countId = countId;
			this.customer = customer;
			this.menuItems = menuItems;
			this.countvalue = countvalue;
		}

		public CountId getCountId() {
			return countId;
		}

		public void setCountId(CountId countId) {
			this.countId = countId;
		}

		public CustomerDetailsModel getCustomer() {
			return customer;
		}

		public void setCustomer(CustomerDetailsModel customer) {
			this.customer = customer;
		}

		public MenuItemsModel getMenuItems() {
			return menuItems;
		}

		public void setMenuItems(MenuItemsModel menuItems) {
			this.menuItems = menuItems;
		}

		public int getCountvalue() {
			return countvalue;
		}

		public void setCountvalue(int countvalue) {
			this.countvalue = countvalue;
		}

		
	 
}
