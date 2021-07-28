package com.mrbarin.microservicios.credit.card.api.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.mrbarin.microservicios.credit.card.api.entity.CreditCardEntity;

public interface CreditCardDao extends CrudRepository<CreditCardEntity, Integer> {
	
	@Query("select c from CreditCardEntity c where c.passion = ?1 and c.minSalary <= ?2 and c.maxSalary >= ?2 and c.minAge <= ?3 and c.maxAge >= ?3")
	CreditCardEntity findCreditCards(String passion, float salary, int age);
}
