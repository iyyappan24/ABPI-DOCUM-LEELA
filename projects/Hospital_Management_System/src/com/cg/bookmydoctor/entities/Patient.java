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
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

@Entity
@Table(name="Patient_details")
public class Patient implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id")
	int patientId ;
	
    @Column(name="patientName")
	String patientName;
	
    @Column(name="mobileNo")
	String mobileNo;
	
    @Column(name="email")
	String email;
	
    @Column(name="password")
	String password;
	
    @Column(name="bloodGroup")
	String bloodGroup;
	
    @Column(name="gender")
	String gender;
	
    @Column(name="age")
	int age;
	
    @Column(name="address")
	String address;
    
    public Patient(){
    	super();
    }
    
    
    
	public Patient(String patientName, String mobileNo, String email, String password, String bloodGroup,
			String gender, int age, String address) {
		super();
		this.patientName = patientName;
		this.mobileNo = mobileNo;
		this.email = email;
		this.password = password;
		this.bloodGroup = bloodGroup;
		this.gender = gender;
		this.age = age;
		this.address = address;
	}



	public int getPatientId(){
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
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

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}



	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", patientName=" + patientName + ", mobileNo=" + mobileNo
				+ ", email=" + email + ", password=" + password + ", bloodGroup=" + bloodGroup + ", gender=" + gender
				+ ", age=" + age + ", address=" + address + "]";
	}

	
    
}
