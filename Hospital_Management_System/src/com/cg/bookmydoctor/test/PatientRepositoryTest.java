package com.cg.bookmydoctor.test;

import static org.junit.Assert.*;


import java.util.regex.Pattern;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cg.bookmydoctor.dao.IPatientRepository;
import com.cg.bookmydoctor.dao.PatientRepositoryImpl;
import com.cg.bookmydoctor.entities.Patient;

public class PatientRepositoryTest {
	
    IPatientRepository repository = new PatientRepositoryImpl();
    Patient patient = new Patient();
	
	@Test
	public void testAddPatient1(){
		patient = new Patient();
		patient.setPatientName("iyyappan");
		patient.setPassword("yani");
		patient.setMobileNo("9654317891");
		patient.setGender("male");
		patient.setEmail("iyyappan@gmail.com");
		patient.setBloodGroup("o+");
		patient.setAge(21);
		patient.setAddress("trichy");
		assertEquals("Inserted successfully",patient,repository.addPatient(patient));
	}
	public void testAddPatient2(){
		String regex="[0-9]{10}";
		boolean result = Pattern.matches(regex, repository.addPatient(patient).getMobileNo());
		assertTrue(result);
	}
	public void testAddPatient3(){
		boolean result = repository.addPatient(patient).getAge() >1;
		assertTrue(result);
		
	}
    
	@Test
	public void testUpdatePatientDetails() {
		patient.setPatientName("riya");
		patient.setAge(24);
		patient.setAddress("chennai");
		assertEquals("Updated successfully",patient,repository.updatePatientDetails(patient));
	    assertEquals(patient.getPatientId(),repository.updatePatientDetails(patient).getPatientId());	
	}
	
	@Test
	public void testGetPatientTest(){
		
            patient= repository.getPatient(patient);
	        assertNotNull(patient);
	        assertTrue(patient.getPatientId()>0);
	}

	@Test
	public void testRemovePatientDetails() {
         
		assertEquals("Removed successfully",patient.getAddress(),repository.removePatientDetails(patient).getAddress());
	}

	
}
