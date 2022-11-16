package com.restaurant.foodWala.model;

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

@Entity
@Table
public class CustomerDetailsModel {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int customerId;
	
	@Column
	public String customerName;
	
//	@OneToMany(mappedBy="cusmodel")
//	List<Main> maindata;

	
	
//	@ManyToMany(cascade = {CascadeType.ALL})
//	public List<MenuItemsModel> customerToMenuMapping;

	 	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
	    public Collection<Count> count = new ArrayList<>();

		public int getCustomerId() {
			return customerId;
		}

		public void setCustomerId(int customerId) {
			this.customerId = customerId;
		}

		public String getCustomerName() {
			return customerName;
		}

		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}

		public Collection<Count> getCount() {
			return count;
		}

		public void setCount(Collection<Count> count) {
			this.count = count;
		}
	 	
	 	
	 	
	
	

}
