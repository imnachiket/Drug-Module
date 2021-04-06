package com.example.demo.DrugController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.ConnectionTable;
import com.example.demo.model.Drug;
import com.example.demo.service.DrugSevice;

@RestController
@RequestMapping("/DrugsDetails")
public class DrugController{

	@Autowired
	private DrugSevice service;

	/*@PostMapping("/saveDrug")
	public Drug addDrug(@RequestBody Drug drug) {
		return service.saveDrug(drug);
	}

	@PostMapping("/saveDrugs")
	public List<Drug> addDrugs(@RequestBody List<Drug> drugs) {
		return service.saveDrugs(drugs);
	}

	@GetMapping("/drugs")
	public List<Drug> finalAll() {
		return service.getDrugs();
	}*/

	@GetMapping("/drugs/{id}")
	public Drug searchById(@PathVariable int id) {
		return service.searchDrugsById(id);
	}

	
	
	
	
	
	@GetMapping("/drugsByName/{name}")
	public List<Drug> searchByName(@PathVariable String name) {
		return service.searchByName(name);
	}

	
	/*@GetMapping("/search/{id}/{location}")
	public List<ConnectionTable> search(int id,String location){
		return service.search(id, location);
	}
	*/
	
	
	/*@GetMapping("/drugsByDrugIdAndLocation/{id}/{location}")
	public List<Drug> searchByLocationAndDrugId(@PathVariable int id,@PathVariable String location){
		return service.searchByLocationAndDrugId(id, location);
	}*/

	

	/*@PutMapping("/update")
	public Drug updateDrug(@RequestBody Drug drug) {
		return service.updateDrug(drug);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteDrug(@PathVariable int id) {
		return service.deleteDrug(id);
	}*/

}
