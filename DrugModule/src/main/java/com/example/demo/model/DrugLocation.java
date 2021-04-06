package com.example.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "drugLocation")
public class DrugLocation {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "location_id")
	private int locationId;

	@Column(name = "location_name")
	private String locationName;

	@Column(name = "available_stock")
	private int availableStock;

	/*
	 * @OneToMany(mappedBy="drugLocation", fetch=FetchType.EAGER)
	 * 
	 * @JoinColumn(name="drug_id") private Set<Drug> drugList;
	 */
	/*
	 * @ManyToMany(fetch=FetchType.EAGER)
	 * 
	 * @JoinColumn(name="drug_id") private Set<Drug> drug;
	 */

	@ManyToOne(cascade = CascadeType.ALL)
	@JsonIgnore
	@JoinColumn(name = "drugId")
	private Drug drug;

}
