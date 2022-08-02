package com.rockgustavo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rockgustavo.feignclients.WorkerFeignClient;
import com.rockgustavo.model.Payment;
import com.rockgustavo.model.Worker;

@Service
public class PaymentService {
	
	@Autowired
	private WorkerFeignClient workerFeignClient;

	public Payment getPayment(Long workerId, int days) {
		Worker worker = workerFeignClient.findById(workerId).getBody();
		
		
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}

}
