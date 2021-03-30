package com.cg.Info.Service;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.Info.Entity.Employee;
import com.cg.Info.Entity.EmployeeDetails;
import com.cg.Info.Repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository empDao;
    
	
	public Employee add(Employee e) {
		Employee em = empDao.saveAndFlush(e);
		return em;
	}
	
	public List<Employee> getEmployeeBySales(){
		String s = "sales";
		List<Employee> lis = empDao.getEmployeeBySales(s);
		return lis;
	}
	
	
	public Employee getEmployee(int id) {
	Employee e = empDao.getById(id);
	return e;
	}
	
	
	
}
