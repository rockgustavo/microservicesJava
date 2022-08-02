package com.rockgustavo.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.rockgustavo.model.Payment;
import com.rockgustavo.model.Worker;

@Service
public class PaymentService {
	
	@Value("${rhWorker.host}")
	private String rhWorkerHost;
	
	
	@Autowired
	private RestTemplate restTemplate;

	public Payment getPayment(Long workerId, int days) {
		Map<String, String> uriVariables = new HashMap<>();
		uriVariables.put("id", ""+workerId);
		
		Worker worker = restTemplate.getForObject(rhWorkerHost + "/workers/{id}", Worker.class, uriVariables);
		
		
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}

}
