package com.company.ClassAssignmentREST.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.company.ClassAssignmentREST.beans.Employee;


public interface EmployeeRepository extends JpaRepository<Employee,Long>{
	List<Employee> findEmployeeByName(String name);
	Employee findEmployeeById(String id);
}