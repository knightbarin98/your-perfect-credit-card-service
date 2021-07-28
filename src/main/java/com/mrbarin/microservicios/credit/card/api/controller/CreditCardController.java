package com.mrbarin.microservicios.credit.card.api.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mrbarin.microservicios.credit.card.api.dto.ProspectParams;
import com.mrbarin.microservicios.credit.card.api.service.CreditCardService;

@RestController
public class CreditCardController {
	
	@Autowired
	private CreditCardService creditCardService;
	
	@Autowired
	private ObjectMapper mapper;

	@GetMapping("/perfect-credit-card")
	@ResponseBody
	public String cajerosCerca(@RequestBody String json)
			throws IOException {
		return creditCardService.getCreditCards(mapper.readValue(json, ProspectParams.class));
	}
	
}
