package com.khadri.spring.mvc.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.khadri.spring.mvc.form.Refund;

@Service
public class RefundService {
	private static Map<String, Double> orderItemCost = new HashMap<>();
	static {

		orderItemCost.put("Shoe", 200.98);
	}

	public boolean checkForItem(Refund refund) {
		return orderItemCost.containsKey(refund.getName());
	}
}
