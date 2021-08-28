package com.revature.project03.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.revature.project03.model.Patient;


@Repository
@Transactional


public interface ReportsRepository extends JpaRepository<Patient,Integer>{
	
	@Query("SELECT count(p) from Patient p where p.Date =:date ")
	int findById(@Param("name") String name);
}


//@Query("SELECT e from Employee e where e.employeeName =:name ")       // using @query
//List<Employee> findByName(@Param("name") String name);