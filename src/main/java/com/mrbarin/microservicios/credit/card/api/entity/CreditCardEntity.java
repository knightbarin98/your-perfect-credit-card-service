package com.mrbarin.microservicios.credit.card.api.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "credit_card")
@ToString
public class CreditCardEntity {
	@Id
	private int id;
	private String passion;
	private float minSalary;
	private float maxSalary;
	private int minAge;
	private int maxAge;
	private String creditCards;
}
