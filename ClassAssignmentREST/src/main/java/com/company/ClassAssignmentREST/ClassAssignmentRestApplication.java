package com.company.ClassAssignmentREST;

import java.sql.Date;
import java.util.Arrays;
import java.util.List;

import org.apache.naming.java.javaURLContextFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.client.RestTemplate;

import com.company.ClassAssignmentREST.beans.Employee;
import com.company.ClassAssignmentREST.beans.Job;
import com.company.ClassAssignmentREST.util.DateUtil;

@SpringBootApplication
public class ClassAssignmentRestApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(ClassAssignmentRestApplication.class, args);
		
		System.out.println("סע");
//		CompanyService company=ctx.getBean(CompanyService.class);
//		
		Job job1=new Job("java",DateUtil.convertStringDateToSqlDate(28, 02, 2019));
		Job job2=new Job("python",DateUtil.convertStringDateToSqlDate(28, 02, 2019));
		List<Job>jobs=Arrays.asList(job1,job2);
//		Employee employee=new Employee(1122331562, "moshe", 50000.00, jobs);
//		company.addEmployee(employee);
		
		Employee employee=ctx.getBean(Employee.class);
		
		employee.setId(555566221);
		employee.setName("avram");
		employee.setSalary(300000.00);
		
		RestTemplate restTemplate = new RestTemplate();
		System.out.println(restTemplate.getForObject("http://localhost:8080/company/getAll2", String.class));
		System.out.println(restTemplate.postForObject("http://localhost:8080/company/addEmployee",employee, String.class));
		System.out.println(restTemplate.getForObject("http://localhost:8080/company/getById/4", String.class));
		System.out.println(restTemplate.getForObject("http://localhost:8080/company/getById/1", String.class));
		System.out.println(restTemplate.getForObject("http://localhost:8080/company/getByName?name=avram", String.class));
		
	}

}
