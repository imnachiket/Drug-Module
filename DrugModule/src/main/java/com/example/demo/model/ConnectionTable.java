package com.example.demo.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ConnectionTable {
	private Integer drugId;
	/*Integer i=Integer.valueOf(drugId);*/
	//Integer j=drugId;

	private String drugName;

	private String drugManufacturer;

	private Date drugManufacturedDate;

	private Date drugExpiryDate;

	private String locationName;

	private Integer availableStock;
}
