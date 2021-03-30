package com.cg.bookmydoctor.dao;

import java.time.LocalDate;
import java.util.List;

import com.cg.bookmydoctor.entities.Patient;
import com.cg.bookmydoctor.exception.PatientException;
import com.cg.bookmydoctor.entities.Doctor;

public interface IPatientRepository {

	Patient addPatient(Patient bean) throws PatientException;
	Patient updatePatientDetails(Patient bean) throws PatientException;
	Patient removePatientDetails(Patient bean) throws PatientException;
	Patient getPatient(Patient bean) throws PatientException;
	List<Patient> getAllPatient() throws PatientException;
	List<Patient> getPatientListByDoctor(Doctor doctor) throws PatientException;
	List<Patient> getPatientListByDate(LocalDate appdate) throws PatientException;

	
}
