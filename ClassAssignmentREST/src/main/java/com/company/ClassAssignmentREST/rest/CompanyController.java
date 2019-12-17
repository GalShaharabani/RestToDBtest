package com.company.ClassAssignmentREST.rest;

import java.util.List;

import javax.persistence.Id;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.company.ClassAssignmentREST.beans.Employee;
import com.company.ClassAssignmentREST.service.CompanyService;

@RestController
@RequestMapping("/company")
public class CompanyController {
	
	
	@Autowired
	CompanyService service;
	
	@GetMapping("/getAll")
	public List<Employee> getAllEmployess(){
		return service.getEmployees();
	}
	
	@GetMapping("/getAll2")
	public ResponseEntity<?> getAllEmployess2(){
		return new ResponseEntity<List<Employee>>(service.getEmployees(),HttpStatus.OK); 
	}
	
	@PostMapping("/addEmployee")
	public ResponseEntity<?> addEmployee(@RequestBody Employee employee) {
		return new ResponseEntity<>( service.addEmployee(employee), HttpStatus.OK);
	}
	
	@GetMapping("/getByName")
	public ResponseEntity<?> getEmployeeByName(@RequestParam(name = "name")String name){
		return new ResponseEntity<List<Employee>>(service.getEmployeeByName(name), HttpStatus.OK);
	}
	
	@GetMapping("/getById")
	public ResponseEntity<?> getEmployeeById(@RequestParam(name = "id") String id) {
		return new ResponseEntity<Employee>(service.getEmployeeById(Long.parseLong(id)), HttpStatus.OK);
	}
	
	

}