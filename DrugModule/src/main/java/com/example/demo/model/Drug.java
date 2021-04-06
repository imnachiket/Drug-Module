package com.example.demo.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "drug")
@Entity
public class Drug {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "drug_id")
	private int drugId;

	@Column(name = "drug_name")
	private String drugName;

	@Column(name = "drug_manufacturer")
	private String drugManufacturer;

	@Column(name = "drug_manufactured_date")
	private Date drugManufacturedDate;

	@Column(name = "drug_expiry_date")
	private Date drugExpiryDate;

	@Column(name = "drug_units_per_package")
	private int drugUnitsPerPackage;

	@Column(name = "drug_cost_per_package")
	private int drugCostPerPackage;

	@OneToMany(mappedBy = "drug")
	private List<DrugLocation> druglocations = new ArrayList<DrugLocation>();
	
	/*private String locationName;
	
	private int availableStock;*/

}
