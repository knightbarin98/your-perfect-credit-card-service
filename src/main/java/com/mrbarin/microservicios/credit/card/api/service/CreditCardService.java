package com.mrbarin.microservicios.credit.card.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mrbarin.microservicios.credit.card.api.dao.CreditCardDao;
import com.mrbarin.microservicios.credit.card.api.dto.ProspectParams;

@Service
public class CreditCardService {

	@Autowired
	private CreditCardDao creditCardDao;

	public String getCreditCards(ProspectParams params) {
		return creditCardDao.findCreditCards(params.getPassion(), params.getSalary(), params.getAge()).getCreditCards();
	}
}
