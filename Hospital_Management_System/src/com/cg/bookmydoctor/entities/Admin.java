package com.cg.bookmydoctor.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Admin")
public class Admin implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="adminId")
	int adminId;
	
	@Column(name="adminName")
	String adminName;
	
	@Column(name="contactNumber")
	String contactNumber;
	
	@Column(name="email")
	String email;
	
	@Column(name="password")
	String password;
	public Admin(){
		super();
	}
	public Admin(int adminId, String adminName, String contactNumber, String email, String password) {
		super();
		this.adminId = adminId;
		this.adminName = adminName;
		this.contactNumber = contactNumber;
		this.email = email;
		this.password = password;
	}
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
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
	

}
