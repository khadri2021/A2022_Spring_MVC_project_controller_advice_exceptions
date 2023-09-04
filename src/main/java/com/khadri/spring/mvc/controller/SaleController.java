package com.khadri.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.khadri.spring.mvc.form.Purchase;
import com.khadri.spring.mvc.service.PurchaseService;

@Controller
public class SaleController {

	private PurchaseService purchaseService;

	@GetMapping("/")
	public String homePage() {
		return "home";
	}

	@GetMapping("/purchase")
	public String purchasePage(@ModelAttribute("purchase") Purchase purchase) {
		return "purchase";
	}

	@PostMapping("/sale")
	@ResponseBody
	public String payForItem(@ModelAttribute("purchase") Purchase purchase) {
		// Business Logic
		boolean checkForItem = purchaseService.checkForItem(purchase);
		// throw new IOException();
		// throw new RuntimeException();
		return isAvailable(checkForItem);
	}

	public String isAvailable(boolean checkForItem) {
		if (checkForItem) {
			return "Payment Success";
		}
		return "Payment Failed";
	}
	
	
}

	