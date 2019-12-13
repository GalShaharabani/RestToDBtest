package com.company.ClassAssignmentREST.beans;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Job {
	private long id;
	private String description;
	private Date endDate;
	

	public Job() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Job(String description, Date endDate) {
		this.description = description;
		this.endDate = endDate;
	}


	public Job(long id, String description, Date endDate) {
		this.id = id;
		this.description = description;
		this.endDate = endDate;
	}


	@Id
	@GeneratedValue
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	@Column
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Column
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	@Override
	public String toString() {
		return "Job [id=" + id + ", description=" + description + ", endDate=" + endDate + "]";
	}
}
