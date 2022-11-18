package com.restaurant.foodWala.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class OTPVerification {

	@Id
	@Column
	private String customerEmailId;

	@Column
	private long otp;

	@Column
	public String customerFirstName;

	@Column
	public String customerLastName;

	@Column
	public long customerMobileNumber;

	public OTPVerification() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OTPVerification(String customerEmailId, long otp, String customerFirstName, String customerLastName,
			long customerMobileNumber) {
		super();
		this.customerEmailId = customerEmailId;
		this.otp = otp;
		this.customerFirstName = customerFirstName;
		this.customerLastName = customerLastName;
		this.customerMobileNumber = customerMobileNumber;
	}

	public String getCustomerEmailId() {
		return customerEmailId;
	}

	public void setCustomerEmailId(String customerEmailId) {
		this.customerEmailId = customerEmailId;
	}

	public long getOtp() {
		return otp;
	}

	public void setOtp(long otp) {
		this.otp = otp;
	}

	public String getCustomerFirstName() {
		return customerFirstName;
	}

	public void setCustomerFirstName(String customerFirstName) {
		this.customerFirstName = customerFirstName;
	}

	public String getCustomerLastName() {
		return customerLastName;
	}

	public void setCustomerLastName(String customerLastName) {
		this.customerLastName = customerLastName;
	}

	public long getCustomerMobileNumber() {
		return customerMobileNumber;
	}

	public void setCustomerMobileNumber(long customerMobileNumber) {
		this.customerMobileNumber = customerMobileNumber;
	}

}