package com.cg.bookmydoctor.dao;

import java.time.LocalDate;

import java.util.List;		

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.cg.bookmydoctor.entities.Appointment;
import com.cg.bookmydoctor.entities.Doctor;
import com.cg.bookmydoctor.entities.Patient;
import com.cg.bookmydoctor.exception.PatientException;

public class PatientRepositoryImpl implements IPatientRepository {

	EntityManager entityManager ;
	
	public PatientRepositoryImpl(){
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPA-PU");
		entityManager = entityManagerFactory.createEntityManager();
	}
	
	@Override
	public Patient addPatient(Patient bean) throws PatientException{
		if(bean != null){
			entityManager.getTransaction().begin();
			entityManager.persist(bean);
			entityManager.getTransaction().commit();
		}
		return bean;
	}

	@Override
	public Patient updatePatientDetails(Patient bean) throws PatientException {
	    if(bean !=null){
	    	entityManager.getTransaction().begin();
	    	entityManager.merge(bean);
	    	entityManager.getTransaction().commit();
	    }
	    return bean;
		
	}

	@Override
	public Patient removePatientDetails(Patient bean) throws PatientException{
	    if(bean != null){
		entityManager.getTransaction().begin();
		entityManager.remove(bean);
		entityManager.getTransaction().commit();
	    }
	    return bean;
	}

	@Override
	public Patient getPatient(Patient bean) throws PatientException{
		if(bean != null){
		entityManager.getTransaction().begin();	
		bean = entityManager.merge(bean);
		entityManager.getTransaction().commit();
		}
		return bean;
	}

	@Override
	public List<Patient> getAllPatient() throws PatientException{
		entityManager.getTransaction().begin();
		TypedQuery<Patient> patient = entityManager.createQuery("Select p from Patient p",Patient.class);
		List<Patient> list = patient.getResultList();
		entityManager.getTransaction().commit();
		return list;
	}

	@Override
	public List<Patient> getPatientListByDoctor(Doctor doctor) throws PatientException{
		List<Patient> list = null;
		String name = doctor.getDoctorName();
        if(doctor !=null){
        	entityManager.getTransaction().begin();
            TypedQuery<Patient> patients = entityManager.createQuery("Select p from Appointment a Join a.patient p Join a.doctor d Where d.doctorName= :doc",Patient.class);
            patients.setParameter("doc",doctor.getDoctorName());
            list = patients.getResultList();
        	entityManager.getTransaction().commit();
        }
		
		return list;
	}

	@Override
	public List<Patient> getPatientListByDate(LocalDate appdate) throws PatientException{
	    
		List<Patient> list = null;
		if(appdate != null){
			entityManager.getTransaction().begin();
			TypedQuery<Patient> patients = entityManager.createQuery(" Select p From Appointment a Join a.patient p where a.appointmentDate = :date ",Patient.class); 
			patients.setParameter("date",appdate);
			list= patients.getResultList();
			entityManager.getTransaction().commit();
		}
		return list;
	}

}
