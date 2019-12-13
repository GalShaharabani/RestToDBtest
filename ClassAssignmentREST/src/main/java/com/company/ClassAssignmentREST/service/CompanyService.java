package com.company.ClassAssignmentREST.service;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.company.ClassAssignmentREST.beans.Employee;
import com.company.ClassAssignmentREST.beans.Job;
import com.company.ClassAssignmentREST.repository.EmployeeRepository;
import com.company.ClassAssignmentREST.repository.JobRepository;





@Service
public class CompanyService {

	@Autowired
	private EmployeeRepository empRepo;
	@Autowired
	private JobRepository jobRepo;
	
	public long addEmployee(Employee e){
		empRepo.save(e);
		return e.getId();
	}
	
	public Employee getEmployeeById(String empId){
		return empRepo.findById(Long.parseLong(empId)).get();
	}
	
	
	public List<Employee> getEmployeeByName(String name){
		return empRepo.findEmployeeByName(name);
	}
	
	public List<Employee> getEmployees(){
		return empRepo.findAll();
	}
	
	public List<Job> getJobs(){
		return jobRepo.findAll();
	}

	public List<Job> getJobs(Date endDate){
		return jobRepo.findJobByEndDate(endDate);
	}
	
	public List<Job> getJobs(Date start, Date end){
		return jobRepo.findJobByEndDateBetween(start, end);
	}
	

}