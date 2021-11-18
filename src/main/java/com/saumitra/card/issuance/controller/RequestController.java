package com.saumitra.card.issuance.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/request")
public class RequestController {
	
	@GetMapping("/create")
	public String createDebitCardRequest() {
		return "Debit Card Request Created";
	}
	
	public String createCreditCardRequest() {
		return "Credit Card Request Created";
	}
	
	@GetMapping("/getCard")
	public String getCard() {
		return "xxxxxxxxxxx";
	}

}
