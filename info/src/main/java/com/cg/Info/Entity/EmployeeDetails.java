package com.cg.Info.Entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;


@Entity
@Table(name="EmployeeDetails")
public class EmployeeDetails implements Serializable{
    
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="DetailsId")
	int detailsId;
	
	@Column(name="Age")
	int age;
	
	@Column(name="Designation")
	String designation;
	
	@Column(name="Location")
	String location;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="EmployeeId")
	Employee emp;
	
	
	public EmployeeDetails(){
		
	}


	public int getDetailsId() {
		return detailsId;
	}


	public void setDetailsId(int detailsId) {
		this.detailsId = detailsId;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getDesignation() {
		return designation;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}

    @JsonBackReference
	public Employee getEmp() {
		return emp;
	}


	public void setEmp(Employee emp) {
		this.emp = emp;
	}


	@Override
	public String toString() {
		return "EmployeeDetails [detailsId=" + detailsId + ", age=" + age + ", designation=" + designation
				+ ", location=" + location + ", emp=" + emp + "]";
	}
	
	
	
	
}
