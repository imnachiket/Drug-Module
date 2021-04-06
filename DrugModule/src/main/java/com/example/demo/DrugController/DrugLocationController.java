package com.example.demo.DrugController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.DrugLocation;
import com.example.demo.service.DrugLocationService;

@RestController
@RequestMapping("/DrugLocation")
public class DrugLocationController {

	@Autowired
	private DrugLocationService drugLocationService;
	

	@GetMapping("/locations/{id}")
	public DrugLocation searchById(@PathVariable int id) {
		return drugLocationService.searchLocationById(id);
	}

	@GetMapping("/drugsByDrugIdAndLocation/{id}/{location}")
	public List<DrugLocation> searchByLocationAndDrugId(@PathVariable int id, @PathVariable String location) {
		return drugLocationService.searchByLocationAndDrugId(id, location);
	}
	
	/*@GetMapping("/search/{id}/{location}")
	public List<DrugLocation> search(int id,String location){
		return drugLocationService.search(id, location);
	}*/
	

}
