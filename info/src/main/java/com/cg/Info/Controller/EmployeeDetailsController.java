package com.cg.Info.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.Info.Entity.EmployeeDetails;
import com.cg.Info.Service.EmployeeDetailsService;

@RestController
@RequestMapping("/empDetails")
public class EmployeeDetailsController {

	@Autowired
	EmployeeDetailsService empDetailsService;
	
	@GetMapping("/getBy/{id}")
	public ResponseEntity<Object> getBy(@PathVariable("id") int id){
		
          EmployeeDetails em  = empDetailsService.getDetails(id);
          return new ResponseEntity<>(em,HttpStatus.OK);
	}
	
	
}
