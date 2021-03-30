package com.cg.bookmydoctor.Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.cg.bookmydoctor.dao.IPatientRepository;
import com.cg.bookmydoctor.dao.PatientRepositoryImpl;
import com.cg.bookmydoctor.entities.Patient;
import com.cg.bookmydoctor.service.IPatientService;
import com.cg.bookmydoctor.service.PatientServiceImpl;

public class Implementation {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		IPatientService patientService = new PatientServiceImpl();
        int temp=0;
        Patient patient = null; 
	    while(temp==0){
	    List<Patient> list = null;
	    
	    try{	
	    list = patientService.getAllPatient();
	    }
	    catch(Exception e){
	    	e.getMessage();
	    }
	    
        System.out.println("1. Adding");
	    System.out.println("2. Update");
	    System.out.println("3. Remove");
	    System.out.println("4. View");
	    System.out.println("5. ViewAll");
	    
	    
	    System.out.println("Enter the choice : ");
	    
	    int choice = sc.nextInt();
	    sc.nextLine();
	   
	    switch(choice){
	    
	    case 1 :
	    	System.out.println("Enter Patient name : ");
	 		String name = sc.nextLine();
	 		System.out.println("Enter mobile no : ");
	 		String mob = sc.nextLine(); 
	 		System.out.println("Enter email : ");
	 		String email = sc.nextLine();
	 		System.out.println("Enter password : ");
	 		String password = sc.nextLine();
	 		System.out.println("Enter blood group");
	 	    String blood  = sc.nextLine();
	 	    System.out.println("Enter gender : ");
	 	    String gender = sc.nextLine();
	 	    System.out.println("Enter age : ");
	 	    int age = sc.nextInt();
	 	    sc.nextLine();
	 	    System.out.println("Enter address : ");
	 	    String address = sc.nextLine();
	 	  
	 	    patient = new Patient();
	 	    
	 	    patient.setPatientName(name);
	 	    patient.setMobileNo(mob);
	 	    patient.setEmail(email);
	 	    patient.setPassword(password);
	 	    patient.setBloodGroup(blood);
	 	    patient.setGender(gender);
	 	    patient.setAge(age);
	 	    patient.setAddress(address);
	 	    try{
	 	    patient = patientService.addPatient(patient);      //adding the patient
	 	    }
	 	    catch(Exception e){
	 	    	e.getMessage();
	 	    }
	 	    System.out.println("Patient deatils");
	 	    System.out.println("Name      :"+patient.getPatientName());
	 	    System.out.println("Id        :"+patient.getPatientId());
	 	    System.out.println("Mobile number : "+patient.getMobileNo());
	 	    System.out.println("Age       :"+patient.getAge());
	 	    System.out.println("email     :"+patient.getEmail());
	 	    System.out.println("gender    :"+patient.getGender());
	 	    System.out.println("password  :"+patient.getPassword());
	 	    System.out.println("blood group :"+patient.getBloodGroup());
	 	    System.out.println("Address   :"+patient.getAddress());
	 	    break;
	 	    
	    case 2:
	    	int count=0;
            System.out.println("Enter the id :");
            int id=0;
            try{
            id = sc.nextInt();
            }
            catch(Exception e){
            }
            sc.nextLine();
            for(Patient p : list){
            if(id==p.getPatientId()){
            		count = 1;
            		System.out.println("Enter the name : ");
        	 	    String newname = sc.nextLine();
        	 	    System.out.println("Enter the mobile number : ");
        	 	    String newmob = sc.nextLine();
        	 	    System.out.println("Enter the age : ");
        	 	    int newage = sc.nextInt();
        	 	    sc.nextLine();
        	 	    System.out.println("Enter the address :");
        	 	    String newaddress = sc.nextLine();
        	 	    System.out.println("Enter the email : ");
        	 	    String newemail = sc.nextLine();
        	 	    System.out.println("Enter the password : ");
        	 	    String newpassword = sc.nextLine();
        	 	    
        	 	    p.setPatientName(newname);
        	 	    p.setMobileNo(newmob);
        	 	    p.setAge(newage);
        	 	    p.setAddress(newaddress);
        	 	    p.setEmail(newemail);
        	 	    p.setPassword(newpassword);
        	 	    
        	 	    try{
        	 	    patient = patientService.updatePatientDetails(p);   //updating the patient
        	 	    }
        	 	    catch(Exception e){
        	 	    	e.getMessage();
        	 	    }
                    }
           }
            if(count==1){
            	    System.out.println("Updated name    :"+patient.getPatientName());
     	 	        System.out.println("Updated age     :"+patient.getAge());
  	 	            System.out.println("Updated mobile number :"+patient.getMobileNo());
  	 	            System.out.println("updated address :"+patient.getAddress());
                    System.out.println("updated email   :"+patient.getEmail());
                    System.out.println("updated password: "+patient.getPassword());
            }
            else{
            	System.out.println("Incorrect details");
            }
            break;
	 	    
	    case 3:
	       int temporary=0;
           System.out.println("Enter the id :");
           int Id=0;
           try{
           Id = sc.nextInt();
           }
           catch(Exception e){
        	 
           }
           sc.nextLine();
           for(Patient p : list){
                  if(Id==p.getPatientId()){
                       temporary =1;
                       try{
	 	               patient = patientService.removePatientDetails(p);         //removing the patient
                       }
                       catch(Exception e){
                    	   e.getMessage();
                       }
	 	               System.out.println("Patient with id "+ Id +" is removed successfully");
	 	               
                   }
           }
           
           if(temporary==1){
        	   
        	   List<Patient> remaining = patientService.getAllPatient();
        	   if(remaining.size()>0){
        	          System.out.println("Remaining");   
        	          for(Patient bean : remaining){
        		      System.out.println(bean);          //remaining patient
        	   }
        	   }
        	   else{
        		   System.out.println("Remaining there are no records");
        	   }
           }
           else{
        	   System.out.println("Incorrect details ");
           }
           
           break;
	    
	    case 4:
	    	int var = 0;
	    	System.out.println("Enter the id:");
	        int ID=0;
	        try{
	    	ID = sc.nextInt();
	        }
	        catch(Exception e){
	        }
	        sc.nextLine();
	    	for(Patient p : list){
	    		
	    	      if(ID==p.getPatientId()){
	    	    	  var=1;
	    	          System.out.println("View");
	    	          try{
	    	          patient = patientService.getPatient(p);    //getting the patient
	    	          }
	    	          catch(Exception e){
	    	        	  e.getMessage();
	    	          }
	    	          System.out.println(patient);	    	
	    	     }
	    	}
	        if(var==0){
	        	System.out.println("Incorrect details");
	        }
	    	break;
	    	
	    case 5:
	    	if(list.size()>0){
	    	     System.out.println("View all");
	    	     List<Patient> listofPatients=null;
	    	     try{
	    	     listofPatients = patientService.getAllPatient();   //fetching all patients
	    	     }
	    	     catch(Exception e){
	    		      e.getMessage();
	    	     }
	    	
	    	     for(Patient bean : listofPatients){
	    		            System.out.println(bean);
	    	     }
	    	}
	    	else{
	    		System.out.println("No records found");
	    	}
            break;
	}   //end of switch	    
	 
	  System.out.println("Do you want to continue(yes/no):");
      String pick = sc.nextLine();
      if(pick.equalsIgnoreCase("no")){
    	  temp=1;
      }
	 
    }  // end of while loop
  }   // end of main
}// end of class