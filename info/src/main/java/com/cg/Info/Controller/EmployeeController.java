package com.cg.Info.Controller;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.Info.Entity.Employee;
import com.cg.Info.Entity.EmployeeDetails;
import com.cg.Info.Service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService empService;
	
	@PostMapping("/add")
	public ResponseEntity<Object> addEmp(@RequestBody Employee em){
		
		em.getEmpDetails().setEmp(em);
		Employee e = empService.add(em);
		return new ResponseEntity<>(e,HttpStatus.OK);
	}
	
	@GetMapping("/getSales")
	public ResponseEntity<Object> getEmp(){
		List<Employee> list  = empService.getEmployeeBySales();
		return new ResponseEntity<>(list,HttpStatus.OK);
	}
	
	@GetMapping("/getById/{id}")
	public ResponseEntity<Object> getById(@PathVariable("id") int id){
		
          Employee emp  = empService.getEmployee(id);
          return new ResponseEntity<>(emp,HttpStatus.OK);
	}
	
	
}