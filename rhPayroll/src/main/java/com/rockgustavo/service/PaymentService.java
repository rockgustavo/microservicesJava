package com.rockgustavo.service;

import org.springframework.stereotype.Service;

import com.rockgustavo.model.Payment;

@Service
public class PaymentService {

	public Payment getPayment(Long workerId, int days) {
		
		return new Payment("Bia", 200.0, days);
	}

}
