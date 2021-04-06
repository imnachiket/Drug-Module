package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.DrugLocation;

@Repository
public interface DrugLocationRepository extends JpaRepository<DrugLocation, Integer> {
	
	@Query(value="select * from drug_location where drug_id =?1 and location_name=?2",nativeQuery=true)
	public List<DrugLocation> findByLocationAndDrudId(int id,String location);
	
	/*@Query("select new com.example.demo.model.SearchByIdAndName(location_id,location_name) from DrugLocation where drug_id=?1 and location_name=?2")
	public List<SearchByIdAndName> searchByIdAndName(int id,String location);*/
	
	
	
	
	
	
	
	
	
}
