package com.cg.Info.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.Info.Entity.EmployeeDetails;
import com.cg.Info.Repository.EmployeeDetailsRepository;

@Service
public class EmployeeDetailsService {
	
	@Autowired
	EmployeeDetailsRepository empDetailsDao;
	
	
	public EmployeeDetails getDetails(int id) {
		EmployeeDetails ep = empDetailsDao.getBy(id);
		return ep;
		}

}
