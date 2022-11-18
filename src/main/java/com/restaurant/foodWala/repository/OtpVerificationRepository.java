package com.restaurant.foodWala.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restaurant.foodWala.vo.OTPVerification;

public interface OtpVerificationRepository extends JpaRepository<OTPVerification,String> {

}
