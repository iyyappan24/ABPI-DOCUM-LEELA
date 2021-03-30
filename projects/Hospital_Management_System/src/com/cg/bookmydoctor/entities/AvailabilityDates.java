package com.cg.bookmydoctor.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="AvailabilityDates")
public class AvailabilityDates implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="availabilityId")
	int availabilityId;
	
	Doctor doctor;
	
	@Column(name="fromDate")
	LocalDate fromDate;
	
	@Column(name="endDate")
	LocalDate endDate;

	public AvailabilityDates(){
		super();
	}

	public AvailabilityDates(int availabilityId, Doctor doctor, LocalDate fromDate, LocalDate endDate) {
		super();
		this.availabilityId = availabilityId;
		this.doctor = doctor;
		this.fromDate = fromDate;
		this.endDate = endDate;
	}

	public int getAvailabilityId() {
		return availabilityId;
	}

	public void setAvailabilityId(int availabilityId) {
		this.availabilityId = availabilityId;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public LocalDate getFromDate() {
		return fromDate;
	}

	public void setFromDate(LocalDate fromDate) {
		this.fromDate = fromDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	
}
