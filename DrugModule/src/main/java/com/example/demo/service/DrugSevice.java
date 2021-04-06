package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.ConnectionTable;
import com.example.demo.model.Drug;
import com.example.demo.repository.DrugRepository;

@Service
public class DrugSevice {

	@Autowired
	private DrugRepository repository;

	/*
	 * public Drug saveDrug(Drug drug) { return repository.save(drug); }
	 * 
	 * public List<Drug> saveDrugs(List<Drug> drugs) { return
	 * repository.saveAll(drugs); }
	 * 
	 * public List<Drug> getDrugs() { return repository.findAll(); }
	 */

	public Drug searchDrugsById(int id) {
		return repository.findById(id).orElse(null);
	}

	public List<Drug> searchByName(String name) {
		return repository.findByName(name);
	}

	/*public List<ConnectionTable> search(int id, String location) {
		return repository.search(id, location);
	}
*/
	
	
	
	 /* public List<Drug> search(int id, String location) { return
	  repository.SearchByLocationAndDrudId(id, location); }
	 */
	  /*
	 * public List<Drug> searchByLocationAndDrugId(int id,String location){
	 * return repository.findByLocationAndDrudId(id, location); }
	 */

	/*
	 * public String deleteDrug(int id) { repository.deleteById(id); return
	 * "drug removed!!" + id; }
	 * 
	 * public Drug updateDrug(Drug drug) { Drug existingDrug =
	 * repository.findById(drug.getDrugId()).orElse(null);
	 * existingDrug.setDrugName(drug.getDrugName());
	 * existingDrug.setDrugManufacturer(drug.getDrugManufacturer());
	 * existingDrug.setDrugManufacturedDate(drug.getDrugManufacturedDate());
	 * existingDrug.setDrugExpiryDate(drug.getDrugExpiryDate());
	 * existingDrug.setDrugUnitsPerPackage(drug.getDrugUnitsPerPackage());
	 * existingDrug.setDrugCostPerPackage(drug.getDrugCostPerPackage()); return
	 * repository.save(existingDrug);
	 * 
	 * }
	 */

}
