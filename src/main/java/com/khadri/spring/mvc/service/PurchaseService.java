package com.khadri.spring.mvc.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.khadri.spring.mvc.form.Purchase;

@Service
public class PurchaseService {
	private static Map<String, Double> orderItemCost = new HashMap<>();
	static {

		orderItemCost.put("Shoe", 200.98);
	}

	public boolean checkForItem(Purchase purchase) {
		return orderItemCost.containsKey(purchase.getName());
	}
}
