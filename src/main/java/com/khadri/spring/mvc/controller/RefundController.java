package com.khadri.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.khadri.spring.mvc.form.Refund;
import com.khadri.spring.mvc.service.RefundService;

@Controller
public class RefundController {

	private RefundService refundService;
	
	@GetMapping("/refund")
	public String refundPage(@ModelAttribute("refund") Refund refund) {
		return "refund";
	}

	@PostMapping("/return")
	@ResponseBody
	public String itemRefund(@ModelAttribute("refund") Refund refund) {
		refundService.checkForItem(refund);
		return "Refund Success";
	}
	
	
}
