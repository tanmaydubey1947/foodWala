package com.restaurant.foodWala.dao;

public class CustomerDetailsDto {

		public int customerId;
		public String customerName;
		public CustomerDetailsDto() {
			super();
			// TODO Auto-generated constructor stub
		}
		public CustomerDetailsDto(int customerId, String customerName) {
			super();
			this.customerId = customerId;
			this.customerName = customerName;
		}
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
		
		
	
}
