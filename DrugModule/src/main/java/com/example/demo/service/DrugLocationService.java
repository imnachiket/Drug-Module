package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.DrugLocation;
import com.example.demo.repository.DrugLocationRepository;

@Service
public class DrugLocationService {
	@Autowired
	private DrugLocationRepository drugLocationRepository;

	public DrugLocation searchLocationById(int id) {
		return drugLocationRepository.findById(id).orElse(null);
	}

	public List<DrugLocation> searchByLocationAndDrugId(int id, String location) {
		return drugLocationRepository.findByLocationAndDrudId(id, location);
	}

	/*public List<DrugLocation> search(int id, String location) {
		return drugLocationRepository.SearchByLocationAndDrudId(id, location);
	}*/

	/*public List<SearchByIdAndName> search(int id, String location) {
		return drugLocationRepository.searchByIdAndName(id, location);
	}*/

}
