package com.cg.bookmydoctor.service;

import java.time.LocalDate;

import java.util.List;

import com.cg.bookmydoctor.dao.IPatientRepository;
import com.cg.bookmydoctor.dao.PatientRepositoryImpl;
import com.cg.bookmydoctor.entities.Doctor;
import com.cg.bookmydoctor.entities.Patient;
import com.cg.bookmydoctor.exception.PatientException;

public class PatientServiceImpl implements IPatientService{

	IPatientRepository dao;
	
	public PatientServiceImpl(){
		dao = new PatientRepositoryImpl();
	}
	
	@Override
	public Patient addPatient(Patient bean) throws PatientException{
		return dao.addPatient(bean);
	}

	@Override
	public Patient updatePatientDetails(Patient bean) throws PatientException{
	    return dao.updatePatientDetails(bean);
	}

	@Override
	public Patient removePatientDetails(Patient bean) throws PatientException{
	    return dao.removePatientDetails(bean);
	}

	@Override
	public Patient getPatient(Patient bean) throws PatientException{
		return dao.getPatient(bean);
	}

	@Override
	public List<Patient> getAllPatient() throws PatientException{
	     return dao.getAllPatient();
	}

	@Override
	public List<Patient> getPatientListByDate(LocalDate appdate) throws PatientException{
         return dao.getPatientListByDate(appdate);
	}

	@Override
	public List<Patient> getPatientListByDoctor(Doctor doctor) throws PatientException{
	     return dao.getPatientListByDoctor(doctor);
	}

}
