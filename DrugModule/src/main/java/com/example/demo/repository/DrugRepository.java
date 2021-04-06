package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.ConnectionTable;
import com.example.demo.model.Drug;

@Repository
public interface DrugRepository extends JpaRepository<Drug, Integer> {

	@Query(value = "SELECT * FROM drug WHERE drug_name=?1", nativeQuery = true)
	public List<Drug> findByName(String name);

	/*
	 * @Query(value=
	 * "select d.drug_id,d.drug_name,d.drug_manufacturer,d.drug_manufactured_date,d.drug_expiry_date,dl.location_name,dl.available_stock from drug d join drug_location dl on d.drug_id=dl.drug_id where d.drug_name=?1 and dl.location_name=?2"
	 * ,nativeQuery=true) public List<Drug> findByName(String name);
	 */
	/*
	 * @Query(
	 * "select d.drug_id,d.drug_name,d.drug_manufacturer,d.drug_manufactured_date,d.drug_expiry_date,dl.location_name,dl.available_stock from drugLocation dl inner join dl.drug d where d.drug_id= :drug_id and dl.location_name= :location_name"
	 * ) public List<Drug> SearchByLocationAndDrudId(int drug_id,String
	 * location_name);
	 */

	/*@Query(value = "select d.drug_id,d.drug_name,d.drug_manufacturer,d.drug_manufactured_date,d.drug_expiry_date,dl.location_name,dl.available_stock from drug d join drug_location dl on d.drug_id=dl.drug_id where d.drug_id=?1 and dl.location_name=?2", nativeQuery = true)
	public List<ConnectionTable> search(int id, String location);*/

}
