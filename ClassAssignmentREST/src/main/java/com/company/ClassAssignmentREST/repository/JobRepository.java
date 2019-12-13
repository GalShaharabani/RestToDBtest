package com.company.ClassAssignmentREST.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.company.ClassAssignmentREST.beans.Job;

public interface JobRepository extends JpaRepository<Job, Long> {

	List<Job> findJobByEndDate(Date endDate);
	List<Job> findJobByEndDateBetween(Date startDate, Date endDate);
	
}
