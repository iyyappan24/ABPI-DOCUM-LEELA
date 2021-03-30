package com.cg.bookmydoctor.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

@Entity
@Table(name="Doctor")
public class Doctor implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="doctorId")
	int doctorId;
	
	@Column(name="doctorName")
	String doctorName;
	
	@Column(name="speciality")
	String speciality;
	
	@Column(name="location")
	String location;
	
	@Column(name="hospitalName")
	String hospitalName;
	
	@Column(name="mobileNo")
	String mobileNo;
	
	@Column(name="email")
	String email;
	
	@Column(name="password")
	String password;
	
	@Column(name="chargedPerVisit")
	double chargedPerVisit;

	
	public Doctor(){
		super();
	}

	public int getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getChargedPerVisit() {
		return chargedPerVisit;
	}

	public void setChargedPerVisit(double chargedPerVisit) {
		this.chargedPerVisit = chargedPerVisit;
	}
     

}
