package com.cg.Info.Repository;
import java.util.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.Info.Entity.Employee;
import com.cg.Info.Entity.EmployeeDetails;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    
	@Query("select e from EmployeeDetails ed join ed.emp e where ed.designation= :s")
	List<Employee> getEmployeeBySales(@Param("s") String st);
    
	@Query("select e from Employee e where e.id = :d")
	Employee getById(@Param("d") int id);
	
	@Query("select ed from EmployeeDetails ed join ed.emp e where e.id= :f")
	EmployeeDetails getBy(@Param("f") int g);


}
