package com.mrbarin.microservicios.credit.card.api.dto;


import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
public class ProspectParams {
	
	private String passion;
	private float salary;
	private int age;
	
}
