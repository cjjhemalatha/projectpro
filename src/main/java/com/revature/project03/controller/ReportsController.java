package com.revature.project03.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.project03.model.Patient;
import com.revature.project03.model.Receptionist;
import com.revature.project03.service.ReportService;



@RestController
@CrossOrigin(origins = "*")
public class ReportsController {
	@Autowired
    private ReportService service;
	
	@GetMapping("/GeneratingReports")
	 public int totalPatients(@RequestBody Patient  patient) {
		 int count= service.countPatient(patient);
		return count;
		
		
		
	}
	

}


//@Query("SELECT e from Employee e where e.employeeName =:name ")       // using @query
//List<Employee> findByName(@Param("name") String name);